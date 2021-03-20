package ClasesDTO;

public class MagoDTO extends PersonajeDTO {
	private int bonificacionPiromancia;
	private int bonificacionNigromancia;
	private int bonificacionIlusion;
	private int bonificacionTransmutación ;
	
	
	
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



	public int getBonificacionTransmutación() {
		return bonificacionTransmutación;
	}



	public void setBonificacionTransmutación(int bonificacionTransmutación) {
		this.bonificacionTransmutación = bonificacionTransmutación;
	}



	public MagoDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion,int Inteligencia, int Oro,
			String tipoPersonaje, int bonificacionPiromancia, int bonificacionNigromancia, int bonificacionIlusion, int bonificacionTransmutación) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion,Inteligencia, Oro);
		this.bonificacionPiromancia = bonificacionPiromancia;
		this.bonificacionNigromancia =bonificacionNigromancia;
		this.bonificacionIlusion=bonificacionIlusion;
		this.bonificacionTransmutación=bonificacionTransmutación;
		
	
	}

}
