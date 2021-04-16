package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EstructurasAnidadas {

	public static void main(String[] args) {
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		float media = 0;
		final int ASIGNATURAS = 3;
		final float MEDIA_PROMOCIONADO = 7;
		final float MEDIA_REGULAR = 4;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce nota1:");
		nota1 = sc.nextInt();
		System.out.println("Introduce nota2:");
		nota2 = sc.nextInt();
		System.out.println("Introduce nota3:");
		nota3 = sc.nextInt();

		media = (nota1 + nota2 + nota3) / ASIGNATURAS;

		System.out.println("La media es:" + media);

		if (media >= MEDIA_PROMOCIONADO) {
			System.out.println("Promocionado");
		} else {
			if (media >= MEDIA_REGULAR) {
				System.out.println("Regular");
			} else {
				System.out.println("Reprobado");
			}

		}
		sc.close();

	}// main

}