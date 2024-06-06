package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import adminBD.ConexionBD;
import clasesBDs.Categoria;
import clasesBDs.Producto;
import clasesBDs.Usuario;

public class CProducto extends CCAbstract<Producto> {
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CProducto() {
		this.nombreTabla = "producto";
		this.campoClavePrimaria = "id_pro";
		
		this.columnaLista.add("id_pro");
		this.columnaLista.add("id_prv");
		this.columnaLista.add("id_cat");
		this.columnaLista.add("nombre");
		this.columnaLista.add("descripcion");
		this.columnaLista.add("precio");
		this.columnaLista.add("stock");
		this.columnaLista.add("imagen");
		this.columnaLista.add("activo");
	}

	@Override
	protected Producto llenar(ResultSet r) {
		try {
			int idpro = rs.getInt("id_pro");
			int idprv = rs.getInt("id_prv");
			int idcat = rs.getInt("id_cat");
	        String nombre = r.getString("nombre");
			String descripcion = r.getString("descripcion");
	        double precio = r.getDouble("precio");
	        int stock = r.getInt("stock");
	        String imagen = r.getString("imagen");
	        Producto pr = new Producto(idprv, idcat, nombre, descripcion, imagen, stock, precio);
	        pr.setPrimaryKey(idpro);
			return pr;
			
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}

}
