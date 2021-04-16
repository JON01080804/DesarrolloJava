package com.elorrieta.cadenasdetexto;

import java.util.Scanner;

public class IngresoNombreApellido {

	public static void main(String[] args) {
		String nombre1;
		String nombre2;
		int edad1 = 0;
		int edad2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese nombre 1:");
		nombre1 = sc.nextLine();
		System.out.println("Ingrese edad 1:");
		edad1 = Integer.parseInt(sc.nextLine());
		System.out.println("Ingrese nombre 2:");
		nombre2 = sc.nextLine();
		System.out.println("Ingrese edad2:");
		edad2 = Integer.parseInt(sc.nextLine());

		if (edad1 > edad2) {
			System.out.println("El mayor es:" + nombre1);
		} else {
			System.out.println("El mayor es:" + nombre2);
		}

		sc.close();
	}// main

}
