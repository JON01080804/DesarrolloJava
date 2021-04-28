package com.elorrieta.videojuego;

public class EjecutarJuego {

	public static void main(String[] args) {

		Guerrero g1 = new Guerrero("Adam", 100, "Espada");
		System.out.println(g1);
		g1.cantar();

		Mago m1 = new Mago("Merlin", 100, "Invisible");
//		System.out.println(m1);
		

	}

}
