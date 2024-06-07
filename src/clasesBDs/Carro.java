package clasesBDs;

public class Carro extends CBDAbstract {
	
	private int idpro;
	private int idusu;
	private int cantidad;
	private double precio;
	
	public Carro () {
		setBase();
	}
	
	public Carro (int idpro, int idusu, int cantidad, double precio) {
		setBase();
		this.idpro = idpro;
		this.idusu = idusu;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	private void setBase() {
		this.setNombreTabla("carro");
		this.setCampoClavePrimaria("id_car");
		this.setActivo(1);
	}
	
	public int getIDusu() {
		return idusu;
	}
	
	public void setIDusu(int idusu) {
		this.idusu = idusu;
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
