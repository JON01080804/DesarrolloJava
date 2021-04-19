package com.elorrieta.metodos;

public class Utilidades {

	// main es un metodo donde vamos a ejecutar el programa
	public static void main(String[] args) {

		// el metodo saludar esta 'sobrecragado' se llama igual, pero tiene diferentes
		// parametros
		saludar();
		saludar("Don Pimpom");
		saludar("Josebita");

		saludar("Paco", "castellano");
		saludar("Patxi", "eus");

		float precio = calcularIva(100f, 21f);
		System.out.println("El precio con iva es " + precio);

		int resultado = suma(5, 10);
		System.out.println("la suma es " + resultado);

		int resultado1 = numeroMayor(5, 10, 20);
		System.out.println("El numero mayor es " + resultado1);

		boolean kapikua = isKapikua(321123);
		System.out.println("¿es kapikua? " + kapikua);
	}

	/* vamos a declarar nuevos metodos */

	/**
	 * metodo publico que no retorna nada 'void'. saluda por consola
	 */
	public static void saludar() {
		System.out.println("Aupa hay, que tal?");
	}

	/**
	 * Metodo para saludar por consola
	 * 
	 * @param nombre String con la persona a saludar
	 */
	public static void saludar(String nombre) {
		System.out.println("Kaixo " + nombre);
	}

	/**
	 * Metodo que saluda por consola
	 * 
	 * @param nombre String con el nombre de la persona a saludar
	 * @param idioma String, si pones "castellano" saluda en castellano, cualquier
	 *               otro valor en Euskera
	 */
	public static void saludar(String nombre, String idioma) {

		if ("castellano".equals(idioma)) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("Kaixo " + nombre);
		}
	}

	/**
	 * Calcula el IVA repercutido
	 * 
	 * @param precioSinIva float
	 * @param iva          float
	 * @return el precio mas el iva repercutido
	 */
	public static float calcularIva(float precioSinIva, float iva) {

		float precioConIva = precioSinIva + (precioSinIva * iva / 100);
		return precioConIva;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return la suma de num1 y num2
	 */
	public static int suma(int num1, int num2) {

		return num1 + num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return debe retornar el numero mayor
	 */
	public static int numeroMayor(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	/**
	 * 
	 * @param numero
	 * @return decir si el numero es kapikua o no
	 */
	public static boolean isKapikua(int numero) {

		int resto;
		int inverso = 0;
		int numeroSinModificar = numero;
		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}
		return numeroSinModificar == inverso;

	}// iskapikua

}