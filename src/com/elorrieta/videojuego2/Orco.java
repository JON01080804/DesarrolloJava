package com.elorrieta.videojuego2;

public class Orco extends Guerrero {

	private String arma;

	public Orco() {
		super();
		this.arma = arma;
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
		return "Orco [arma=" + arma + ", getAltura()=" + getAltura() + ", getColorDePiel()=" + getColorDePiel()
				+ ", getVida()=" + getVida() + ", getInteligencia()=" + getInteligencia() + ", getAgilidad()="
				+ getAgilidad() + ", getFuerza()=" + getFuerza() + "]";
	}

}
