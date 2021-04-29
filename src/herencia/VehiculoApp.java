package herencia;

import java.util.ArrayList;

public class VehiculoApp {

	public static void main(String[] args) {

		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

		System.out.println("------------- v1 -----------------");
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("2222 GPL");
		v1.arrancar();
		v1.parar();

		System.out.println("------------- v2 -----------------");
		Vehiculo v2 = new Vehiculo("1111 CMS");
		v2.setColor("rojo");

		System.out.println("------------- v3 -----------------");
		Vehiculo v3 = new Vehiculo("5555 CMS", "negra");

		System.out.println(v3);

		Coche c1 = new Coche();
		c1.isItv(); // su propio metodo
		c1.getMatricula(); // metodo heredado del padre
		c1.toString(); // metodo sobreescrito al padre

		CocheGasolina cg1 = new CocheGasolina();
		cg1.setCilindrada(2500);
		cg1.setItv(true);
		cg1.setColor("rojo");
		cg1.setAsientos(2);
		cg1.setCombustible(CocheGasolina.COMBUSTIBLE_BIO);

		System.out.println(cg1.toString());

		System.out.println("----------Avion 1-------------");

		Avion a1 = new Avion();
		a1.getAlas();
		a1.arrancar();
		System.out.println(a1);

		stock.add(a1);
		stock.add(c1);
		stock.add(cg1);

		int contCo = 0;
		int contAv = 0;

		for (Vehiculo vehiculoIterador : stock) {
			if (vehiculoIterador instanceof Avion) {
				System.out.println("este vehiculo es un Avion");
				// castear el objeto a su Clase Hija
				Avion avion = (Avion) vehiculoIterador;
				// podemos acceder a los metodos de la clase Hija
				avion.getAlas();
				contAv++;
			}

			if (vehiculoIterador instanceof Coche) {
				System.out.println("este vehiculo es un coche");
				((Coche) vehiculoIterador).isItv();
				contCo++;
			}

		}
		System.out.println("Tengo " + contCo + " coches");
		System.out.println("Tengo " + contAv + " aviones");

	}

}
