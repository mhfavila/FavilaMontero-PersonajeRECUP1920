import java.util.ArrayList;
import java.util.Scanner;

import ClasesDTO.GuerreroDTO;
import ClasesDTO.PersonajeDTO;
import ClasesDTO.PicaroDTO;

public class GestionPersonaje {
	Scanner sc = new Scanner(System.in);
	ArrayList<PersonajeDTO> listaPersonajes = new ArrayList<>();

	public ArrayList<PersonajeDTO> getListaPersonajes() {
		return listaPersonajes;
	}

	public void setListaPersonajes(ArrayList<PersonajeDTO> listaPersonajes) {
		this.listaPersonajes = listaPersonajes;
	}
	// preguntar para que uso esto

	/**
	 * añadimos un nuevo personaje
	 */
	
	
	public void nuevoPersonaje() {
		Scanner sc = new Scanner(System.in);
		String tipoPersonaje = "";
		System.out.print("Tipo de Personaje: Picaro,Mago o Guerrero");
		tipoPersonaje = sc.nextLine();
		switch(tipoPersonaje) {
		case "Picaro":
			PicaroDTO picaro = new PicaroDTO();
			System.out.print("Nombre: ");
			picaro.setNombre(sc.nextLine());
			System.out.print("Nivel: ");
			picaro.setNivel(sc.nextInt());
			System.out.print("Vida: ");
			picaro.setVida(sc.nextInt());
			System.out.print("Fuerza: ");
			picaro.setFuerza(sc.nextInt());
			System.out.print("Destreza: ");
			picaro.setDestreza(sc.nextInt());
			System.out.print("Constitucion: ");
			picaro.setConstitucion(sc.nextInt());
			System.out.print("Inteligencia: ");
			picaro.setInteligencia(sc.nextInt());
			System.out.print("Oro: ");
			picaro.setOro(sc.nextInt());
			System.out.print("Abrir Cerradura: ");
			picaro.setAbrirCerradura(sc.nextInt());
			System.out.print("Ataque Furtivo: ");
			picaro.setAtaqueFurtivo(sc.nextInt());
			System.out.print("Esconder: ");
			picaro.setEsconder(sc.nextInt());
			picaro.setTipo(tipoPersonaje);
			
			listaPersonajes.add(picaro);
			
			break;
			//AÑADIR PERSONAJE MAGO Y GUERRERO
		}
		
		

		/*PersonajeDTO personaje = new PersonajeDTO();

		System.out.print("Nombre: ");
		personaje.setNombre(sc.nextLine());
		System.out.print("Nivel: ");
		personaje.setNivel(sc.nextInt());
		System.out.print("Vida: ");
		personaje.setVida(sc.nextInt());
		System.out.print("Fuerza: ");
		personaje.setFuerza(sc.nextInt());
		System.out.print("Destreza: ");
		personaje.setDestreza(sc.nextInt());
		System.out.print("Constitucion: ");
		personaje.setConstitucion(sc.nextInt());
		System.out.print("Inteligencia: ");
		personaje.setInteligencia(sc.nextInt());
		System.out.print("Oro: ");
		personaje.setOro(sc.nextInt());
		System.out.print("Tipo de Personaje: Picaro,Mago o Guerrero");
		personaje.setTipo(sc.nextLine());//no coje el tipo

		listaPersonajes.add(personaje);*/

	}
	//---------------------------------------------------------------------------------------------------------------------------

