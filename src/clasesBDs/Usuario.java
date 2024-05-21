package clasesBDs;

public class Usuario extends CBDAbstract {
	
	private String eMail;
	private String nombre;
	private String password;
	private int nit;
	private boolean admin;
	
	public Usuario() {
		setBase();
	}
	
	public Usuario( String eMail, String nombre, String password, int nit, boolean admin) {
		setBase();
		this.eMail = eMail;
		this.nombre = nombre;
		this.password = password;
		this.nit = nit;
		this.admin = admin;
	}
	
	private void setBase() {
		this.setNombreTabla("usuario");
		this.setCampoClavePrimaria("id_usu");
		this.setCampoExistencial("activo");
	}
	
	public String getEMail() {
		return eMail;
	}
	
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getNit() {
		return nit;
	}
	
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	public boolean getAdmin() {
		return admin;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
