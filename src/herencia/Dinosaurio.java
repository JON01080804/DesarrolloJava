package herencia;

public class Dinosaurio extends Animal {

	float altura;

	public Dinosaurio() {
		super();
		this.altura = altura;
	}

	public Dinosaurio(float altura, String nombre) {
		super(nombre);
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Dinosaurio [altura=" + altura + ", Nombre " + getNombre() + "]";
	}

	@Override
	public void cantar() {
		System.out.println("Soy el Animal " + this.getNombre() + " mido " + this.altura + " y estoy cantando");

	}
}
