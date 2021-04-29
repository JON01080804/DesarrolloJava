package herencia;

public class Avion extends Vehiculo {

	private int alas;

	public Avion() {
		super();
		this.alas = 2;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	@Override
	public String toString() {
		return "Avion [alas=" + alas + ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor()
				+ ", getAsientos()=" + getAsientos() + ", getRuedas()=" + getRuedas() + "]";
	}

	@Override
	public void arrancar() {
		System.out.println("Burrum, burrum");

	}
}
