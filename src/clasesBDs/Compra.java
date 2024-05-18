package clasesBDs;

import java.util.Date;

public class Compra extends CBDAbstract {
	
	private double total;
	private String estado;
	private Date fecha;
	
	public Compra() {
		setBase();
	}
	
	public Compra( double total, String estado, Date fecha, int idu) {
		setBase();
		this.primaryKey = primaryKey;
		this.total = total;
		this.estado = estado;
		this.fecha = fecha;
		
	}
	
	private void setBase() {
		this.setNombreTabla("Compra");
		this.setCampoClavePrimaria("idc");
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
