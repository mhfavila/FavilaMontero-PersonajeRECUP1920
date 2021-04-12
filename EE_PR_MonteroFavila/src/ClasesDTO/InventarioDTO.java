package ClasesDTO;

import java.util.ArrayList;

public class InventarioDTO {

	private int pesoMochila;
	private int pesoMaximo;
	private int espacioTotal;
	private int espacioOcupado;

	private ArrayList<ItemDTO> mochila;

	public InventarioDTO(int pesoMochila, int pesoMaximo, int espacioTotal, int espacioOcupado, ArrayList<ItemDTO> mochila) {
		super();
		this.pesoMochila = pesoMochila;
		this.pesoMaximo = 100;
		this.espacioTotal = 20;
		this.espacioOcupado = espacioOcupado;
		this.mochila = mochila;
	}

	public InventarioDTO() {
		super();
		this.mochila =new ArrayList<ItemDTO>();

	}

	public int getPesoMochila() {
		return pesoMochila;
	}

	public void setPesoMochila(int pesoMochila) {
		this.pesoMochila = pesoMochila;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public int getEspacioTotal() {
		return espacioTotal;
	}

	public void setEspacioTotal(int espacioTotal) {
		this.espacioTotal = espacioTotal;
	}

	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}

	public ArrayList<ItemDTO> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<ItemDTO> mochila) {
		this.mochila = mochila;
	}

	@Override
	public String toString() {
		return this.pesoMochila + " " + this.pesoMaximo + " " + this.espacioTotal + " " + this.espacioOcupado + " " + this.mostrarMochila() + " ";

	}

	public String mostrarMochila() {

		String textoMochila = "";
		for (int i = 0; i < this.mochila.size(); i++) {
			textoMochila= textoMochila+this.mochila.get(i).toString()+" ";

		}
		return textoMochila;
	}

}
