package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;
import clasesBDs.Carro;
import clasesBDs.Categoria;

public class CCategoria extends CCAbstract {

	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CCategoria() {
		this.nombreTabla = "categoria";
	}
	
	public void addCategoria(Categoria categoria) throws SQLException {
		
	    sql = "INSERT INTO categoria (id_cat, nombre, descripcion, activo)"
	    		+ "VALUES (?, ?, ?, ?);";
	    try {
	        ps = conexion.prepareCall(sql);
	        ps.setInt(1, categoria.getPrimaryKey());
	        ps.setString(2, categoria.getNombre());
	        ps.setString(3, categoria.getDescripcion());
	        ps.setString(4, categoria.getActivos());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }

	@Override
	protected CBDAbstract llenar(ResultSet rs) {
		try {
			String nombre = rs.getString("nombre");
			String descripcion = rs.getString("descripcion");
            Categoria ca = new Categoria(nombre, descripcion);
        	
            return ca;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}
