package com.elorrieta.videojuego;

public class Guerrero extends Personaje {

	String arma;

	public Guerrero(String nombre, float energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Guerrero [arma=" + arma + ", nombre=" + nombre + ", energia=" + energia + "]";
	}

}
