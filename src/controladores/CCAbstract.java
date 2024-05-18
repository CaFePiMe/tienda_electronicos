package controladores;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import adminBD.ConexionBD;
import clasesBDs.CBDAbstract;

public abstract class CCAbstract<M extends CBDAbstract> implements CCInterface {
	
	public ResultSet rs;
	public PreparedStatement ps;
	public Statement st;
	public String sql;
	public int numRegistros = 0;
	public int finalPag = 50;
	public int inicioPag = 0;
	
	public int Registro(M mdl) {
		sql = "UPDATE " + mdl.getNombreTabla() + " SET " + mdl.getCampoExistencial() + " = 0 WHERE "
				+ mdl.getCampoClavePrimaria() + " = " + mdl.getPrimaryKey() + "";
		int opcion = 0;
		try {
			opcion = ConexionBD.getStatement().executeUpdate(sql);
			ConexionBD.cerrarEnlacesConexion(ConexionBD.SOLO_STATEMENT);
		} catch (SQLException ex) {
			Logger.getLogger(CCAbstract.class.getName()).log(Level.SEVERE, null, ex);
		}
		return opcion;
	}
	
	public void setNumPaginador(int inicio, int fin) {
		finalPag = fin;
		inicioPag = inicio;
	}
	
	public int getCantidadRegistros() {
		return numRegistros;
	}
}
