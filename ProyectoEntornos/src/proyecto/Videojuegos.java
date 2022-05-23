package proyecto;

import java.time.LocalDate;

public class Videojuegos extends Productos {

		protected LocalDate publicacion;
		
	
	public Videojuegos() {
		super();
		publicacion = null;
	}
	
	public Videojuegos(int lote, String nombre, String tipo, int stock, LocalDate publicacion) { 
	super(lote, nombre, tipo, stock);
	this.publicacion = publicacion;
	}
	
	public Videojuegos (String[] lista) {
		
		this.lote = Integer.parseInt(lista[0]);
		this.nombre = lista[1];
		this.tipo = lista[2];
		this.stock = Integer.parseInt(lista[3]);
		this.publicacion= LocalDate.parse(lista[4]);
	}

	public LocalDate getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(LocalDate publicacion) {
		this.publicacion = publicacion;
	}

	
public String toString() {
		
		return  super.toString() + " \n  Fecha de Publicación: " + getPublicacion();
	}

	
	
	
	
	
	
	
	
	
	
	
}
