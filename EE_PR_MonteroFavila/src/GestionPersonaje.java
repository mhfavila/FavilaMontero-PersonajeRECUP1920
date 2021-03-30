import java.util.ArrayList;
import java.util.Scanner;

import ClasesDTO.GuerreroDTO;
import ClasesDTO.MagoDTO;
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
		switch (tipoPersonaje) {
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

		case "Mago":
			MagoDTO mago = new MagoDTO();
			System.out.print("Nombre: ");
			mago.setNombre(sc.nextLine());
			System.out.print("Nivel: ");
			mago.setNivel(sc.nextInt());
			System.out.print("Vida: ");
			mago.setVida(sc.nextInt());
			System.out.print("Fuerza: ");
			mago.setFuerza(sc.nextInt());
			System.out.print("Destreza: ");
			mago.setDestreza(sc.nextInt());
			System.out.print("Constitucion: ");
			mago.setConstitucion(sc.nextInt());
			System.out.print("Inteligencia: ");
			mago.setInteligencia(sc.nextInt());
			System.out.print("Oro: ");
			mago.setOro(sc.nextInt());
			System.out.print("bonificacionPiromancia: ");
			mago.setBonificacionPiromancia(sc.nextInt());
			System.out.print(" bonificacionNigromancia: ");
			mago.setBonificacionNigromancia(sc.nextInt());
			System.out.print("bonificacionIlusion: ");
			mago.setBonificacionIlusion(sc.nextInt());
			System.out.print("bonificacionTransmutación: ");
			mago.setBonificacionTransmutación(sc.nextInt());
			mago.setTipo(tipoPersonaje);

			listaPersonajes.add(mago);

			break;

		case "Guerrero":
			GuerreroDTO guerrero = new GuerreroDTO();
			System.out.print("Nombre: ");
			guerrero.setNombre(sc.nextLine());
			System.out.print("Nivel: ");
			guerrero.setNivel(sc.nextInt());
			System.out.print("Vida: ");
			guerrero.setVida(sc.nextInt());
			System.out.print("Fuerza: ");
			guerrero.setFuerza(sc.nextInt());
			System.out.print("Destreza: ");
			guerrero.setDestreza(sc.nextInt());
			System.out.print("Constitucion: ");
			guerrero.setConstitucion(sc.nextInt());
			System.out.print("Inteligencia: ");
			guerrero.setInteligencia(sc.nextInt());
			System.out.print("Oro: ");
			guerrero.setOro(sc.nextInt());
			System.out.print("ModoBerserker: ");
			guerrero.setModoBerserker(sc.nextInt());
			System.out.print(" BonificacionArmaligera: ");
			guerrero.setBonificacionArmaligera(sc.nextInt());
			System.out.print("BonificacionArmapesada: ");
			guerrero.setBonificacionArmapesada(sc.nextInt());

			guerrero.setTipo(tipoPersonaje);

			listaPersonajes.add(guerrero);

			break;
		// AÑADIR PERSONAJE MAGO Y GUERRERO
		}

		/*
		 * PersonajeDTO personaje = new PersonajeDTO();
		 * 
		 * System.out.print("Nombre: "); personaje.setNombre(sc.nextLine());
		 * System.out.print("Nivel: "); personaje.setNivel(sc.nextInt());
		 * System.out.print("Vida: "); personaje.setVida(sc.nextInt());
		 * System.out.print("Fuerza: "); personaje.setFuerza(sc.nextInt());
		 * System.out.print("Destreza: "); personaje.setDestreza(sc.nextInt());
		 * System.out.print("Constitucion: "); personaje.setConstitucion(sc.nextInt());
		 * System.out.print("Inteligencia: "); personaje.setInteligencia(sc.nextInt());
		 * System.out.print("Oro: "); personaje.setOro(sc.nextInt());
		 * System.out.print("Tipo de Personaje: Picaro,Mago o Guerrero");
		 * personaje.setTipo(sc.nextLine());//no coje el tipo
		 * 
		 * listaPersonajes.add(personaje);
		 */

	}
	// ---------------------------------------------------------------------------------------------------------------------------

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

		// crear mas personajes como el primero

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
		personaje1.setEsconder(90);
		personaje1.setAbrirCerradura(40);
		personaje1.setAtaqueFurtivo(36);

		listaPersonajes.add(personaje1);

		MagoDTO personaje2 = new MagoDTO();
		personaje2.setNombre("PACO");
		personaje2.setNivel(100);
		personaje2.setVida(100);
		personaje2.setFuerza(10);
		personaje2.setDestreza(20);
		personaje2.setConstitucion(20);
		personaje2.setInteligencia(80);
		personaje2.setOro(100);
		personaje2.setTipo("Mago");
		personaje2.setBonificacionPiromancia(36);

		personaje2.setBonificacionNigromancia(23);
		personaje2.setBonificacionIlusion(59);
		personaje2.setBonificacionTransmutación(79);

		listaPersonajes.add(personaje2);

	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * para mostrar la lista de personajes
	 */
	public void mostrarListaPesonajes() {
		//System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i);
			//System.out.println(aux.toString());
			switch (aux.getTipo()) {
			case "Picaro":
				System.out.println("\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
				PicaroDTO p =(PicaroDTO) aux;
				System.out.println("PERSONAJE "+ i+": "+p.toString());
				break;
			case "Mago":
				System.out.println("\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
				MagoDTO m = (MagoDTO) aux;
				System.out.println("PERSONAJE "+ i+": "+m.toString());
				
				break;
			case "Guerrero":
				System.out.println("\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
				GuerreroDTO g =(GuerreroDTO) aux;
				System.out.println("PERSONAJE "+ i+": "+g.toString());
				break;
			}
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * Buscaremos el nombre del personaje el cual le pasaremos como parametro
	 * 
	 * @param Nombre
	 * @return
	 */
	public PersonajeDTO Buscar(String Nombre) {
		for (int i = 0; i < listaPersonajes.size(); i++) {

			PersonajeDTO aux = listaPersonajes.get(i);
			if (Nombre.equals(aux.getNombre())) {
				return aux;
			}
		}
		return null;

	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * sacamos la informacion de un personaje segun su nombre que le hemos pasado
	 * 
	 * @param Nombre
	 */
	public void informacionPersonaje(String Nombre) {
		

		PersonajeDTO aux = Buscar(Nombre);
		//System.out.println(aux.toString());
		
		switch (aux.getTipo()) {
		case "Picaro":
			PicaroDTO p =(PicaroDTO) aux;
			System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
			System.out.println(p.toString());
			break;
		case "Mago":
			System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
			MagoDTO m = (MagoDTO) aux;
			System.out.println(m.toString());
			
			break;
		case "Guerrero":
			System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
			GuerreroDTO g =(GuerreroDTO) aux;
			System.out.println(g.toString());
			break;
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	public void modificarDatos(String Nombre) {

		PersonajeDTO aux = Buscar(Nombre);
		//String op = null;
		//while(op != "s") {
		
		
		//FALTA HACER UN BUCLE PARA QUE PUEDA SEGIR ELIGIENDO QUE ATRIBUTOS CAMBIAR ANTES DE SALIR
		
		
		switch (aux.getTipo()) {
		case "Picaro":
			
			
			PicaroDTO picaro = (PicaroDTO) aux;
			System.out.println("Elige una opcion: ");
			System.out.println("1.Nivel: ");
			System.out.println("2.Vida:");
			System.out.println("3.Fuerza:");
			System.out.println("4.Destreza:");
			System.out.println("5.Constitucion:");
			System.out.println("6.Inteligencia:");
			System.out.println("7.Oro:");
			System.out.println("8.Esconder:");
			System.out.println("9.Abrir Cerradura:");
			System.out.println("10.Ataque Furtivo:");
			
			

			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el nuevo nivel");
				int nivel = sc.nextInt();
				picaro.setNivel(nivel);
				break;
			case 2:

				System.out.println("Introduce la nueva Vida");
				int vida = sc.nextInt();
				picaro.setVida(vida);
				break;
			case 3:

				System.out.println("Introduce la nueva Fuerza");
				int Fuerza = sc.nextInt();
				picaro.setFuerza(Fuerza);
				break;
			case 4:
				System.out.println("Introduce la nueva Destreza");
				int Destreza = sc.nextInt();
				picaro.setDestreza(Destreza);
				break;
			case 5:
				System.out.println("Introduce la nueva Constitucion");
				int Constitucion = sc.nextInt();
				picaro.setConstitucion(Constitucion);
				break;
			case 6:
				System.out.println("Introduce la nueva Inteligencia");
				int Inteligencia = sc.nextInt();
				picaro.setInteligencia(Inteligencia);
				break;
			case 7:
				System.out.println("Introduce el nuevo Oro");
				int Oro = sc.nextInt();
				picaro.setOro(Oro);
				break;
			case 8:
				System.out.println("Introduce el nuevo valor para Esconder");
				int Esconder = sc.nextInt();
				picaro.setEsconder(Esconder);
				break;
			case 9:
				System.out.println("Introduce el nuevo valor para Abrir Cerradura");
				int Cerradura = sc.nextInt();
				picaro.setAbrirCerradura(Cerradura);
				break;
			case 10:
				System.out.println("Introduce el nuevo valor para Ataque Furtivo");
				int Furtivo = sc.nextInt();
				picaro.setAtaqueFurtivo(Furtivo);
				break;

			}
			
			break;
			
		case "Mago":
			MagoDTO mago = (MagoDTO) aux;
			System.out.println("Elige una opcion: ");
			System.out.println("1.Nivel: ");
			System.out.println("2.Vida:");
			System.out.println("3.Fuerza:");
			System.out.println("4.Destreza:");
			System.out.println("5.Constitucion:");
			System.out.println("6.Inteligencia:");
			System.out.println("7.Oro:");
			System.out.println("8.bonificacionPiromancia;:");
			System.out.println("9.bonificacionNigromancia:");
			System.out.println("10.bonificacionIlusion:");
			System.out.println("11.bonificacionTransmutación:");
			
			
			int opcion1 = sc.nextInt();
			switch (opcion1) {
			case 1:
				System.out.println("Introduce el nuevo nivel");
				int nivel1 = sc.nextInt();
				mago.setNivel(nivel1);
				break;
			case 2:

				System.out.println("Introduce la nueva Vida");
				int vida1 = sc.nextInt();
				mago.setVida(vida1);
				break;
			case 3:

				System.out.println("Introduce la nueva Fuerza");
				int Fuerza1 = sc.nextInt();
				mago.setFuerza(Fuerza1);
				break;
			case 4:
				System.out.println("Introduce la nueva Destreza");
				int Destreza1 = sc.nextInt();
				mago.setDestreza(Destreza1);
				break;
			case 5:
				System.out.println("Introduce la nueva Constitucion");
				int Constitucion1 = sc.nextInt();
				mago.setConstitucion(Constitucion1);
				break;
			case 6:
				System.out.println("Introduce la nueva Inteligencia");
				int Inteligencia1 = sc.nextInt();
				mago.setInteligencia(Inteligencia1);
				break;
			case 7:
				System.out.println("Introduce el nuevo Oro");
				int Oro1 = sc.nextInt();
				mago.setOro(Oro1);
				break;
			case 8:
				System.out.println("Introduce el nuevo valor para bonificacionPiromancia");
				int bonificacionPiromancia = sc.nextInt();
				mago.setBonificacionPiromancia(bonificacionPiromancia);
				break;
			case 9:
				System.out.println("Introduce el nuevo valor para bonificacionNigromancia");
				int bonificacionNigromancia = sc.nextInt();
				mago.setBonificacionNigromancia(bonificacionNigromancia);
				break;
			case 10:
				System.out.println("Introduce el nuevo valor para bonificacionIlusion");
				int bonificacionIlusion = sc.nextInt();
				mago.setBonificacionIlusion(bonificacionIlusion);
				break;
			case 11:
				System.out.println("Introduce el nuevo valor para bonificacionTransmutación");
				int bonificacionTransmutación = sc.nextInt();
				mago.setBonificacionTransmutación(bonificacionTransmutación);
				break;
			}

			break;
		case "Guerrero":
			GuerreroDTO guerrero = (GuerreroDTO) aux;
			System.out.println("Elige una opcion: ");
			System.out.println("1.Nivel: ");
			System.out.println("2.Vida:");
			System.out.println("3.Fuerza:");
			System.out.println("4.Destreza:");
			System.out.println("5.Constitucion:");
			System.out.println("6.Inteligencia:");
			System.out.println("7.Oro:");
			System.out.println("8.modoBerserker:");
			System.out.println("9.bonificacionArmaligera:");
			System.out.println("10.bonificacionArmapesada:");
			
			
			int opcion2 = sc.nextInt();
			switch (opcion2) {
			case 1:
				System.out.println("Introduce el nuevo nivel");
				int nivel2 = sc.nextInt();
				guerrero.setNivel(nivel2);
				break;
			case 2:

				System.out.println("Introduce la nueva Vida");
				int vida2 = sc.nextInt();
				guerrero.setVida(vida2);
				break;
			case 3:

				System.out.println("Introduce la nueva Fuerza");
				int Fuerza2 = sc.nextInt();
				guerrero.setFuerza(Fuerza2);
				break;
			case 4:
				System.out.println("Introduce la nueva Destreza");
				int Destreza2 = sc.nextInt();
				guerrero.setDestreza(Destreza2);
				break;
			case 5:
				System.out.println("Introduce la nueva Constitucion");
				int Constitucion2 = sc.nextInt();
				guerrero.setConstitucion(Constitucion2);
				break;
			case 6:
				System.out.println("Introduce la nueva Inteligencia");
				int Inteligencia2 = sc.nextInt();
				guerrero.setInteligencia(Inteligencia2);
				break;
			case 7:
				System.out.println("Introduce el nuevo Oro");
				int Oro2 = sc.nextInt();
				guerrero.setOro(Oro2);
				break;
			case 8:
				System.out.println("Introduce el nuevo valor para modoBerserker");
				int modoBerserker = sc.nextInt();
				guerrero.setModoBerserker(modoBerserker);
				break;
			case 9:
				System.out.println("Introduce el nuevo valor para bonificacionArmaligera");
				int bonificacionArmaligera = sc.nextInt();
				guerrero.setBonificacionArmaligera(bonificacionArmaligera);
				break;
			case 10:
				System.out.println("Introduce el nuevo valor para bonificacionArmapesada");
				int bonificacionArmapesada = sc.nextInt();
				guerrero.setBonificacionArmapesada(bonificacionArmapesada);
				break;
			}

			break;
		}
		}
		

		

	//}

	// ---------------------------------------------------------------------------------------------------------------------------


	// ---------------------------------------------------------------------------------------------------------------------------

	public void eliminarPersonaje(String Nombre) {

		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i); // al utilizar esta si que me funciona y lo elimina pero como que
														// se salta uno y me pone que no se a encontrado el nombre pero
														// si que lo elimina
			// PersonajeDTO aux = BuscarPersonaje(Nombre);
			 //PersonajeDTO aux = Buscar(Nombre);
			if (Nombre.equals(aux.getNombre())) {
				listaPersonajes.remove(i);
				System.out.println("Personaje Eliminado");
			} else {
				System.out.println("No se ha encontrado");
			}
		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------

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
