import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import ClasesDAO.GuerreroDAO;
import ClasesDAO.InventarioDAO;
import ClasesDAO.MagoDAO;
import ClasesDAO.PicaroDAO;
import ClasesDTO.GuerreroDTO;
import ClasesDTO.InventarioDTO;
import ClasesDTO.ItemDTO;
import ClasesDTO.MagoDTO;
import ClasesDTO.PersonajeDTO;
import ClasesDTO.PicaroDTO;

public class GestionPersonaje {
	Scanner sc = new Scanner(System.in);
	ArrayList<PersonajeDTO> listaPersonajes = new ArrayList<>();
	GuerreroDAO gDAO = new GuerreroDAO();
	PicaroDAO pDAO = new PicaroDAO();
	MagoDAO mDAO = new MagoDAO();
	InventarioDAO iDAO = new InventarioDAO();

	public GestionPersonaje() {
		ArrayList<GuerreroDTO> guerreros = (ArrayList<GuerreroDTO>) gDAO.obtenerListado();
		for (int i = 0; i < guerreros.size(); i++) {

			iDAO.obtener(guerreros.get(i));
			listaPersonajes.add(guerreros.get(i));

		}

		// for picaro
		ArrayList<PicaroDTO> picaros = (ArrayList<PicaroDTO>) pDAO.obtenerListado();
		for (int i = 0; i < picaros.size(); i++) {

			iDAO.obtener(picaros.get(i));
			listaPersonajes.add(picaros.get(i));

		}

		// for mago
		ArrayList<MagoDTO> magos = (ArrayList<MagoDTO>) mDAO.obtenerListado();
		for (int i = 0; i < magos.size(); i++) {

			iDAO.obtener(magos.get(i));
			listaPersonajes.add(magos.get(i));

		}
	}

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
			
			System.out.print("pesoMochila: ");
			picaro.getInventario().setPesoMochila(sc.nextInt());
			
			picaro.getInventario().setPesoMaximo(100);
			
			picaro.getInventario().setEspacioTotal(20);
			System.out.print("espacioOcupado: ");
			picaro.getInventario().setEspacioOcupado(sc.nextInt());

			listaPersonajes.add(picaro);
			pDAO.insertar(picaro);
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
			
			System.out.print("pesoMochila: ");
			mago.getInventario().setPesoMochila(sc.nextInt());
			
			mago.getInventario().setPesoMaximo(100);
			
			mago.getInventario().setEspacioTotal(20);
			System.out.print("espacioOcupado: ");
			mago.getInventario().setEspacioOcupado(sc.nextInt());

			listaPersonajes.add(mago);
			mDAO.insertar(mago);
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

			System.out.print("pesoMochila: ");
			guerrero.getInventario().setPesoMochila(sc.nextInt());
			
			guerrero.getInventario().setPesoMaximo(100);
			
			guerrero.getInventario().setEspacioTotal(20);
			System.out.print("espacioOcupado: ");
			guerrero.getInventario().setEspacioOcupado(sc.nextInt());

			listaPersonajes.add(guerrero);

			gDAO.insertar(guerrero);

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
		personaje.setInventario(new InventarioDTO());

		ItemDTO item1 = new ItemDTO();
		item1.setNombre("escudo");
		item1.setDescripcion("escudoromano");
		item1.setAtaque(10);
		item1.setDefensa(12);
		item1.setEspacio(1);
		item1.setMagico(10);
		item1.setPeso(10);
		item1.setPrecio(20);
		personaje.getInventario().getMochila().add(item1);
		personaje.getInventario().setEspacioOcupado(10);
		personaje.getInventario().setEspacioTotal(20);
		personaje.getInventario().setPesoMaximo(100);
		personaje.getInventario().setPesoMochila(50);

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
		personaje1.setInventario(new InventarioDTO());
		ItemDTO item2 = new ItemDTO();
		item2.setNombre("Espada Dardo");
		item2.setDescripcion("espadapesada");
		item2.setAtaque(10);
		item2.setDefensa(12);
		item2.setEspacio(1);
		item2.setMagico(10);
		item2.setPeso(1);
		item2.setPrecio(10);
		personaje1.getInventario().getMochila().add(item2);
		personaje1.getInventario().setEspacioOcupado(10);
		personaje1.getInventario().setEspacioTotal(20);
		personaje1.getInventario().setPesoMaximo(100);
		personaje1.getInventario().setPesoMochila(50);

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

