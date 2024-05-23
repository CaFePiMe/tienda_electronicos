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

	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public ResultSet rs;
	public PreparedStatement ps;
	public Statement st;
	public String sql;
	public int numRegistros = 0; 
	
	public int borrarRegistro(M mdl) {
		sql = "UPDATE " + mdl.getNombreTabla() + " SET " + mdl.getCampoExistencial() + " = 0 WHERE "
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
	
	public M getRegistro(String columna, String id) {
		
		try {
			sql = "SELECT * FROM " + this.nombreTabla + " WHERE " + columna + " =? AND activo = 'activo';";
	        ps = conexion.prepareStatement(sql);
	        ps.setString(1, id);
	        rs = ps.executeQuery();
	        if (rs.next()) {
		        M r = this.llenar(rs);
		        return r;
	        }
	        return null;
		} catch (SQLException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	public ArrayList getRegistroList(String columna, String id) {
		
		try {
			
			ArrayList<M> uss = new ArrayList<>();
			sql = "SELECT * FROM " + this.nombreTabla + " WHERE " + columna + " =? AND activo = 'activo';";
	        ps = conexion.prepareStatement(sql);
	        ps.setString(1, id);
	        rs = ps.executeQuery();

        	while (rs.next()) {
    	        if (rs.getString("activo").equals("activo")) {
		            uss.add(this.llenar(rs));
    	        }
        	}
	        return uss;
		} catch (SQLException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
    protected abstract M llenar(ResultSet rs);
}