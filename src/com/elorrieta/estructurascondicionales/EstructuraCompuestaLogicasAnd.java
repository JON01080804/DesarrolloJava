package com.elorrieta.estructurascondicionales;

public class EstructuraCompuestaLogicasAnd {

	public static void main(String[] args) {
		// variables
		int num1 = 150;
		int num2 = 20;
		int num3 = 500;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Numero mayor es el " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("Numero mayor es el " + num2);
			} else {
				System.out.println("Numero mayor es el " + num3);
			}
		}

	}

}
