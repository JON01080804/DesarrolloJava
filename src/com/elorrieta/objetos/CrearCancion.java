package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("---- Introduce tu canción --------");
		System.out.println("----------------------------------------");

		Scanner sc = new Scanner(System.in);

		// Pedir datos por consola
		System.out.println("Dime el nombre:");
		String nombre1 = sc.nextLine();

		System.out.println("Dime el nombre del grupo:");
		String grupo = sc.nextLine();

		System.out.println("Duracion de la cancion:");
		int duracion = Integer.parseInt(sc.nextLine());
		if (duracion > 400) {
			System.out.println("La cancion es muy larga");
		} else {
			System.out.println("La cancion tiene una duracion correcta");
		}

		// tu cancion
		Cancion tuCancion = new Cancion();
		tuCancion.setNombre(nombre1);
		tuCancion.setGrupo(grupo);
		tuCancion.setDuracion(duracion);

		sc.close();
	}

}
