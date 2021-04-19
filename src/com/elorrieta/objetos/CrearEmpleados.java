package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearEmpleados {

	public static void main(String[] args) {

		int sueldo = 0;
		String nombre = "";
		boolean becario = false;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Introduce nombre del empleado:");
			nombre = sc.nextLine();

		} while (nombre.length() <= 5);

		System.out.println("¿Eres becario?:");
		String respuesta = sc.nextLine();
		if ("s".equalsIgnoreCase(respuesta) || "si".equalsIgnoreCase(respuesta)) {
			becario = true;

			System.out.println("Tu sueldo es " + sueldo);
		} else {
			System.out.println("Sueldo empleado: ");
			sueldo = Integer.parseInt(sc.nextLine());
			do {
				if (sueldo <= Empleado.SUELDO_MINIMO) {
					System.out.println("Introduce de nuevo tu sueldo: ");
					sueldo = Integer.parseInt(sc.nextLine());
				} else {
					System.out.println("Sueldo correcto");
				}

			} while (sueldo <= Empleado.SUELDO_MINIMO);
		}
		Empleado p1 = new Empleado();
		p1.setNombre(nombre);
		p1.setBecario(becario);
		p1.setSueldo(sueldo);

		System.out.println(p1);
		sc.close();

	}

}
