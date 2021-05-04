package lanbideproyecto;

public class Asignatura {

	private String nombre;
	private float nota;

	public Asignatura() {
		super();
		this.nombre = "";
		this.nota = 0;
	}

	public Asignatura(String nombre, float nota) throws Exception {
		this();
		this.nombre = nombre;
		// this.nota = nota;
		setNota(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) throws Exception {
		if (nota < 0 || nota > 10) {
throw new Exceptio
			this.nota = nota;
		
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}

}
