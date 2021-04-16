package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EstructuraCompuesta {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce num1:");
		num1 = sc.nextInt();
		System.out.println("Introduce num2:");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		if (num1 == num2) {
			System.out.println("son iguales");
		}

		sc.close();
	}// main

}
