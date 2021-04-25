package ClasesDTO;

import java.io.Serializable;

public class MagoDTO extends PersonajeDTO implements Serializable{
	private int bonificacionPiromancia;
	private int bonificacionNigromancia;
	private int bonificacionIlusion;
	private int bonificacionTransmutaci�n ;
	
	
	
	public int getBonificacionPiromancia() {
		return bonificacionPiromancia;
	}



	public void setBonificacionPiromancia(int bonificacionPiromancia) {
		this.bonificacionPiromancia = bonificacionPiromancia;
	}



	public int getBonificacionNigromancia() {
		return bonificacionNigromancia;
	}



	public void setBonificacionNigromancia(int bonificacionNigromancia) {
		this.bonificacionNigromancia = bonificacionNigromancia;
	}



	public int getBonificacionIlusion() {
		return bonificacionIlusion;
	}



	public void setBonificacionIlusion(int bonificacionIlusion) {
		this.bonificacionIlusion = bonificacionIlusion;
	}



	public int getBonificacionTransmutaci�n() {
		return bonificacionTransmutaci�n;
	}



	public void setBonificacionTransmutaci�n(int bonificacionTransmutaci�n) {
		this.bonificacionTransmutaci�n = bonificacionTransmutaci�n;
	}



	public MagoDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion,int Inteligencia, int Oro,
			String Tipo, int bonificacionPiromancia, int bonificacionNigromancia, int bonificacionIlusion, int bonificacionTransmutaci�n) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion,Inteligencia, Oro,Tipo);
		this.bonificacionPiromancia = bonificacionPiromancia;
		this.bonificacionNigromancia =bonificacionNigromancia;
		this.bonificacionIlusion=bonificacionIlusion;
		this.bonificacionTransmutaci�n=bonificacionTransmutaci�n;
		
	
	}
	
	@Override
	public String toString() {
		return this.getNombre() + " " + this.getNivel() + " " + this.getVida() + " " + this.getFuerza() + " " 
				+ this.getDestreza() + " " + this.getConstitucion() + " " + this.getInteligencia() + " " + this.getOro() + " " + this.getTipo() + " "+this.bonificacionPiromancia+" "+this.bonificacionNigromancia+" "+this.bonificacionIlusion+" "+this.bonificacionTransmutaci�n+" ";
	}



	public MagoDTO() {
		super();
		
		
	
	}

}
