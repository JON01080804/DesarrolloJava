package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EstructuraRepetitivasFor2 {

	public static void main(String[] args) {
		float temperatura = 0;
		float total = 0;// suma de todas las temperaturas
		int numeroTemperaturas = 0;
		final int SALIR = 888;
		Scanner teclado = new Scanner(System.in);

		// BUCLE para pedir temperaturas y sumarlas
		while (temperatura != SALIR) {

			System.out.println("Dime la temperatura (o 888 para salir):");
			temperatura = teclado.nextFloat();

			// realizar operaciones si no queremos SALIR
			if (temperatura != SALIR) {
				total += temperatura; // total = total + temperatura;
				numeroTemperaturas++;
			}
		}

		// mostrar media
		System.out.println("Media :" + (total / numeroTemperaturas));
		teclado.close();

	}// main

}
