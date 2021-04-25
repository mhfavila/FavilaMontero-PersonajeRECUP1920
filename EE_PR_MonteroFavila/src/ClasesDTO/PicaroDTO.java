package ClasesDTO;

import java.io.Serializable;

public class PicaroDTO extends PersonajeDTO  implements Serializable{

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
			String Tipo, int Esconder, int abrirCerradura, int ataqueFurtivo) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion,Inteligencia, Oro,Tipo);
		this.Esconder = Esconder;
		this.abrirCerradura= abrirCerradura;
		this.ataqueFurtivo= ataqueFurtivo;
		
		
		
	}
	
	
	@Override
	public String toString() {
		return this.getNombre() + " " + this.getNivel() + " " + this.getVida() + " " + this.getFuerza() + " " 
				+ this.getDestreza() + " " + this.getConstitucion() + " " + this.getInteligencia() + " " + this.getOro() + " " + this.getTipo() + " "+this.Esconder + " " + this.abrirCerradura +" "+this.ataqueFurtivo+" ";
	}
	

	public PicaroDTO() {
		super();
		
		
		
		
	}

}
