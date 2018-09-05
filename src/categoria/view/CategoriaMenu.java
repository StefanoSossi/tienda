package categoria.view;

import java.util.Scanner;

import excepciones.entity.CategoriaFantasma;
import producto.view.InputTypes;

public class CategoriaMenu {
		
		private static int encabezado (Scanner scanner) {
			int opcion;
			
			while (true) {
				System.out.println("Ingrese una opcion; ");
				System.out.println("------------------- ");
				System.out.println("1. Ingresar categoria");
				System.out.println("2. Listar categoria");
				System.out.println("3. Eliminar categoria");
				System.out.println("0. Salir");
				System.out.println();
				
				opcion = InputTypes.readInt("¿Su opcion?", scanner);
				
				if(opcion >= 0 && opcion <=3) {
					return opcion;
				}
			}
		}
		public static void menu (Scanner scanner, CategoriaView categoriaView) {
			boolean salir = false;
			while(!salir) {
				switch(encabezado(scanner)) {
				case 0:
					salir = true;
					break;
				case 1:
					categoriaView.addCategoria();
					break;
				case 2:
					categoriaView.listCategory();
					break;
				case 3:
					try {
						categoriaView.deleteCategory();
					} catch (CategoriaFantasma e) {
						System.out.println("No existe categoria");
					}
					break;
				}
			}
			
			
		}

	}



