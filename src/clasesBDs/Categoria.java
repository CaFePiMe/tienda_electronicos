package clasesBDs;

public class Categoria extends CBDAbstract {
	
	private String nombre;
	private String descripcion;
	
	public Categoria() {
		setBase();
	}
	
	public Categoria(String nombre, String descripcion) {
		setBase();
	}
	
	private void setBase() {
		this.setNombreTabla("categoria");
		this.setCampoClavePrimaria("idc");
		this.setCampoExistencial("activo");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
