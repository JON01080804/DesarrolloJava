package com.elorrieta.videojuego2;

public class Guerrero {

	private double altura;
	private String colorDePiel;
	private int vida;
	private int inteligencia;
	private int agilidad;
	private int fuerza;

	public static final double ALTURA_MINIMA = 1.2;
	public static final double ALTURA_MAXIMA = 2;

	public static final double FUERZA_MINIMA = 75;
	public static final double FUERZA_MAXIMA = 300;

	public Guerrero() {
		super();
		this.altura = 0;
		this.colorDePiel = " ";
		this.vida = 0;
		this.inteligencia = 0;
		this.agilidad = 0;
		this.fuerza = 0;
	}

	public Guerrero(double altura, String colorDePiel, int vida, int inteligencia, int agilidad, int fuerza) {
		this();
		// this.altura = altura;
		setAltura(altura);
		this.colorDePiel = colorDePiel;
		this.vida = vida;
		this.inteligencia = inteligencia;
		this.agilidad = agilidad;
		// this.fuerza = fuerza;
		setFuerza(fuerza);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double argaltura) {
		if (argaltura >= ALTURA_MINIMA && argaltura <= ALTURA_MAXIMA) {
			this.altura = argaltura;
		} else {
			if (argaltura < 1.2) {
				System.out.println("¿Quieres crear un enano o que?");
				System.out.println("La estatura minima es 1.2 metros.");
				this.altura = 1.2;
			} else {

				if (argaltura > 2) {
					System.out.println("Gigantes todavia no estan disponibles...");
					System.out.println("La estatura maxima es 2 metros.");
					this.altura = 2;
				}

			}
		}

	}

	public String getColorDePiel() {
		return colorDePiel;
	}

	public void setColorDePiel(String colorDePiel) {
		this.colorDePiel = colorDePiel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerzaOtorgada) {
		if (fuerzaOtorgada <= FUERZA_MAXIMA && fuerzaOtorgada >= FUERZA_MINIMA) {
			this.fuerza = fuerzaOtorgada;
			System.out.println("Fuerza correcta");
		} else {
			System.out.println("Fuerza no es correcta");
		}
	}

	public void atacar() {
		System.out.println("¡Muere maldito!");
	}

	public void saludar() {
		System.out.println("¡Cuentame como paso!");
	}

	public void bailar() {
		System.out.println("¡Estoy bailando!");
	}

	public void correr() {
		System.out.println("¡A correr vagos!");
	}

	@Override
	public String toString() {
		return "Guerrero [altura=" + altura + ", colorDePiel=" + colorDePiel + ", vida=" + vida + ", inteligencia="
				+ inteligencia + ", agilidad=" + agilidad + ", fuerza=" + fuerza + "]";
	}

}
