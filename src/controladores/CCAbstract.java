package controladores;

<<<<<<< HEAD
import java.io.InputStream;
=======
import java.sql.Connection;
>>>>>>> 31bb8e64d69f5681e820530fe0bee3cf387db06a
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
import clasesBDs.CBDAbstract;

public abstract class CCAbstract<M extends CBDAbstract> implements CCInterface {
=======
import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;

public abstract class CCAbstract<M extends CBDAbstract> {
	
	protected String nombreTabla;

	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
>>>>>>> 31bb8e64d69f5681e820530fe0bee3cf387db06a
	
	public ResultSet rs;
	public PreparedStatement ps;
	public Statement st;
	public String sql;
<<<<<<< HEAD
	public int numRegistros = 0;
	public int finalPag = 50;
	public int inicioPag = 0;
	
	public int Registro(M mdl) {
=======
	public int numRegistros = 0; 
	
	public int borrarRegistro(M mdl) {
>>>>>>> 31bb8e64d69f5681e820530fe0bee3cf387db06a
		sql = "UPDATE " + mdl.getNombreTabla() + " SET " + mdl.getCampoExistencial() + " = 0 WHERE "
				+ mdl.getCampoClavePrimaria() + " = " + mdl.getPrimaryKey() + "";
		int opcion = 0;
		try {
<<<<<<< HEAD
			opcion = BaseConexion.getStatement().executeUpdate(sql);
			BaseConexion.cerrarEnlacesConexion(BaseConexion.SOLO_STATEMENT);
		} catch (SQLException ex) {
			Logger.getLogger(CCAbstract.class.getName()).log(Level.SEVERE, null, ex);
		}
		return opcion;
	}
	
	public void setNumPaginador(int inicio, int fin) {
		finalPag = fin;
		inicioPag = inicio;
	}
	
	public int getCantidadRegistros() {
		return numRegistros;
	}
=======
			opcion = ConexionBD.getStatement().executeUpdate(sql);
			ConexionBD.cerrarEnlacesConexion(ConexionBD.SOLO_STATEMENT);
		} catch (SQLException ex) {
			Logger.getLogger(CCAbstract.class.getName()).log(Level.SEVERE, null, ex);
		}

		return opcion;
	}
	
	public M getRegistro(String columna, int id) {
		
		try {
			sql = "SELECT * FROM ? WHERE ? = ?;";
	        ps = conexion.prepareCall(sql);
	        ps.setString(1, this.nombreTabla);
	        ps.setString(2, columna);
	        ps.setInt(3, id);
	        rs = ps.executeQuery();
	        
	        if (rs.getString("activo").equals("activo")) {
	            return this.llenar(rs);
	        } else {
	        	return null;
	        }
	        
		} catch (SQLException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
	
	public ArrayList<M> getRegistroList(String columna, int id) {
		
		try {
			
			ArrayList<M> uss = new ArrayList<>();
			sql = "SELECT * FROM ? WHERE ? = ?;";
	        ps = conexion.prepareCall(sql);
	        ps.setString(1, this.nombreTabla);
	        ps.setString(1, columna);
	        ps.setInt(2, id);
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
    
>>>>>>> 31bb8e64d69f5681e820530fe0bee3cf387db06a
}
