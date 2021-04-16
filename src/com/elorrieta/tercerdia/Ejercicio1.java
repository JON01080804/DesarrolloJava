// pedir numero por pantalla y decir si es par o impar.

package com.elorrieta.tercerdia;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		sc.close();
	}// main

}
