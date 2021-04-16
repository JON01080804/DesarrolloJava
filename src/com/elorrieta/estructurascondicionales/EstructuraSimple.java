package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EstructuraSimple {

	public static void main(String[] args) {
		int sueldo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("El sueldo del trabajador es:");
		sueldo = sc.nextInt();
		if (sueldo > 3000) {
			System.out.println("Debe abonar impuestos");
		} else {
			System.out.println("No debe abonar impuestos");
		}
		sc.close();
	}// end main

}
