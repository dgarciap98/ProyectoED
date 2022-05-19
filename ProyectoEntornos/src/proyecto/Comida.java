package proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

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
	
	public Comida (String[] lista) {
		
		this.lote = Integer.parseInt(lista[0]);
		this.nombre = lista[1];
		this.tipo = lista[2];
		this.stock = Integer.parseInt(lista[3]);
		this.fcaducidad= LocalDate.parse(lista[4]);
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
