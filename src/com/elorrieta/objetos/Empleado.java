package com.elorrieta.objetos;

//Crear una nueva clase para crear empleados. van a tener nombre (anonimo),

// booleano si es becario o no y sueldo.
// Crear constructor vacio donde el nombre inicial sea becario y el sueldo
// inicial 600 €.
// Crear una clase nueva para solicitar los datos de un empleado. esta clase nos
// solicitara el nombre del empleado (mayor de 5 caracteres), nos preguntara si
// es becario o no, si es becario sueldo = 0, si no lo es nos pedira por
// pantalla el sueldo que debe ser mayor al sueldo minimo interprofesional.

public class Empleado {

	public static final int SUELDO_MINIMO = 1000; // COMO ES PUBLICA PODEMOS ACCEDER DESDE OTRAS CLASES.

	// atributos
	private String nombre;
	private int sueldo;
	private boolean becario;

	public Empleado() {
		super();
		this.nombre = "";
		this.sueldo = SUELDO_MINIMO;
		this.becario = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isBecario() {
		return becario;
	}

	public void setBecario(boolean becario) {
		this.becario = becario;
		if (becario) {
			this.sueldo = 0;
		}
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", sueldo=" + sueldo + ", becario=" + becario + "]";
	}

}
