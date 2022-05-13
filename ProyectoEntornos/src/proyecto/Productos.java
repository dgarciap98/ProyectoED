package proyecto;

public class Productos {
	
	protected int lote;
	protected String nombre;
	protected String tipo;
	protected int stock;
	public Productos() {
		lote = 0;
		nombre = "";
		tipo = "";
		stock = 0;
	}
	
	public Productos(int lote, String nombre, String tipo, int stock) {
		this.lote = lote;
		this.nombre = nombre;
		this.tipo = tipo;
		this.stock = stock;
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
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {
		
		return "Producto: " + getNombre() + "\t Tipo: " + getTipo() + "\t Stock: " + getStock() + "\t Lote: " + getLote();
	}

}
