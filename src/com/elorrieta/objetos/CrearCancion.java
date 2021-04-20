package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("---- Introduce tu canción --------");
		System.out.println("----------------------------------------");

		Scanner sc = new Scanner(System.in);
		int duracion = 0;

		Cancion tuCancion = new Cancion();

		// Pedir datos por consola
		System.out.println("Dime el nombre:");
		String nombre = sc.nextLine();
		tuCancion.setNombre(nombre);

		System.out.println("Dime el nombre del grupo:");
		String grupo = sc.nextLine();
		tuCancion.setGrupo(grupo);

		System.out.println("Duracion de la cancion:");

		boolean repetir = true;

		do {
			try {
				duracion = Integer.parseInt(sc.nextLine());
				tuCancion.setDuracion(duracion);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Vuelve a introducir la duracion ");

			}
		} while (repetir);

		// tu cancion

		sc.close();
	}

}
