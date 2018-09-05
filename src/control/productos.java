package control;

import entity.producto;

public class productos {
	private producto[] productos;
	private int cantidad;
	private int ultimo;
	public productos (int tamaño){
		productos = new producto[tamaño];
		cantidad =0;
		ultimo=1;
	}
	
	public void ingresar(producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos[++ultimo]=producto;
		cantidad++;
	}
	public void eliminar (int codProducto){
		int indice=buscar(codProducto);
		if (indice>=0){
			if(indice != ultimo){
				while(indice<ultimo){
				productos[indice]=productos[indice+1];
				++indice;
				}
			}
			ultimo--;
			cantidad--;
			
		}
		
	}
	private int buscar (int codProducto){
		int pos=-1;
		
		for (int indice=0; pos<=productos.length;pos++){
		if(productos[indice].getCodProducto()==codProducto){
			pos=indice;
			break;
		}
		}
		return pos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public producto[] getProductos() {
		return productos;
	}
	
	

}
