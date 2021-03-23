package ClasesDTO;

public class GuerreroDTO extends PersonajeDTO {
	private int modoBerserker;
	private int bonificacionArmaligera;
	private int bonificacionArmapesada;
	
	


	public int getModoBerserker() {
		return modoBerserker;
	}




	public void setModoBerserker(int modoBerserker) {
		this.modoBerserker = modoBerserker;
	}




	public int getBonificacionArmaligera() {
		return bonificacionArmaligera;
	}




	public void setBonificacionArmaligera(int bonificacionArmaligera) {
		this.bonificacionArmaligera = bonificacionArmaligera;
	}




	public int getBonificacionArmapesada() {
		return bonificacionArmapesada;
	}




	public void setBonificacionArmapesada(int bonificacionArmapesada) {
		this.bonificacionArmapesada = bonificacionArmapesada;
	}




	public GuerreroDTO(String Nombre, int Nivel, int Vida, int Fuerza, int Destreza, int Constitucion,int Inteligencia, int Oro,
			String Tipo, int modoBerserker, int bonificacionArmaligera, int bonificacionArmapesada) {
		super(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion, Inteligencia,Oro,Tipo);
		this.modoBerserker=modoBerserker;
		this.bonificacionArmaligera =bonificacionArmaligera;
		this.bonificacionArmapesada = bonificacionArmapesada;
		
		
	}
	
}
