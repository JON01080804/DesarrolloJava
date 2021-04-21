package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("---- Introduce tu canción --------");
		System.out.println("----------------------------------------");

		Scanner sc = new Scanner(System.in);
		int duracion = 0;

		Cancion c = new Cancion();

		// Pedir datos por consola
		System.out.println("Dime el nombre:");
		String nombre = sc.nextLine();
		c.setNombre(nombre);

		System.out.println("Dime el nombre del grupo:");
		String grupo = sc.nextLine();
		c.setGrupo(grupo);

		System.out.println("Duracion de la cancion:");

		System.out.println("Duracion en minutos de la cancion ( no puede exceder " + Cancion.DURACION_MAXIMA + " min)");
		boolean repetir = true;
		do {
			try {
				duracion = Integer.parseInt(sc.nextLine());
				c.setDuracion(duracion);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("duracion incorecta, debe ser un numero entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (repetir);

		// tu cancion

		sc.close();
	}

}