		personaje2.setInventario(new InventarioDTO());
		ItemDTO item3 = new ItemDTO();
		item3.setNombre("arco");
		item3.setDescripcion("arco");
		item3.setAtaque(10);
		item3.setDefensa(12);
		item3.setEspacio(1);
		item3.setMagico(10);
		item3.setPeso(10);
		item3.setPrecio(20);
		personaje2.getInventario().getMochila().add(item3);
		personaje2.getInventario().setEspacioOcupado(10);
		personaje2.getInventario().setEspacioTotal(20);
		personaje2.getInventario().setPesoMaximo(100);
		personaje2.getInventario().setPesoMochila(50);

		listaPersonajes.add(personaje2);

	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * para mostrar la lista de personajes
	 */
	public void mostrarListaPesonajes() {
		// System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i);
			// System.out.println(aux.toString());
			switch (aux.getTipo()) {
			case "Picaro":
				System.out.println("\n");
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
				PicaroDTO p = (PicaroDTO) aux;
				
				System.out.println("PERSONAJE " + i + ": " + p.toString());
				break;
			case "Mago":
				System.out.println("\n");
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
				MagoDTO m = (MagoDTO) aux;
				
				System.out.println("PERSONAJE " + i + ": " + m.toString());

				break;
			case "Guerrero":
				System.out.println("\n");
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
				GuerreroDTO g = (GuerreroDTO) aux;
			
				System.out.println("PERSONAJE " + i + ": " + g.toString());
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
		// System.out.println(aux.toString());

		switch (aux.getTipo()) {
		case "Picaro":
			PicaroDTO p = (PicaroDTO) aux;
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
			System.out.println(p.toString());
			break;
		case "Mago":
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
			MagoDTO m = (MagoDTO) aux;
			System.out.println(m.toString());

			break;
		case "Guerrero":
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
			GuerreroDTO g = (GuerreroDTO) aux;
			System.out.println(g.toString());
			break;
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * para modificar los datos de los personajes
	 */
	public void modificarDatos(String Nombre) {

		PersonajeDTO aux = Buscar(Nombre);
		// String op = null;
		// while(op != "s") {

		// FALTA HACER UN BUCLE PARA QUE PUEDA SEGIR ELIGIENDO QUE ATRIBUTOS CAMBIAR
		// ANTES DE SALIR

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
			pDAO.actualizar(picaro);

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
			mDAO.actualizar(mago);
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

			gDAO.actualizar(guerrero);
			break;

		}

	}

	// }

	// ---------------------------------------------------------------------------------------------------------------------------

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * eliminar los personajes
	 * 
	 * @param Nombre le pasamos el nombre del personaje que queremos eliminar
	 */
	public void eliminarPersonaje(String Nombre) {
		Boolean eliminado = false;
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i); // al utilizar esta si que me funciona y lo elimina pero como que
														// se salta uno y me pone que no se a encontrado el nombre pero
														// si que lo elimina
			// PersonajeDTO aux = BuscarPersonaje(Nombre);
			// PersonajeDTO aux = Buscar(Nombre);
			if (Nombre.equals(aux.getNombre())) {

				if (aux.getTipo().equals("Guerrero")) {
					gDAO.borrar((GuerreroDTO) aux);

				}
				if (aux.getTipo().equals("Mago")) {
					mDAO.borrar((MagoDTO) aux);

				}
				if (aux.getTipo().equals("Picaro")) {
					pDAO.borrar((PicaroDTO) aux);

				}
				listaPersonajes.remove(i);
				eliminado = true;
			}
		}

		if (eliminado == true) {
			System.out.println("Personaje eliminado");
		} else {
			System.out.println("No se ha encontrado");
		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * añadir unnnuevo itme
	 * 
	 * @param Nombre del item que queremos añadir
	 */
	public void agregarItem(String Nombre) {
		ItemDTO objeto = new ItemDTO();
		// pedir los datos de item como en los personejes

		System.out.println("Nombre del Item");
		objeto.setNombre(sc.nextLine());
		System.out.println("Descripcion");
		objeto.setDescripcion(sc.nextLine());
		System.out.println("Defensa");
		objeto.setDefensa(sc.nextInt());
		System.out.println("Ataque");
		objeto.setAtaque(sc.nextInt());
		System.out.println("Magico");
		objeto.setMagico(sc.nextInt());
		System.out.println("Espacio");
		objeto.setEspacio(sc.nextInt());
		System.out.println("Precio");
		objeto.setPrecio(sc.nextDouble());
		System.out.println("Peso");
		objeto.setPeso(sc.nextInt());
		iDAO.insertar(objeto);
		anadirObjeto(Nombre,objeto);
		
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param Nombre
	 */
	public void mostrarInventario(String Nombre) {

		PersonajeDTO aux = Buscar(Nombre);
		System.out.println(aux.getInventario().toString());

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 */
	public void mostrarListaPesonajesConInventario() {
		// System.out.println("Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo");
		for (int i = 0; i < listaPersonajes.size(); i++) {
			PersonajeDTO aux = listaPersonajes.get(i);
			// System.out.println(aux.toString());
			switch (aux.getTipo()) {
			case "Picaro":
				
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
				PicaroDTO p = (PicaroDTO) aux;
				
				System.out.println("PERSONAJE " + i + ": " + p.toString());
				System.out.println("\n");
				System.out.println(
						"Mochila:pesoMochila| pesoMaximo | espacioTotal | espacioOcupado |ITEM: Nombre | Descripcion | Defensa | Ataque | MAgico | Espacio |Precio |Peso");
				System.out.println("Mochila " + i + ":" + p.getInventario().toString());
				System.out.println("\n");
				break;
			case "Mago":
				
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
				MagoDTO m = (MagoDTO) aux;
				
				System.out.println("PERSONAJE " + i + ": " + m.toString());
				System.out.println("\n");
				System.out.println(
						"Mochila:pesoMochila| pesoMaximo | espacioTotal | espacioOcupado |ITEM: Nombre | Descripcion | Defensa | Ataque | MAgico | Espacio |Precio |Peso");
				System.out.println("Mochila " + i + ":"+ m.getInventario().toString());
				System.out.println("\n");
				break;
			case "Guerrero":
				
				System.out.println(
						"\t  Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
				GuerreroDTO g = (GuerreroDTO) aux;
				
				System.out.println("PERSONAJE " + i + ": " + g.toString());
				System.out.println("\n");
				System.out.println(
						"Mochila:pesoMochila| pesoMaximo | espacioTotal | espacioOcupado |ITEM: Nombre | Descripcion | Defensa | Ataque | MAgico | Espacio |Precio |Peso");
				System.out.println("Mochila " + i + ":" + g.getInventario().toString());
				System.out.println("\n");
				break;
			}
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param Nombre
	 */

	public void informacionPersonajeconInventario(String Nombre) {

		PersonajeDTO aux = Buscar(Nombre);
		// System.out.println(aux.toString());

		switch (aux.getTipo()) {
		case "Picaro":
			PicaroDTO p = (PicaroDTO) aux;
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|Esconder|AbrirCerradura|AtaqueFurtivo");
			System.out.println(p.toString());

			System.out.println(p.getInventario().toString());
			break;
		case "Mago":
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|BonificacionPiromancia|BonificacionNigromancia|BonificacionIlusion|BonificacionTransmutación");
			MagoDTO m = (MagoDTO) aux;
			System.out.println(m.toString());
			System.out.println("NOMBRE|DESCRIPCION| | | |");
			System.out.println(m.getInventario().toString());

			break;
		case "Guerrero":
			System.out.println(
					"Nombre|Nivel|Vida|Fuerza|Destreza|Constitucion|Inteligencia|Oro|Tipo|ModoBerserker|BonificacionArmaligera|BonificacionArmapesada");
			GuerreroDTO g = (GuerreroDTO) aux;
			System.out.println(g.toString());
			System.out.println(g.getInventario().toString());
			break;
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param objeto
	 * @param nombrePersonaje
	 */

	public void anadirObjeto(String nombrePersonaje,ItemDTO objeto) {

		PersonajeDTO personaje = Buscar(nombrePersonaje);
		
		
		personaje.getInventario().anadirObjeto(objeto);
		
		//personaje.getInventario().getMochila().add(objeto);
		//iDAO.insertar(objeto);

		/*
		 * ItemDTO item1 = new ItemDTO(); item1.setNombre(nombre);
		 * item1.setDescripcion("DAGA"); item1.setAtaque(10); item1.setDefensa(12);
		 * item1.setEspacio(1); item1.setMagico(10); item1.setPeso(10);
		 * item1.setPrecio(20); personaje.getInventario().getMochila().add(item1);
		 */

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param nombreObjeto
	 * @param nombrePersonaje
	 */
	public void modificarDatosObjeto(String nombreObjeto, String nombrePersonaje) {

		PersonajeDTO personaje = Buscar(nombrePersonaje);

		ArrayList<ItemDTO> mochila = personaje.getInventario().getMochila();
		for (int i = 0; i < mochila.size(); i++) {
			if (mochila.get(i).getNombre().equals(nombreObjeto)) {
				ItemDTO objeto = mochila.get(i);
				System.out.println("Introduce la nueva descripcion");
				String descripcion = sc.nextLine();
				objeto.setDescripcion(descripcion);
				System.out.println("Introduce la nueva Defensa");
				int defensa = sc.nextInt();
				objeto.setDefensa(defensa);
				System.out.println("Introduce el nuevo Ataque");
				int ataque = sc.nextInt();
				objeto.setAtaque(ataque);
				System.out.println("Introduce el nuevo Magico");
				int magico = sc.nextInt();
				objeto.setMagico(magico);
				System.out.println("Introduce el nuevo espacion");
				int espacio = sc.nextInt();
				objeto.setEspacio(espacio);
				System.out.println("Introduce el nuevo Precio");
				double precio = sc.nextDouble();
				objeto.setPrecio(precio);

				System.out.println("Introduce el nuevo Peso");
				int peso = sc.nextInt();
				objeto.setPeso(peso);

				// AÑADIR EL RESTO DE APARTADOS DE ITEM
				/*
				 * private int defensa; private int ataque; private int magico; private int
				 * espacio; private double precio; private int peso;
				 */
			}
		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @param nombreObjeto
	 * @param nombrePersonaje
	 */
	public void eliminarObjeto(String nombreObjeto, String nombrePersonaje) {

		PersonajeDTO personaje = Buscar(nombrePersonaje);

		ArrayList<ItemDTO> mochila = personaje.getInventario().getMochila();
		for (int i = 0; i < mochila.size(); i++) {
			if (mochila.get(i).getNombre().equals(nombreObjeto)) {
				iDAO.borrar(mochila.get(i));
				mochila.remove(i);

			}
		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 */
	public void mostrarInventarios() {

		for (int i = 0; i < listaPersonajes.size(); i++) {
			mostrarInventario(listaPersonajes.get(i).getNombre());
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @throws IOException
	 */
	public void guardarBackup() throws IOException {
		File f = new File("ARCHIVO.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fos);

		os.writeObject(this.listaPersonajes);
		os.close();

	}

	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void cargarBackup() throws IOException, ClassNotFoundException {

		File f = new File("ARCHIVO.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream is = new ObjectInputStream(fis);
		this.listaPersonajes = (ArrayList<PersonajeDTO>) is.readObject();

	}

	// ---------------------------------------------------------------------------------------------------------------------------

	public void mostrarPersonajeCategoria(String categoria, String nombreObjeto) {
		// Mostrar un listado de personajes que, dada una determinada categoría, tengan
		// un objeto concreto dado su nombre.

		PersonajeDTO miPersonaje = null;

		boolean encontrado = false;
		for (int i = 0; i < this.listaPersonajes.size(); i++) {

			if (this.listaPersonajes.get(i).getClass().getName().indexOf(categoria) > -1) {
				System.out.println("Encontrada categoría");
				// Personaje de la categoría
				// tiene el objeto?
				// Personaje -> Inventario -> Item

				InventarioDTO inventarioPersonaje = this.listaPersonajes.get(i).getInventario();
				ItemDTO objeto = null;

				// Buscamos el objeto dentro del inventario

				for (int j = 0; j < inventarioPersonaje.getMochila().size(); j++) {
					System.out.println(
							"Objeto: " + inventarioPersonaje.getMochila().get(j).getNombre() + " vs " + nombreObjeto);
					if (inventarioPersonaje.getMochila().get(j).getNombre().equalsIgnoreCase(nombreObjeto)) {
						objeto = inventarioPersonaje.getMochila().get(j);
					}
				}

				if (objeto != null) {
					System.out.println("Encontrado: " + listaPersonajes.get(i).toString());
				} else {
					System.out.println("No encontrado: " + categoria + " " + nombreObjeto);
				}
			}
		}
	}

	// ----------------------------------------------------------------------------------------------------------

	public void comercioPersonaje(String nombrePersonaje) {
		boolean encontrado = false;
		PersonajeDTO personaje = null;
		PersonajeDTO personaje2 = null; 
		ItemDTO objeto = null;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.listaPersonajes.size(); i++) {
			if (this.listaPersonajes.get(i).getNombre().equals(nombrePersonaje)) {
				// System.out.println(this.listaPersonajes.get(i).toString());
				personaje = this.listaPersonajes.get(i);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se ha encontrado el personaje: " + nombrePersonaje);
		} else {
			// Empezamos a comerciar
			// Mostrar los items de los demás personajes

			for (int i = 0; i < this.listaPersonajes.size(); i++) {
				if (!this.listaPersonajes.get(i).getNombre().equals(nombrePersonaje)) {
					// System.out.println("Seleccion:" + this.listaPersonajes.get(i).toString());
					InventarioDTO inventarioDelPersonaje = this.listaPersonajes.get(i).getInventario();

					for (int j = 0; j < inventarioDelPersonaje.getMochila().size(); j++) {

						System.out.println(inventarioDelPersonaje.getMochila().get(j).getNombre());
					}
				}
			}

			System.out.println("Escribe el nombre dle objeto a 'compara'");
			var nombreObjeto = sc.nextLine(); // Pido el nombre del objeto

			// Miro a ver si el nombre es único

			int contador = 0;
			ArrayList<String> personajeAndObjeto = new ArrayList<String>();
			for (int i = 0; i < this.listaPersonajes.size(); i++) {
				if (!this.listaPersonajes.get(i).getNombre().equals(nombrePersonaje)) {

					InventarioDTO inventarioDelPersonaje = this.listaPersonajes.get(i).getInventario();

					for (int j = 0; j < inventarioDelPersonaje.getMochila().size(); j++) {

						if (inventarioDelPersonaje.getMochila().get(j).getNombre().equals(nombreObjeto)) {

							personajeAndObjeto.add(inventarioDelPersonaje.getMochila().get(j).getNombre() + "\t"
									+ this.listaPersonajes.get(j).getNombre());
							personaje2 = this.listaPersonajes.get(i);
							objeto = inventarioDelPersonaje.getMochila().get(j);
							contador++;
						}

						// System.out.println(inventarioDelPersonaje.getMochila().get(i).getNombre());
					}
				}
			}

			if (contador > 1) {

				// Primero hay que saber de quien es el objeto, con quien queremos comerciar
				System.out.println("Mas de un personaje lo tiene");
				// Imprimir la lista que hemos previamente montado
				System.out.println("Objeto\tPersonaje");
				for (int i = 0; i < personajeAndObjeto.size(); i++) {
					System.out.println(personajeAndObjeto.get(i));
				}

				System.out.println("Escribe el nombre del personaje a 'comprar'");
				var nombrePersonaje2 = sc.next();

				for (int i = 0; i < this.listaPersonajes.size(); i++) {
					if (this.listaPersonajes.get(i).getNombre().equals(nombrePersonaje)) {
						personaje2 = this.listaPersonajes.get(i);
					}
				}

				System.out.println("A comerciar");

				// Comerciar es coger el objeto de un personaje y ponerselo a otro

				// Inicio comerciar

				// personaje // es mi personaje
				// personaje2 // al que le quito el objeto
				// objeto // objeto a comerciar

				System.out.println(personaje.getNombre() + " recibe el objeto " + objeto.getNombre() + " de "
						+ personaje2.getNombre());

				personaje.getInventario().anadirObjeto(objeto);
				iDAO.insertar(objeto);
				personaje2.getInventario().quitarObjeto(objeto);
				iDAO.borrar(objeto);

				personaje.setOro((int) (personaje.getOro() - objeto.getPrecio()));
				personaje2.setOro((int) (personaje.getOro() + objeto.getPrecio()));

				System.out.println("Comercio completo");

				// Fin comerciar

			} else if (contador == 1) {
				System.out.println("A comerciar");

				// Comerciar es coger el objeto de un personaje y ponerselo a otro

				// Inicio comerciar

				// personaje // es mi personaje
				// personaje2 // al que le quito el objeto
				// objeto // objeto a comerciar

				System.out.println(personaje.getNombre() + " recibe el objeto " + objeto.getNombre() + " de "
						+ personaje2.getNombre());

				personaje.getInventario().anadirObjeto(objeto);
				iDAO.insertar(objeto);
				personaje2.getInventario().quitarObjeto(objeto);
				iDAO.borrar(objeto);

				personaje.setOro((int) (personaje.getOro() - objeto.getPrecio()));
				personaje2.setOro((int) (personaje.getOro() + objeto.getPrecio()));

				System.out.println("Comercio completo");

				// Fin comerciar

			} else {
				System.out.println("No hay");
			}

		}
	}

}
