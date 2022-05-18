package proyecto;

import java.time.LocalDate;

public class Comida extends Productos {
	
	
	protected LocalDate fcaducidad;
		
	
	public Comida() {
		super();
		fcaducidad = null;
	}
	
	public Comida(int lote, String nombre, String tipo, int stock, LocalDate fcaducidad) { 
	super(lote, nombre, tipo, stock);
	this.fcaducidad = fcaducidad;
	}

	
	public LocalDate getFcaducidad() {
		return fcaducidad;
	}

	public void setFcaducidad(LocalDate fcaducidad) {
		this.fcaducidad = fcaducidad;
	}

		public String toString() {
		
		return  super.toString() + " la fecha de caducidad es: " + getFcaducidad();
	}

}
