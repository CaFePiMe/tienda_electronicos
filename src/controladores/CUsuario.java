package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import adminBD.ConexionBD;
import clasesBDs.Usuario;

public class CUsuario extends CCAbstract<Usuario> {
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CUsuario() {
		this.nombreTabla = "usuario";
		
		this.columnaLista.add("id_usu");
		this.columnaLista.add("email");
		this.columnaLista.add("nombre");
		this.columnaLista.add("password");
		this.columnaLista.add("nit");
		this.columnaLista.add("admin");
		this.columnaLista.add("activo");
	}
	
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
	        ps.setInt(7, usuario.getActivo());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }
	
	public Usuario checkPassword(String nombre, String password) {
		Usuario us = this.getRegistro("nombre", nombre);
		
		if (us != null && us.getPassword().equals(password)) {
			return us;
		}
		return null;
	}
	
	public ArrayList<Usuario> checkPasswordl(String nombre, String password) {
		ArrayList<Usuario> us = this.getRegistroList("nombre", nombre);
		if (us != null) {
			return us;
		}
		return null;
	}
	
	@Override
	public Usuario llenar(ResultSet r) {
		try {
			String email = r.getString("email");
	        String nombre = r.getString("nombre");
	        String password = r.getString("password");
	        int nit = r.getInt("nit");
	        boolean admin = r.getBoolean("admin");
	        Usuario us = new Usuario(email, nombre, password, nit, admin);
			return us;
			
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
} 
