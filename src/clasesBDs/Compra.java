package clasesBDs;

public class Compra extends CBDAbstract {
	
	private int idusu;
	private double total;
	private String estado;
	private java.sql.Date fecha;
	
	public Compra() {
		setBase();
	}
	
	public Compra(int idsuu, double total, String estado, java.sql.Date fecha) {
		setBase();
		this.primaryKey = primaryKey;
		this.total = total;
		this.estado = estado;
		this.fecha = fecha;
		this.idusu = idusu;
		
	}
	
	private void setBase() {
		this.setNombreTabla("Compra");
		this.setCampoClavePrimaria("id_com");
		this.setCampoExistencial("activo");
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public java.sql.Date getFecha() {
		return fecha;
	}
	
	public void setFecha(java.sql.Date fecha) {
		this.fecha = fecha;
	}
	
	public int getIDusu() {
		return idusu;
	}
	
	public void setIDusu(int idusu) {
		this.idusu = idusu;
	}
}
