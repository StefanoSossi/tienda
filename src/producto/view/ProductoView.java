package producto.view;

import java.util.Scanner;

import categoria.control.categorias;
import excepciones.entity.CategoriaFantasma;
import producto.control.Productos;
import producto.entity.Producto;

public class ProductoView {
	private Productos productos;
	private categorias categorias;
	private Scanner scanner;
	public ProductoView(Productos productos, categorias categorias, Scanner scanner) {
		
		this.categorias=categorias;
		this.scanner = scanner;
		this.productos= productos;
	}
	public void addProduct() throws CategoriaFantasma {
		Producto producto;
		
			producto = RegistroProducto.ingresar(scanner,categorias);
	
		productos.ingresar(producto);
				
	}
	
	
	
	public void listProduct() {
    	int codCategoria=0;
    	int indiceCategoria=0;
    	for(int i = 0; i <= productos.getCantidad(); i++) {
    		System.out.println(productos.getProductos() [i]);
    		codCategoria = productos.getProductos()[i].getCodCategoria();
    		try {
				indiceCategoria = categorias.buscar(codCategoria);
				System.out.println(categorias.getCategorias()[indiceCategoria]);
			} catch (CategoriaFantasma e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
	public void deleteProduct() {
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto", scanner);
		productos.eliminar(codProducto);	
	}
}
	
	
	

