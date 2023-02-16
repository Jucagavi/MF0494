package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * M�todo de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * M�todo para mostrar por pantalla el vector pasado como par�metro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	/**
	 * Función 
	 */
	public static void calculaSancion(double tasa) {
		
		String sancion="";
		
		if (tasa<0.25){
			sancion="Sin sanción";
		} else if (tasa>=0.25 && tasa<0.50){
			sancion="500 € y pérdida de 4 puntos";
		} else if (tasa>=0.50 && tasa<0.60) {
			sancion="1000 € y pérdida de 6 puntos";
		} else if (tasa>=0.60) {
			sancion="Retirada del carnet y de 3 a 6 meses de cárcel";
		}
		
		System.out.printf("El conductor con tasa de alcoholemia %.2f tiene la sanción de %s.",tasa,sancion);	
	}
	
	public static int[] restaPuntos (int [] puntos, int [] sanciones) {
		int resta[] = new int [6];
		
		for (int i=0; i<puntos.length; i++) {
			resta[i]=puntos[i]-sanciones[i];
			if (resta[i]<0) {
				resta[i]=0;
			}
		}
		return resta;
	}
}
