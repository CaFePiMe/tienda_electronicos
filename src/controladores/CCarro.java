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
	}
	
	public void addCarro(Carro carro) throws SQLException {
		
	    sql = "INSERT INTO carro (id_car, id_com, id_pro, cantidad, precio, activo)"
	    		+ "VALUES (?, ?, ?, ?, ?, ?);";
	    try {
	        ps = conexion.prepareCall(sql);
	        ps.setInt(1, carro.getPrimaryKey());
	        ps.setInt(2, carro.getIDcom());
	        ps.setInt(3, carro.getIDpro());
	        ps.setInt(4, carro.getCantidad());
	        ps.setDouble(5, carro.getPrecio());
	        ps.setString(6, carro.getActivos());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }
	
	@Override
	public Carro llenar(ResultSet r) {
		try {
			int idcom = rs.getInt("id_com");
            int idpro = rs.getInt("id_pro");
            int cantidad = rs.getInt("cantidad");
            double precio = rs.getInt("precio");
            Carro ca = new Carro(idcom, idpro, cantidad, precio);
        	
            return ca;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}
