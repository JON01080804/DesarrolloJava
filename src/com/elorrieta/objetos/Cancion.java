package com.elorrieta.objetos;

// lanzar una excepcion si la cancion tiene mas de 400 segundos. 
// Hacer aplicacion Java para crear cancion
public class Cancion {

	// atributos

	private String nombre1;
	private String grupo;
	private int duracion;// segundos

	public Cancion() {
		super();
		this.nombre1 = " ";
		this.grupo = "anonima";
		this.duracion = 0;
	}

	public String getNombre() {
		return nombre1;
	}

	public void setNombre(String nombre) {
		this.nombre1 = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre1 + ", grupo=" + grupo + ", duracion=" + duracion + "]";
	}

}
