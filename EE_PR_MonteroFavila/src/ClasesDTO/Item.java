package ClasesDTO;

public class Item {
	
	private String nombre;
    private String descripcion;
    private int defensa;
    private int ataque;
    private int magico;
    private int espacio;
    private double precio;
    private int peso;
    
	public Item(String nombre, String descripcion, int defensa, int ataque, int magico, int espacio, double precio,
			int peso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.defensa = defensa;
		this.ataque = ataque;
		this.magico = magico;
		this.espacio = espacio;
		this.precio = precio;
		this.peso = peso;
	}
	
	public Item() {
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getMagico() {
		return magico;
	}
	public void setMagico(int magico) {
		this.magico = magico;
	}
	public int getEspacio() {
		return espacio;
	}
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
