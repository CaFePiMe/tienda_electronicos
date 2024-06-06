package clasesBDs;

public class Producto extends CBDAbstract {
	
	private int idprv;
	private int idcat;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int stock;
	private double precio;
	
	public Producto() {
		setBase();
	}
	
	public Producto(int idprv, int idcat, String nombre, String descripcion, String imagen, int stock, double precio) {
		setBase();
		this.idprv = idprv;
		this.idcat = idcat;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.stock = stock;
		this.precio = precio;
	}
	
	private void setBase() {
		this.setNombreTabla("producto");
		this.setCampoClavePrimaria("id_pro");
		this.setActivo(1);
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
	
    public int getIdcat() {
        return this.idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public int getIdprv() {
        return this.idprv;
    }

    public void setIdprv(int idprv) {
        this.idprv = idprv;
    }
}
