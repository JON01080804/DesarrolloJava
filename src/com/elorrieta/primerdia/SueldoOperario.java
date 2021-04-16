package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * @author Jon Gonzalez <br>
 *         <br>
 *         <p>
 *         Ejercicio basico
 *         </p>
 */

public class SueldoOperario {

	public static void main(String[] ar) {

		// declarar variables=> TIPO NOMBRE= VALOR;
		int horasTrabajadas = 0;
		int horasExtras = 0;
		float costoHora = 0;
		float costoHoraExtra = 0;
		float sueldo = 0;

		// VARIABLE PARA LEER DATOS POR TECLADO
		Scanner teclado = new Scanner(System.in);

		// PEDIR DATOS X PANTALLA
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
		// GUARDAR EN LA VARIABLE EL VALOR LEIDO POR PANTALLA
		horasTrabajadas = teclado.nextInt();
		System.out.print("Ingrese la cantidad de horas extras trabajadas por el empleado:");
		horasExtras = teclado.nextInt();
		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextFloat();
		System.out.print("Ingrese el valor de la hora extra:");
		costoHoraExtra = teclado.nextFloat();
		sueldo = (horasTrabajadas * costoHora) + (horasExtras * costoHoraExtra);
		System.out.print("El empleado debe cobrar:");
		System.out.print(sueldo);
	}
}
