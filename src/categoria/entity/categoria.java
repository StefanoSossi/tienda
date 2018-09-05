package categoria.entity;

public class categoria {

	private String nombre;
	private int codCategoria;
	private String descripcion;
	
	public categoria( String nombre, int codCategoria, String descipcion) {
		super();
		this.descripcion= descipcion;
		this.nombre = nombre;
		this.codCategoria = codCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "categoria [nombre=" + nombre + ", codCategoria=" + codCategoria + ", descripcion=" + descripcion + "]";
	}

}
