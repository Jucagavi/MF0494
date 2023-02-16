/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe aqu� las sentencias del apartado 3
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce tasa de alcoholemia del conductor:");
		double tasa = teclado.nextDouble();

		Funciones.calculaSancion(tasa);
		
		int puntos[]= new int[6];
		System.out.println("\n\nIntroduce puntos del conductor:");
		Funciones.pedir_vector(puntos);
		
		int sanciones[]= new int[6];
		System.out.println("Introduce sanciones del conductor:");
		Funciones.pedir_vector(sanciones);
		
		int resta[] = Funciones.restaPuntos(puntos, sanciones);
		System.out.println("Puntos restantes del conductor:");
		Funciones.mostrar_vector(resta);
	}

}
