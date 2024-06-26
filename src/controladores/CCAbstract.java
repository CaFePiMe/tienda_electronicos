package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;

public abstract class CCAbstract<M extends CBDAbstract> {

	protected String nombreTabla;
	protected ArrayList<String> columnaLista;
	protected String campoClavePrimaria;

	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public ResultSet rs;
	public PreparedStatement ps;
	public Statement st;
	public String sql;
	public int numRegistros = 0; 
	
	public CCAbstract() {
        this.columnaLista = new ArrayList<>();
    }
	
	public int borrarRegistro(M mdl) {
		sql = "UPDATE " + mdl.getNombreTabla() + " SET activo = 0 WHERE "
				+ mdl.getCampoClavePrimaria() + " = " + mdl.getPrimaryKey() + "";
		int opcion = 0;
		try {
			opcion = ConexionBD.getStatement().executeUpdate(sql);
			ConexionBD.cerrarEnlacesConexion(ConexionBD.SOLO_STATEMENT);
		} catch (SQLException ex) {
			Logger.getLogger(CCAbstract.class.getName()).log(Level.SEVERE, null, ex);
		}

		return opcion;
	}
	
	public int upDateRegistro(M mdl, String columna, String id) {
		sql = "UPDATE " + mdl.getNombreTabla() + " SET " + columna + " = " + id + " WHERE "
				+ mdl.getCampoClavePrimaria() + " = " + mdl.getPrimaryKey() + "";
		System.out.println(sql);
		int opcion = 0;
		try {
			opcion = ConexionBD.getStatement().executeUpdate(sql);
			ConexionBD.cerrarEnlacesConexion(ConexionBD.SOLO_STATEMENT);
		} catch (SQLException ex) {
			Logger.getLogger(CCAbstract.class.getName()).log(Level.SEVERE, null, ex);
		}

		return opcion;
	}
	
	public int lastID() {
		try {
			sql = "SELECT * FROM " + this.nombreTabla + " WHERE " + this.campoClavePrimaria + " = (SELECT MAX(" + this.campoClavePrimaria + ") FROM " + this.nombreTabla + ");";
		    ps = conexion.prepareStatement(sql);
	        rs = ps.executeQuery();
	        if (rs.next()) {
		        M r = this.llenar(rs);
		        return r.getPrimaryKey();
	        }
	        return (Integer) null;
		} catch (SQLException e) {
			System.err.println("Error al obtener registro: " + e.getMessage());
            e.printStackTrace();
            return (Integer) null;
	    }
	}
	
	public void crearRegistro(String valores) {
		try {
			String cn = String.join(", ", this.columnaLista);
			sql = "INSERT INTO " + this.nombreTabla + "(" + cn + ")"
					+ "	VALUES ( " + (this.lastID()+1) + ", " + valores + ");";
	        ps = conexion.prepareStatement(sql);
	        System.out.println(sql);
	        ps.executeQuery();
			
		} catch (SQLException e) {
			System.err.println("Error al crear registro: " + e.getMessage());
            e.printStackTrace();
	    }
	}
	
	public M getRegistro(String columna, String id) {
		
		try {
			sql = "SELECT * FROM " + this.nombreTabla + " WHERE " + columna + " = " + id + " AND activo = 1;";
	        ps = conexion.prepareStatement(sql);
	        System.out.println(sql);
	        rs = ps.executeQuery();
	        if (rs.next()) {
		        M r = this.llenar(rs);
		        return r;
	        }
	        return null;
		} catch (SQLException e) {
			System.err.println("Error al obtener registro: " + e.getMessage());
            e.printStackTrace();
            return null;
	    }
	}
	
	public ArrayList<M> getRegistroList(String columna, String id) {
		
		try {
			
			ArrayList<M> uss = new ArrayList<>();
			sql = "SELECT * FROM " + this.nombreTabla + " WHERE " + columna + " = " + id + " AND activo = 1;";
	        ps = conexion.prepareStatement(sql);
	        System.out.println(sql);
	        rs = ps.executeQuery();

        	while (rs.next()) {
    	        if (rs.getInt("activo") == 1) {
		            uss.add(this.llenar(rs));
    	        }
        	}
	        return uss;
		} catch (SQLException e) {
            System.err.println("Error al obtener lista de registros: " + e.getMessage());
            e.printStackTrace();
            return null;
	    }
	}
	
public ArrayList<M> getAllARegistros() {
		
		try {
			
			ArrayList<M> uss = new ArrayList<>();
			sql = "SELECT * FROM " + this.nombreTabla + ";";
	        ps = conexion.prepareStatement(sql);
	        rs = ps.executeQuery();

        	while (rs.next()) {
    	        if (rs.getInt("activo") == 1) {
		            uss.add(this.llenar(rs));
    	        }
        	}
	        return uss;
		} catch (SQLException e) {
            System.err.println("Error al obtener lista de registros: " + e.getMessage());
            e.printStackTrace();
            return null;
	    }
	}

    protected abstract M llenar(ResultSet rs);
}