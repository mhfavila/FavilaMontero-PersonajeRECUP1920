package ClasesDTO;

public class MagoDTO extends PersonajeDTO {
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



	public MagoDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion, int Oro,
			String tipoPersonaje, int bonificacionPiromancia, int bonificacionNigromancia, int bonificacionIlusion, int bonificacionTransmutaci�n) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion, Oro, tipoPersonaje);
		this.bonificacionPiromancia = bonificacionPiromancia;
		this.bonificacionNigromancia =bonificacionNigromancia;
		this.bonificacionIlusion=bonificacionIlusion;
		this.bonificacionTransmutaci�n=bonificacionTransmutaci�n;
		
		//tenog dudas de como maracar si es un tipo de guerrero o mago etc.
				//this.getTipoPersonaje()!!!!!!!!!
	}

}
