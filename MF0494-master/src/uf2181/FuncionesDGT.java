/**
 * 
 */
package uf2181;

/**
**
* Funciones varias para el examen MF0494
* @author Juan Carlos Garcia Villalon
*
*/
public class FuncionesDGT {

	/**
	 * Función que calcula la media de los elementos de un vector
	 * @param puntos int parámetro es un vector que se pasa de tipo entero
	 * @return double es el resultado de dividir la suma de los elementos 
	 * del vector dividido por el número de elementos
	 * @throws ArrayIndexOutOfBoundsException Excepción en caso de que el vector 
	 * tenga 0 elementos
	 */
	public static double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	
	
	/**
	 * Función que calcula la tasa maxima permitida de alcohol por un conductor
	 * @param tipoConductor String que dice si el conductor es General o Novel
	 * @param aire boolean será true cuando la tasa es en aire y false cuando la tasa es en sangre
	 * @return double es la tasa correspondiente según los parámetros introducidos
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
