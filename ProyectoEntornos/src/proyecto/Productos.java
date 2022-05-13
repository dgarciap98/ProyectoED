package proyecto;

public class Productos {
	
	protected int lote;
	protected String nombre;
	protected String tipo;
	
	public Productos() {
		lote = 0;
		nombre = "";
		tipo = "";
	}
	
	public Productos(int lote, String nombre, String tipo) {
		this.lote = lote;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		
		return "Producto: " + getNombre() + "\t Tipo: " + getTipo() + "\t Lote: " + getLote();
	}

}
