package herencia;

import java.util.ArrayList;

public class Concesionario {

	public static void main(String[] args) {

		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

		Coche c = new Coche();
		c.setMatricula("1586HDN");
		c.setRuedas(4);
		System.out.println(c);

		Avion a = new Avion();
		a.setMatricula("LH5236");
		a.setAlas(4);
		System.out.println(a);

		stock.add(c);
		stock.add(a);

		System.out.println("Tenemos en stock " + stock.size() + " vehiculos");

		for (Vehiculo vehiculoIterador : stock) {
			if (vehiculoIterador instanceof Avion) {
				System.out.println("este vehiculo es un Avion");
				// castear el objeto a su Clase Hija
				Avion avion = (Avion) vehiculoIterador;
				// podemos acceder a los metodos de la clase Hija
				avion.getAlas();
			}

			if (vehiculoIterador instanceof Coche) {
				System.out.println("este vehiculo es un coche");
				((Coche) vehiculoIterador).isItv();
			}

		} // for
	}

}
