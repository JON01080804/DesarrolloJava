package com.elorrieta.cadenasdetexto;

import java.util.Scanner;

public class IngresoNombreApellido2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String apenom1, apenom2;
		int edad1, edad2;
		System.out.print("Ingrese el apellido y el nombre:");
		apenom1 = teclado.nextLine();
		System.out.print("Ingrese edad:");
		edad1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Ingrese el apellido y el nombre:");
		apenom2 = teclado.nextLine();
		System.out.print("Ingrese edad:");
		edad2 = Integer.parseInt(teclado.nextLine());
		System.out.print("La persona de mayor edad es:");
		if (edad1 > edad2) {
			System.out.print(apenom1);
		} else {
			System.out.print(apenom2);
		}
		teclado.close();
	}// main

}
