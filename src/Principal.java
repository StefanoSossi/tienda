
 
import java.util.Scanner;

import categoria.control.categorias;

import categoria.view.CategoriaView;
import excepciones.entity.CategoriaFantasma;
import producto.control.Productos;
import producto.view.ProductoView;

public class Principal {
  public static void main(String[] args) throws CategoriaFantasma{

	  Scanner scanner = new Scanner(System.in);
	  categorias categorias = new categorias(10);
	  Productos productos = new Productos(10);
	 
	  ProductoView productosView = new ProductoView(productos, categorias, scanner);
	  CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
	  
	  menu.view.menuMenu.menu(scanner, productosView, categoriasView);
	  scanner.close();
	  
	  
	  
  }
}
