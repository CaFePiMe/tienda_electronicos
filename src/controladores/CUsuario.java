package controladores;

import java.sql.Connection;
import java.sql.SQLException;
import adminBD.ConexionBD;
import clasesBDs.Usuario;

public class CUsuario extends CCAbstract {
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CUsuario() {}
	
	public void addUsuario(Usuario usuario) throws SQLException {
		
	    sql = "INSERT INTO usuario (id_usu, email, nombre, password, nit, admin, activo)"
	    		+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
	    try {
	        ps = conexion.prepareCall(sql);
	        ps.setInt(1, usuario.getPrimaryKey());
	        ps.setString(2, usuario.getEMail());
	        ps.setString(3, usuario.getNombre());
	        ps.setString(4, usuario.getPassword());
	        ps.setInt(5, usuario.getNit());
	        ps.setBoolean(6, usuario.getAdmin());
	        ps.setString(7, usuario.getActivos());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }
	
	public Usuario getUsuario(int id) {
		
		try {
			sql = "SELECT * FROM usuario WHERE id_usu = ?;";
	        ps = conexion.prepareCall(sql);
	        rs = ps.executeQuery();
	        
	        if (rs.getString("activo").equals("activo")) {
	        	
	            String email = rs.getString("email");
	            String nombre = rs.getString("nombre");
	            String password = rs.getString("password");
	            int nit = rs.getInt("nit");
	            boolean admin = rs.getBoolean("admin");
	            Usuario us = new Usuario(email, nombre, password, nit, admin);
	        	
	            return us;
	        } else {
	        	return null;
	        }
	        
		} catch (SQLException e) {
	    	e.printStackTrace();
	    	return null;
	    }
	}
}
