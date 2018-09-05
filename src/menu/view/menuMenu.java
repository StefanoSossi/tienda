package menu.view;

import java.util.Scanner;

import categoria.view.CategoriaView;
import producto.view.InputTypes;
import producto.view.ProductoView;

public class menuMenu {

	
	private static int encabezado (Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion; ");
			System.out.println("------------------- ");
			System.out.println("1.  Categorias");
			System.out.println("2.  Productos");
			
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("¿Su opcion?", scanner);
			
			if(opcion >= 0 && opcion <=2) {
				return opcion;
			}
		}
	}
	public static void menu (Scanner scanner, ProductoView productosView, CategoriaView categoriasView) {
		boolean salir = false;
		while(!salir) {
			switch(encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				
				categoria.view.CategoriaMenu.menu(scanner, categoriasView);
				  
			
				break;
			case 2:
				producto.view.ProductoMenu.menu(scanner, productosView);
				break;
			
			
			}
		}
		
		
	}
	
}
