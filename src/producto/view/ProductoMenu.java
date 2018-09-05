package producto.view;

import java.util.Scanner;

import excepciones.entity.CategoriaFantasma;

public class ProductoMenu {
	
	private static int encabezado (Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion; ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Producto");
			System.out.println("2. Listar Productos");
			System.out.println("3. Eliminar Prodcuto");
			
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("¿Su opcion?", scanner);
			
			if(opcion >= 0 && opcion <=3) {
				return opcion;
			}
		}
	}
	public static void menu (Scanner scanner, ProductoView productosView) {
		boolean salir = false;
		while(!salir) {
			switch(encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					productosView.addProduct();
				} catch (CategoriaFantasma e) {
					System.out.println("No existe la categoria");
				}
				break;
			case 2:
				productosView.listProduct();
				break;
			case 3:
				productosView.deleteProduct();
				break;
			
			}
		}
		
		
	}

}
