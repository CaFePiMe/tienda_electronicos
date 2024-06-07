package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import adminBD.ConexionBD;
import clasesBDs.Carro;
import clasesBDs.Usuario;

public class CCarro extends CCAbstract {

	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CCarro() {
		this.nombreTabla = "carro";
		this.campoClavePrimaria = "id_car";
		
		this.columnaLista.add("id_car");
		this.columnaLista.add("id_pro");
		this.columnaLista.add("id_usu");
		this.columnaLista.add("cantidad");
		this.columnaLista.add("precio");
	}
	
	
	
	@Override
	public Carro llenar(ResultSet r) {
		try {
			int idcar = rs.getInt("id_car");
			int idcom = rs.getInt("id_com");
            int idpro = rs.getInt("id_pro");
            int cantidad = rs.getInt("cantidad");
            double precio = rs.getInt("precio");
            Carro ca = new Carro(idcom, idpro, cantidad, precio);
            ca.setPrimaryKey(idcar);
        	
            return ca;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}