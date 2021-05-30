package ClasesDTO;

import java.io.Serializable;
import java.util.ArrayList;

public class InventarioDTO implements Serializable{

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
	
	public void anadirObjeto(ItemDTO item) {
		
		boolean cabePeso = false;
		boolean cabeTamano = false;
		
		if (this.pesoMochila + item.getPeso() < this.pesoMaximo) {
			cabePeso = true;
		}
		
		if (this.espacioOcupado + item.getEspacio() < this.espacioTotal) {
			cabeTamano = true;
		}
		
		if (cabePeso && cabeTamano) {
			this.mochila.add(item);
			
			this.setPesoMochila(this.getPesoMochila() + item.getPeso());
			this.setEspacioOcupado(this.getEspacioOcupado() + item.getEspacio());
			
		} else {
			if (cabePeso==false) {
				System.out.println("El objeto no se ha introducido debido a que el peso es mayor que el maximo.");
			}
			
			if (cabeTamano==false) {
				System.out.println("El objeto no se ha introducido debido a que el espacio es mayor que el maximo.");
			}
		}
		
	}
	
	
	public void quitarObjeto(ItemDTO item) {
		
		
		for (int i = 0; i < this.mochila.size(); i++) {
			if (this.mochila.get(i).getNombre().equalsIgnoreCase(item.getNombre())) {
				
				this.mochila.remove(i);
				
				this.setPesoMochila(this.getPesoMochila() - item.getPeso());
				this.setEspacioOcupado(this.getEspacioOcupado() - item.getEspacio());
				
			}

		}
		
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
