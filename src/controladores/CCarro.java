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
		this.columnaLista.add("activo");
	}
	
	
	
	@Override
	public Carro llenar(ResultSet r) {
		try {
			int idcar = rs.getInt("id_car");
			int idpro = rs.getInt("id_pro");
            int idusu = rs.getInt("id_usu");
            int cantidad = rs.getInt("cantidad");
            double precio = rs.getInt("precio");
            Carro ca = new Carro(idpro, idusu, cantidad, precio);
            ca.setPrimaryKey(idcar);
        	
            return ca;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}