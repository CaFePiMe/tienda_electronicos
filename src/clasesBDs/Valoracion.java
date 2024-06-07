package clasesBDs;

public class Valoracion extends CBDAbstract {
	
	private int idusu;
	private int idpro;
	private int valoracion;
	private String comentario;
	
	public Valoracion() {
		setBase();
	}
	
	public Valoracion(int idusu, int idpro, int valoracion, String comentario) {
		setBase();
		this.idusu = idusu;
		this.idpro = idpro;
		this.valoracion = valoracion;
		this.comentario = comentario;
	}
	
	public void setBase() {
		this.setNombreTabla("valoracion");
		this.setCampoClavePrimaria("id_val");
		this.setActivo(1);
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