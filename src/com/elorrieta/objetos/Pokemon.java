package com.elorrieta.objetos;

public class Pokemon {

	// atributos
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor Crea objetos de una clase

	public Pokemon() {
		super();
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = 0;
		this.isBrillante = false;
	}

	public Pokemon(String nombre) {
		this(); // llamamos al constructor de arriba
		this.nombre = nombre;
	}

	public Pokemon(String nombre, float precio) {
		this(); // cambiar super por this para hacer referencia al constructor vacio
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		if (isBrillante) { // return(isBrillante) ? (precio+20) : precio; OPERADOR TERNARIO
			return precio + 20;
		} else {
			return precio;
		}
	}

	/**
	 * Setea el precio
	 * 
	 * @param precio float en euros
	 * @throws Exception si el precio es < 0
	 */

	public void setPrecio(float precio) throws Exception {
//		this.precio = (precio >= 0) ? precio : 0; // OPERADOR TERNARIO
		if (precio < 0) {
			throw new Exception("el precio debe ser 0 o superior");
		}
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", precio=" + precio + ", numero=" + numero + ", isBrillante="
				+ isBrillante + "]";
	}

}