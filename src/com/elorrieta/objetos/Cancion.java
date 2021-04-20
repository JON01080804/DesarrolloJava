package com.elorrieta.objetos;

// lanzar una excepcion si la cancion tiene mas de 400 segundos. 
// Hacer aplicacion Java para crear cancion
public class Cancion {

	// atributos

	private String nombre;
	private String grupo;
	private int duracion;// segundos

	public Cancion() {
		super();
		this.nombre = " ";
		this.grupo = "anonima";
		this.duracion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public void setDuracion(int duracion) throws Exception {
		if (duracion > 400) {
			throw new Exception("si la duracion es superior a 400 segundos, la cancion es demasiado larga");
		}
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", grupo=" + grupo + ", duracion=" + duracion + "]";
	}

}
