package categoria.control;

import categoria.entity.categoria;
import excepciones.entity.CategoriaFantasma;

public class categorias {

	private categoria[] categorias;
	private int cantidad;
	private int ultimo;
	
	public categorias (int tamaño) {
		categorias = new categoria[tamaño];
		cantidad = 0;
		ultimo = -1;
	}
	public void ingresar(categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
			categorias[++ultimo]=categoria;
			cantidad++;
	}
	public void eliminar(int codCategoria) throws CategoriaFantasma {
		int indice = buscar(codCategoria);
		if(indice>=0) {
			if(indice!=ultimo) {
				for(int i=indice; i<=ultimo;i++) {
//					recorrer todos los elementos a partir de i
					categorias[i]=categorias[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}
		
	}
	public int buscar(int codCategoria) throws CategoriaFantasma {
		int posicion = -1;
		
		int indice=0;
		while(indice<=ultimo) {
			if(categorias[indice].getCodCategoria()==codCategoria) {
				posicion=indice;
				break;
			}
			indice++;
		}
		if (posicion==-1){
			throw new CategoriaFantasma();
		}
		return posicion;
	}
	
	public boolean searchBoolean (int codCategoria) throws CategoriaFantasma{
		boolean valor = false;
		for (int i =0; i< ultimo;i++){
			if(codCategoria == categorias[i].getCodCategoria()){
				valor = !valor;
			}
		}
		if (valor){
			throw new CategoriaFantasma();
		}
		return valor;
	}
	
	public categoria[] getCategorias() {
		return categorias;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	
}
