package controladores;

import java.sql.ResultSet;

public interface CCInterface {
	public ResultSet getRegistros(String nombreTabla, String[] campos, String[] columnaId, Object[] id);

	public int actualizarRegistro(String nomTabla, String[] cnls, String columnaId, Object id);

	public int agregarRegistro(String nombreTabla, String[] campos, Object[] valores);

}
