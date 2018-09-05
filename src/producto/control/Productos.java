package producto.control;

import producto.entity.Producto;

public class Productos {
	
	private Producto[] productos;
	private int cantidad;
	private int ultimo;
	
	public Productos (int tamaño) {
		productos = new Producto[tamaño];
		cantidad = 0;
		ultimo = -1;
	}
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
			productos[++ultimo]=producto;
			cantidad++;
	}
	public void eliminar(int codProducto) {
		int indice = buscar(codProducto);
		if(indice>=0) {
			if(indice!=ultimo) {
				for(int i=indice; i<=ultimo;i++) {
//					recorrer todos los elementos a partir de i
					productos[i]=productos[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}
		
	}
	private int buscar(int codProducto) {
		int posicion = -1;
		
		for(int indice=0; posicion<=productos.length;posicion++) {
			if(productos[indice].getCodProducto()==codProducto) {
				posicion=indice;
				break;
			}
		}
		return posicion;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	
}
