package herencia;

import java.util.ArrayList;

import com.elorrieta.videojuego2.Guerrero;

public class appPrueba {

	public static void main(String[] args) {

		ArrayList<Guerrero> orda = new ArrayList<Guerrero>();
		Guerrero g = new Guerrero();

		for (int i = 0; i < 5; i++) {
			// g = new Guerrero();
			// Guerrero g = new Guerrero();
			// TODO preungar
			g.setFuerza(i);
			orda.add(g);
		}

		for (Guerrero gue : orda) {
			System.out.println(gue);
		}

	}

}
