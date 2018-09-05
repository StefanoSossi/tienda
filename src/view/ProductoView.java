package view;

import java.util.Scanner;

import control.productos;
import entity.producto;
public class ProductoView {
	private productos productos;
	private Scanner scanner;
	public ProductoView (int n, Scanner scanner){
		productos = new productos(n);
		this.scanner= scanner;
	}
	public void add(){
		producto producto;
		producto = RegistroProducto.ingresar(scanner);
		productos.ingresar(producto);
		
	}
	public void list(){
		for(int i=0;i<=productos.getCantidad();i++){
			System.out.println(productos.getProductos()[i]);
		}
	}
}
