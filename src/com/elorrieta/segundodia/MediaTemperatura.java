package com.elorrieta.segundodia;

import java.util.Scanner;

public class MediaTemperatura {

	public static void main(String[] args) {
		// declarar variables
		float tempLunes = 0;
		float tempMartes = 0;
		float tempMiercoles = 0;
		float tempJueves = 0;
		float tempViernes = 0;
		float tempSabado = 0;
		float tempDomingo = 0;
		float tempMedia = 0;
		final int DIAS_SEMANA = 7;// final es para indicar que es una constante, siempre en Mayus

		// variable para introducir datos por teclado
		Scanner sc = new Scanner(System.in);

		// pedir datos x pantalla y guardar en la variable el dato introducido por
		// pantalla
		System.out.println("Temperatura Lunes:");
		tempLunes = sc.nextFloat();
		System.out.println("Temperatura Martes:");
		tempMartes = sc.nextFloat();
		System.out.println("Temperatura Miercoles:");
		tempMiercoles = sc.nextFloat();
		System.out.println("Temperatura Jueves:");
		tempJueves = sc.nextFloat();
		System.out.println("Temperatura Viernes:");
		tempViernes = sc.nextFloat();
		System.out.println("Temperatura Sabado:");
		tempSabado = sc.nextFloat();
		System.out.println("Temperatura Domingo:");
		tempDomingo = sc.nextFloat();

		tempMedia = (tempLunes + tempMartes + tempMiercoles + tempJueves + tempViernes + tempSabado + tempDomingo)
				/ DIAS_SEMANA;
		System.out.println("La temeperatura media es:" + tempMedia);

		//
		if (tempMedia < 20) {
			System.out.print("Hace frio");
		} else {
			System.out.print("Hace calor");
		}

	}

}
