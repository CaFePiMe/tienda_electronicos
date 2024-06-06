package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;
import clasesBDs.Proveedor;

public class CProveedor extends CCAbstract{
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CProveedor() {
		this.nombreTabla = "proveedor";
		this.campoClavePrimaria = "id_prv";
		
		this.columnaLista.add("id_prv");
		this.columnaLista.add("nombre");
		this.columnaLista.add("nit");
		this.columnaLista.add("activo");
	}

	@Override
	protected CBDAbstract llenar(ResultSet rs) {
		try {
			int idcat = rs.getInt("id_prv");
			String nombre = rs.getString("nombre");
			int nit = rs.getInt("nit");
            Proveedor pr = new Proveedor(nit, nombre);
            pr.setPrimaryKey(idcat);
        	
            return pr;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}
