package clasesBDs;

public class Carro extends CBDAbstract {
	
	private int idcom;
	private int idpro;
	private int cantidad;
	private double precio;
	
	public Carro () {
		setBase();
	}
	
	public Carro (int idcom, int idpro, int cantidad, double precio) {
		setBase();
		this.idcom = idcom;
		this.idpro = idpro;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	private void setBase() {
		this.setNombreTabla("carro");
		this.setCampoClavePrimaria("id_car");
		this.setActivo(1);
	}
	
	public int getIDcom() {
		return idcom;
	}
	
	public void setIDcom(int idcom) {
		this.idcom = idcom;
	}
	
	public int getIDpro() {
		return idpro;
	}
	
	public void setIDpro(int idpro) {
		this.idpro = idpro;
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
