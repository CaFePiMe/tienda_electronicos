package clasesBDs;

public class Proveedor extends CBDAbstract {
	
	private String nombre;
	private int nit;
	
	public Proveedor() {
		setBase();
	}
	
	public Proveedor(int nit, String nombre) {
		setBase();
		this.nit = nit;
		this.nombre = nombre;
	}
	
	public void setBase() {
		this.setNombreTabla("proveedor");
		this.setCampoClavePrimaria("id_prv");
		this.setCampoExistencial("activo");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNit() {
		return nit;
	}
	
	public void setNit(int nit) {
		this.nit = nit;
	}

}
