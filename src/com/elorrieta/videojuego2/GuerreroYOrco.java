package com.elorrieta.videojuego2;

public class GuerreroYOrco {

	public static void main(String[] args) {

		System.out.println("--------guerrero 1 ----------------");
		Guerrero g1 = new Guerrero(2.5, "blanca", 250, 95, 150, 250);
		System.out.println(g1.toString());
		g1.saludar();
		g1.atacar();
		g1.bailar();
		g1.correr();

		System.out.println("--------- guerrero 2 ------------------");
		Guerrero g2 = new Guerrero();
		g2.setAltura(3);
		g2.setColorDePiel("morada");
		g2.setVida(250);
		g2.setInteligencia(100);
		g2.setAgilidad(175);
		g2.setFuerza(310);
		System.out.println(g2);

		System.out.println("----------Orco1-----------------");

		Orco o1 = new Orco();
		o1.setArma("Hacha");
		o1.setAltura(1.75);
		o1.setFuerza(310);
		System.out.println(o1);

		System.out.println("----------Orco2-----------------");
		Orco o2 = new Orco(1.56, "naranja", 250, 25, 175, 305);
		o2.setArma("Pedo oloroso");
		System.out.println(o2);
		o2.saludar();
	}

}
