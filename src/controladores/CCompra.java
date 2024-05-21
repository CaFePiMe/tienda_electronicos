package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;
import clasesBDs.Categoria;
import clasesBDs.Compra;

public class CCompra extends CCAbstract {
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CCompra() {
		this.nombreTabla = "compra";
	}
	
	public void addcompra(Compra compra) throws SQLException {
		
	    sql = "INSERT INTO compra (id_com, id_usu, total, estado, fecha, activo)"
	    		+ "VALUES (?, ?, ?, ?, ?, ?);";
	    try {
	        ps = conexion.prepareCall(sql);
	        ps.setInt(1, compra.getPrimaryKey());
	        ps.setString(2, compra.getNombre());
	        ps.setString(3, compra.getDescripcion());
	        ps.setString(4, compra.getActivos());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }

	@Override
	protected CBDAbstract llenar(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}


}
