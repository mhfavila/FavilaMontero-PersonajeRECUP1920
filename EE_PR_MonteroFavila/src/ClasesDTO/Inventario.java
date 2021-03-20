package ClasesDTO;

import java.util.ArrayList;

public class Inventario {
	
	private int pesoMochila;
    private int pesoMaximo;
    private int espacioTotal;
    private int espacioMaximo;

    private ArrayList<Item> mochila;
    
    
    
    

	public Inventario(int pesoMochila, int pesoMaximo, int espacioTotal, int espacioMaximo, ArrayList<Item> mochila) {
		super();
		this.pesoMochila = pesoMochila;
		this.pesoMaximo = 100;
		this.espacioTotal = 20;
		this.espacioMaximo = espacioMaximo;
		this.mochila = mochila;
	}
	

	public Inventario() {
		super();
		
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

	public int getEspacioMaximo() {
		return espacioMaximo;
	}

	public void setEspacioMaximo(int espacioMaximo) {
		this.espacioMaximo = espacioMaximo;
	}

	public ArrayList<Item> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Item> mochila) {
		this.mochila = mochila;
	}

}
