package com.elorrieta.videojuego2;

public class Orco extends Guerrero {

	private String arma;

	public Orco() {
		super();
		this.arma = " ";
	}

	public Orco(double altura, String colorDePiel, int vida, int inteligencia, int agilidad, int fuerza) {
		this();
		setAltura(altura);
		setColorDePiel(colorDePiel);
		setVida(vida);
		setInteligencia(inteligencia);
		setAgilidad(agilidad);
		setFuerza(fuerza);

	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		if (" ".equalsIgnoreCase(arma)) {
			System.out.println("Introduce un arma");

		} else {
			this.arma = arma;
		}
	}

	@Override
	public String toString() {
		return "Orco [arma=" + arma + ", Altura= " + getAltura() + ", ColorDePiel= " + getColorDePiel() + ", Vida= "
				+ getVida() + ", getInteligencia= " + getInteligencia() + ", getAgilidad= " + getAgilidad()
				+ ", getFuerza= " + getFuerza() + "]";
	}

}
