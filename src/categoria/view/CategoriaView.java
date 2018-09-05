package categoria.view;
	
	import java.util.Scanner;

import categoria.control.categorias;
import categoria.entity.categoria;
import excepciones.entity.CategoriaFantasma;
import producto.control.Productos;
import producto.view.InputTypes;

	public class CategoriaView {
		
		private categorias categorias;
		private Productos productos;
		private Scanner scanner;
		public CategoriaView(categorias categorias, Productos productos, Scanner scanner) {
			
			this.categorias=categorias;
			this.productos=productos;
			this.scanner = scanner;
		}
		
		public void addCategoria() {
			categoria categoria;
			
			categoria = RegistroCategoria.ingresar(scanner);
			categorias.ingresar(categoria);
					
		}
		
		public void listCategory() {
			for(int i=0; i<categorias.getCantidad(); i++) {
				System.out.println(categorias.getCategorias()[i]);
			}
		}
		
		public void deleteCategory() throws CategoriaFantasma {
			int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria", scanner);
			categorias.eliminar(codCategoria);	
		}

		public categorias getCategorias() {
			return categorias;
		}

		
		
		
		
	}



