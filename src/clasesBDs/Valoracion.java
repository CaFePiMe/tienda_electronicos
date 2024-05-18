package clasesBDs;

public class Valoracion extends CBDAbstract {
	
	private int valoracion;
	private String comentario;
	
	public Valoracion() {
		setBase();
	}
	
	public Valoracion(int valoracion, String comentario) {
		setBase();
		this.valoracion = valoracion;
		this.comentario = comentario;
	}
	
	public void setBase() {
		this.setNombreTabla("valoracion");
		this.setCampoClavePrimaria("id_val");
		this.setCampoExistencial("activo");
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	public String getComentario() {
		return this.comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}