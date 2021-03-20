package ClasesDTO;

public class PersonajeDTO {
	private String Nombre;
	private int Nivel;
	private int Vida;
	private int Fuerza;
	private int Destreza;
	private int Constitucion;
	private int Oro;
	
	
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

	public int getOro() {
		return Oro;
	}

	public void setOro(int oro) {
		Oro = oro;
	}

	

	public PersonajeDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion, int Oro
		) {
		this.Nombre = Nombre;
		this.Nivel = Nivel;
		this.Vida = Vida;
		this.Fuerza = Fuerza;
		this.Destreza = Destreza;
		this.Constitucion = Constitucion;
		this.Oro = Oro;
		
	}

	@Override
	public String toString() {
		return this.Nombre + " " + this.Nivel + " " + this.Vida + " " + this.Fuerza + " " + this.Fuerza + " "
				+ this.Destreza + " " + this.Constitucion + " " + this.Oro + " " ;
	}

}
