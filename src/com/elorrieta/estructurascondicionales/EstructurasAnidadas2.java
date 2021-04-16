package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EstructurasAnidadas2 {

	public static void main(String[] args) {
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float media = 0;
		final float TOTAL_NOTAS = 3;
		final float MEDIA_PROMOCIONADO = 7;
		final float MEDIA_REGULAR = 4;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce nota1:");
		nota1 = sc.nextFloat();
		System.out.println("Introduce nota2:");
		nota2 = sc.nextFloat();
		System.out.println("Introduce nota3:");
		nota3 = sc.nextFloat();

		media = (nota1 + nota2 + nota3) / TOTAL_NOTAS;

		System.out.println("La media es:" + media);

		if (media >= MEDIA_PROMOCIONADO) {
			System.out.println("Promocionado");

		} else if (media >= MEDIA_REGULAR) {
			System.out.println("Regular");

		} else {
			System.out.println("Reprobado");
		}

		sc.close();

	}// end main

}
