package proyecto;

public class Muebles extends Productos{

	protected String material;
	
	public Muebles() {
		super();
		material = "";
	}

	public Muebles(int lote, String nombre, String tipo, int stock, String material) {
		super(lote, nombre, tipo, stock);
		this.material = material;
	}
	
	public Muebles(String[] lista) {
		this.lote = Integer.parseInt(lista[0]);
		this.nombre = lista[1];
		this.tipo = lista[2];
		this.stock = Integer.parseInt(lista[3]);
		this.material = lista[4];
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String toString() {
		return super.toString() + "\t Material: " + getMaterial();
	}

}
