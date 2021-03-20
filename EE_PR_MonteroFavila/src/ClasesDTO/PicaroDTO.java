package ClasesDTO;

public class PicaroDTO extends PersonajeDTO {

	private int Esconder;
	private int abrirCerradura;
	private int ataqueFurtivo;

	public int getEsconder() {
		return Esconder;
	}

	public void setEsconder(int esconder) {
		Esconder = esconder;
	}

	public int getAbrirCerradura() {
		return abrirCerradura;
	}

	public void setAbrirCerradura(int abrirCerradura) {
		this.abrirCerradura = abrirCerradura;
	}

	public int getAtaqueFurtivo() {
		return ataqueFurtivo;
	}

	public void setAtaqueFurtivo(int ataqueFurtivo) {
		this.ataqueFurtivo = ataqueFurtivo;
	}

	public PicaroDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion,int Inteligencia, int Oro,
			String tipoPersonaje, int Esconder, int abrirCerradura, int ataqueFurtivo) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion,Inteligencia, Oro);
		this.Esconder = Esconder;
		this.abrirCerradura= abrirCerradura;
		this.ataqueFurtivo= ataqueFurtivo;
		
		
		
	}

}
