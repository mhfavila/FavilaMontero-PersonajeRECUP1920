package Primero;

import java.util.ArrayList;
import java.util.Scanner;

public class Primero {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String > palabras = new ArrayList<String>();
		ArrayList <String > definiciones = new ArrayList<String>();
		String palabra = null;
		anyadirPalabra();
		String palabra1 = null;
		mostrarPalabra(palabra1);

	}
	public static void anyadirPalabra(){
		int i = 0;
		int f = 0;
		do {
			System.out.println("Introduce la palabra ");
			
			if (f!=-1) {
			System.out.println("Introduce la definicion ");
			}
			System.out.println("Quieres añadir mas palabras sino teclea -1");
			i = sc.nextInt();
		}while(i!=-1);
		
	}
	
	public static String mostrarPalabra(String palabra) {
		
		
		
		
		return palabra;
		
		
		
	}

}
