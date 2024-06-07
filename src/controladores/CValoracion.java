package controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import adminBD.ConexionBD;
import clasesBDs.Valoracion;

public class CValoracion extends CCAbstract<Valoracion> {
	
	ConexionBD con = new ConexionBD();
	Connection conexion = con.getConexion();
	
	public CValoracion() {
		this.nombreTabla = "valoracion";
		this.campoClavePrimaria = "id_val";
		
		this.columnaLista.add("id_val");
		this.columnaLista.add("id_usu");
		this.columnaLista.add("id_pro");
		this.columnaLista.add("valoracion");
		this.columnaLista.add("comentario");
		this.columnaLista.add("activo");
	}
	
	@Override
	protected Valoracion llenar(ResultSet r) {
		try {
			int idval = rs.getInt("id_val");
			int idusu = rs.getInt("id_usu");
			int idpro = rs.getInt("id_pro");
			int valoracion = rs.getInt("valoracion");
			String comentario = r.getString("comentario");
	        Valoracion va = new Valoracion(idusu, idpro, valoracion, comentario);
	        va.setPrimaryKey(idval);
			return va;
			
		} catch (SQLException e) {
			e.printStackTrace();
	    	return null;
		}
	}
}
