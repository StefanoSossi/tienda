package view;

import java.util.Scanner;

import entity.producto;

public class RegistroProducto {
	public static producto ingresar (Scanner scanner){
		int codProducto = InputTypes.readInt("ingrese el codigo del producto" , scanner);
		String nombreProducto = InputTypes.readString("nombre", scanner);
		double precio = InputTypes.readDouble("precio", scanner);
		String descripcion=InputTypes.readString("Descripcion", scanner);
		int codCategoria = InputTypes.readInt("Codigo categoria" , scanner);
		return new producto(codProducto,nombreProducto,precio,descripcion,codCategoria);
	}

}