	/**
	 * cargamos los personajes que ya tenemos creados
	 */
	public void cargarPersonaje() {
	
		GuerreroDTO personaje = new GuerreroDTO();
		personaje.setNombre("goku");
		personaje.setNivel(10);
		personaje.setVida(100);
		personaje.setFuerza(50);
		personaje.setDestreza(50);
		personaje.setConstitucion(50);
		personaje.setInteligencia(50);
		personaje.setOro(50);
		personaje.setTipo("Guerrero");
		personaje.setModoBerserker(9);
		personaje.setBonificacionArmaligera(50);
		personaje.setBonificacionArmapesada(10);

		//crear mas personajes como el primero

		listaPersonajes.add(personaje);
		
		PicaroDTO personaje1 = new PicaroDTO();
		personaje1.setNombre("DAN");
		personaje1.setNivel(100);
		personaje1.setVida(100);
		personaje1.setFuerza(70);
		personaje1.setDestreza(30);
		personaje1.setConstitucion(20);
		personaje1.setInteligencia(50);
		personaje1.setOro(90);
		personaje1.setTipo("Picaro");

		

		listaPersonajes.add(personaje1);
		
		PersonajeDTO personaje2 = new PersonajeDTO();
		personaje2.setNombre("PACO");
		personaje2.setNivel(100);
		personaje2.setVida(100);
		personaje2.setFuerza(10);
		personaje2.setDestreza(20);
		personaje2.setConstitucion(20);
		personaje2.setInteligencia(80);
		personaje2.setOro(100);
		personaje2.setTipo("mago");

		

		listaPersonajes.add(personaje2);

		
	}

	
	
	
	//---------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	/**
	 * para mostrar la lista de personajes
	 */
	public void mostrarListaPesonajes() {
		System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i);
			System.out.println(aux.toString());
			// System.out.println(aux.getNombre());
		}
	}

	
	//---------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	/**
	 * Buscaremos el nombre del personaje el cual le pasaremos como parametro
	 * 
	 * @param Nombre
	 * @return
	 */
	public PersonajeDTO Buscar(String Nombre) {
		for (int i = 0; i < listaPersonajes.size(); i++) {
			
			PersonajeDTO aux = listaPersonajes.get(i);
			if (Nombre.equals( aux.getNombre())) {
				return aux;
			}
		}
		return null;

	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	
	
	
	

	/**
	 * sacamos la informacion de un personaje segun su nombre que le hemos pasado
	 * 
	 * @param Nombre
	 */
	public void informacionPersonaje(String Nombre) {
		System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
		
		PersonajeDTO aux = Buscar(Nombre);
		System.out.println(aux.toString());

	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------
	
	
	
	

	public void modificarDatos(String Nombre) {
		
		PersonajeDTO aux = Buscar(Nombre);
		switch(aux.getTipo()) {
		case "Picaro":
			PicaroDTO picaro = (PicaroDTO) aux;
			System.out.println("Elige una opcion: ");
			System.out.println("1.Nivel: ");
			System.out.println("2.Vida:");
			int opcion = sc.nextInt();
				switch(opcion) {
				case 1:
					System.out.println("Introduce el nuevo nivel");
					int nivel = sc.nextInt();
					picaro.setNivel(nivel);
					break;
				}
			
			break;
		
		}
		
		

	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------
//prueba pero no funciona 
	public void modificarPersonaje(String Nombre) {
		Boolean modificado = false;
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = Buscar(Nombre);
			if (Nombre == aux.getNombre()) {
				System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
				System.out.println(aux.toString());

				do {

					System.out.println("1. Modificar Nivel");
					System.out.println("2. Modificar Vida");

					switch (sc.nextInt()) {
					case 1:
						System.out.print("Nueva Nivel: ");
						int nivel = sc.nextInt();
						listaPersonajes.get(i).setNivel(nivel);
						break;
					case 2:
						System.out.print("Nuevo Vida: ");
						int vida = sc.nextInt();
						listaPersonajes.get(i).setVida(vida);
						break;
					}

					modificado = true;
					System.out.print("Has terminado? (S/N):");
					sc.nextLine();
				} while (sc.nextLine().equalsIgnoreCase("N"));
				break;
			}
		}
		if (!modificado) {
			System.out.println("Personaje no encontrado");
		}
	}

	
	
	//---------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	public void eliminarPersonaje(String Nombre) {

		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i);  //al utilizar esta si que me funciona y lo elimina pero como que se salta uno y me pone que no se a encontrado el nombre pero si que lo elimina
			 //PersonajeDTO aux = BuscarPersonaje(Nombre);
			 //PersonajeDTO aux = Buscar(Nombre);
			if (Nombre == aux.getNombre()) {
				listaPersonajes.remove(i);
				System.out.println("Personaje Eliminado");
			} else {
				System.out.println("No se ha encontrado");
			}
		}

	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------

	// prueba jona
	public PersonajeDTO BuscarPersonaje(String nombre) {
		PersonajeDTO aDevolver = null;

		boolean encontrado = false;
		for (int i = 0; i < this.listaPersonajes.size(); i++) {
			if (this.listaPersonajes.get(i).getNombre().equals(nombre)) {
				System.out.println(this.listaPersonajes.get(i).toString());
				aDevolver = this.listaPersonajes.get(i);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se ha encontrado el personaje: " + nombre);
		}

		return aDevolver;
	}
}
