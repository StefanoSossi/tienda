package producto.view;

import java.util.Scanner;
import categoria.control.categorias;
import excepciones.entity.CategoriaFantasma;
import producto.entity.Producto;

public class RegistroProducto  {
	public static Producto ingresar(Scanner scanner,categorias categorias) throws CategoriaFantasma {
		
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto", scanner);
		String nombreProducto= InputTypes.readString("Nombre: ", scanner);
		double precio = InputTypes.readDouble("precio; ", scanner);
		String descripcion= InputTypes.readString("Descripcion ", scanner);
		
		int codCategoria = InputTypes.readInt("Codigo Categoria: ", scanner);
		
		categorias.buscar(codCategoria);
		
		
		return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);
		
	}
}
