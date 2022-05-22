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
