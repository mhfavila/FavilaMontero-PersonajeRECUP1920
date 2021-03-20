import java.util.ArrayList;

import ClasesDTO.PersonajeDTO;


public class GestionPersonaje {

	ArrayList <PersonajeDTO> listaPersonajes = new ArrayList<>();
	
	public ArrayList<PersonajeDTO> getListaPersonajes() {
		return listaPersonajes;
	}
	public void setListaPersonajes(ArrayList<PersonajeDTO> listaPersonajes) {
		this.listaPersonajes = listaPersonajes;
	}
	//preguntar para que uso esto
	
	
	public void añadirPersonaje() {
		PersonajeDTO personaje = new PersonajeDTO();
		personaje.setNombre("goku");
		personaje.setNivel(10);
		personaje.setVida(100);
		personaje.setFuerza(50);
		personaje.setDestreza(50);
		personaje.setConstitucion(50);
		personaje.setInteligencia(50);
		personaje.setOro(50);
		
		//Nose si aqui hay que poner el tipo de personaje
		
		listaPersonajes.add(personaje);
		
	}
	public void mostrarListaPesonajes() {
		for(int i=0;i<listaPersonajes.size();i++) {
			PersonajeDTO aux=listaPersonajes.get(i);
			System.out.println(aux.toString());
			System.out.println(aux.getNombre());
		}
	}
	
}
