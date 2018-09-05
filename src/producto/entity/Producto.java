package producto.entity;

public class Producto {
	
	private int codProducto;
	private String nombre;
	private double precio;
	private String descripcion;
	private int codCategoria;
	
	public Producto(int codProducto, String nombre, double precio, String descripcion, int codCategoria) {
		super();
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codCategoria = codCategoria;
	}
	
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", codCategoria=" + codCategoria + "]";
	}
	

}
