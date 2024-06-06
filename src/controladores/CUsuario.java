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
		this.campoClavePrimaria = "id_usu";
		
		this.columnaLista.add("id_usu");
		this.columnaLista.add("email");
		this.columnaLista.add("nombre");
		this.columnaLista.add("password");
		this.columnaLista.add("nit");
		this.columnaLista.add("admin");
		this.columnaLista.add("activo");
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
			int idusu = rs.getInt("id_usu");
			String email = r.getString("email");
	        String nombre = r.getString("nombre");
	        String password = r.getString("password");
	        int nit = r.getInt("nit");
	        boolean admin = r.getBoolean("admin");
	        Usuario us = new Usuario(email, nombre, password, nit, admin);
	        us.setPrimaryKey(idusu);
			return us;
			
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
} 
