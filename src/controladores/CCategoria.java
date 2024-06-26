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
		this.campoClavePrimaria = "id_cat";
		
		this.columnaLista.add("id_cat");
		this.columnaLista.add("nombre");
		this.columnaLista.add("descripcion");
		this.columnaLista.add("activo");
	}

	@Override
	protected CBDAbstract llenar(ResultSet rs) {
		try {
			int idcat = rs.getInt("id_cat");
			String nombre = rs.getString("nombre");
			String descripcion = rs.getString("descripcion");
            Categoria ca = new Categoria(nombre, descripcion);
            ca.setPrimaryKey(idcat);
        	
            return ca;
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}