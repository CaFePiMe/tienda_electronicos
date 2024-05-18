package clasesBDs;

public class Carro extends CBDAbstract {
	
	private int cantidad;
	private double precio;
	
	public Carro () {
		setBase();
	}
	
	public Carro (int cantidad, double precio) {
		setBase();
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	private void setBase() {
		this.setNombreTabla("carro");
		this.setCampoClavePrimaria("idc");
		this.setCampoExistencial("activo");
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
