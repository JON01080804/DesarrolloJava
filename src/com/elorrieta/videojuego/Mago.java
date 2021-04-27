package com.elorrieta.videojuego;

public class Mago extends Personaje {

	String poder;

	public Mago(String nombre, float energia, String poder) {
		super(nombre, energia);
		this.poder = poder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Mago [poder=" + poder + ", nombre=" + nombre + ", energia=" + energia + "]";
	}

}
