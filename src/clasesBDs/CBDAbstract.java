package clasesBDs;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

public abstract class CBDAbstract {
	
	protected Integer primaryKey;
	private String campoExistencial;
	private String nombreTabla;
	private String CampoClavePrimaria;

	public String getCampoClavePrimaria() {
		return CampoClavePrimaria;
	}

	public void setCampoClavePrimaria(String CampoClavePrimaria) {
		this.CampoClavePrimaria = CampoClavePrimaria;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public Integer getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Integer pk) {
		primaryKey = pk;
	}

	public String getCampoExistencial() {
		return campoExistencial;
	}

	public void setCampoExistencial(String campoExistencial) {
		this.campoExistencial = campoExistencial;
	}
	
}
