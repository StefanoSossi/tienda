package categoria.view;

import java.util.Scanner;

import categoria.entity.categoria;
import producto.view.InputTypes;

public class RegistroCategoria {
	public static categoria ingresar(Scanner scanner) {
		String nombreProducto= InputTypes.readString("Nombre: ", scanner);
		int codCategoria = InputTypes.readInt("Codigo Categoria: ", scanner);
		String descripcion =InputTypes.readString("Descripcion: ", scanner);
		
		return new categoria( nombreProducto, codCategoria, descripcion);
		
	}
}
