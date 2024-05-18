package clasesBDs;

public class Producto extends CBDAbstract {
	
	private String nombre;
	private String descripcion;
	private String imagen;
	private int stock;
	private double precio;
	
	public Producto() {
		setBase();
	}
	
	public Producto(String nombre, String descripcion, String imagen, int stock, double precio) {
		setBase();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.stock = stock;
		this.precio = precio;
	}
	
	private void setBase() {
		this.setNombreTabla("producto");
		this.setCampoClavePrimaria("id_pro");
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

	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
