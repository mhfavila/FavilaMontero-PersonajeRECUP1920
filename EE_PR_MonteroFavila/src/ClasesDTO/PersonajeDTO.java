package ClasesDTO;

public class PersonajeDTO {
	private String Nombre;
	private int Nivel;
	private int Vida;
	private int Fuerza;
	private int Destreza;
	private int Constitucion;
	private int Inteligencia;
	private int Oro;
	private String Tipo;
	
	private Inventario Inventario;
	
	

	public Inventario getInventario() {
		return Inventario;
	}

	public void setInventario(Inventario inventario) {
		Inventario = inventario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}

	public int getVida() {
		return Vida;
	}

	public void setVida(int vida) {
		Vida = vida;
	}

	public int getFuerza() {
		return Fuerza;
	}

	public void setFuerza(int fuerza) {
		Fuerza = fuerza;
	}

	public int getDestreza() {
		return Destreza;
	}

	public void setDestreza(int destreza) {
		Destreza = destreza;
	}

	public int getConstitucion() {
		return Constitucion;
	}

	public void setConstitucion(int constitucion) {
		Constitucion = constitucion;
	}

	public int getInteligencia() {
		return Inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}

	public int getOro() {
		return Oro;
	}

	public void setOro(int oro) {
		Oro = oro;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public PersonajeDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion,
			int Inteligencia, int Oro, String Tipo) {
		this.Nombre = Nombre;
		this.Nivel = Nivel;
		this.Vida = Vida;
		this.Fuerza = Fuerza;
		this.Destreza = Destreza;
		this.Constitucion = Constitucion;
		this.Inteligencia = Inteligencia;
		this.Oro = Oro;
		this.Tipo = Tipo;
		this.Inventario = new Inventario();

	}

	public PersonajeDTO() {

	}

	@Override
	public String toString() {
		return this.Nombre + " " + this.Nivel + " " + this.Vida + " " + this.Fuerza + " " 
				+ this.Destreza + " " + this.Constitucion + " " + this.Inteligencia + " " + this.Oro + " " + this.Tipo + " ";
	}

}
