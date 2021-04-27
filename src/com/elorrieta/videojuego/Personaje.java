package com.elorrieta.videojuego;

import com.elorrieta.objetos.Cantarin;

public class Personaje implements Cantarin {

	String nombre;
	float energia;

	public Personaje() {

	}

	public Personaje(String nombre) {
		super();
		this.nombre = nombre;

	}

	public Personaje(String nombre, float energia) {
		super();
		this.nombre = nombre;
		this.energia = energia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getEnergia() {
		return energia;
	}

	public void setEnergia(float energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", energia=" + energia + "]";
	}

	@Override
	public void cantar() {
		System.out.println("Me llamo :" + this.nombre + " y mi energia es: " + this.energia);

	}

}
