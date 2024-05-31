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
	        ps.setInt(2, compra.getIDusu());
	        ps.setDouble(3, compra.getTotal());
	        ps.setString(4, compra.getEstado());
	        ps.setDate(5, compra.getFecha());
	        ps.setInt(6, compra.getActivo());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
    }

	@Override
	protected CBDAbstract llenar(ResultSet rs) {
		try {
			int idusu = rs.getInt("id_usu");
			Double total = rs.getDouble("total");
			String estado = rs.getString("estado");
			java.sql.Date fecha = rs.getDate("fecha");
			String activo = rs.getString("activo");
            Compra co = new Compra( idusu, total, estado, fecha);
        	
            return co;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}
