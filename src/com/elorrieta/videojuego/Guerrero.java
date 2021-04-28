package com.elorrieta.videojuego;

public class Guerrero extends Personaje {

	private String arma;

	public Guerrero(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String combatir(int energiaGastar) {
		int energiaNueva = (int) (getEnergia() - energiaGastar);
		setEnergia(energiaNueva);
		return getArma() + " " + energiaGastar;
	}

	@Override
	public String toString() {
		return "Guerrero [arma=" + arma + ", Nombre " + getNombre() + ", getEnergia()=" + getEnergia() + "]";
	}

}
