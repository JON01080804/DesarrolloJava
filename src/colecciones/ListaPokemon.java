package colecciones;

import java.util.ArrayList;

import com.elorrieta.objetos.Pokemon;

public class ListaPokemon {

	public static void main(String[] args) throws Exception {

		ArrayList<Pokemon> cole = new ArrayList<Pokemon>();

		Pokemon p = new Pokemon();
		p.setNombre("Pikatxu");
		p.setPrecio(1000);
		p.setBrillante(true);
		cole.add(p);

		p = new Pokemon();
		p.setNombre("Txarmander");
		p.setPrecio(500);
		p.setBrillante(false);
		cole.add(p);

		p = new Pokemon();
		p.setNombre("Bulbasur");
		p.setPrecio(5);
		p.setBrillante(true);
		cole.add(p);

		p = new Pokemon();
		p.setNombre("Doraemon");
		p.setPrecio(100);
		p.setBrillante(true);
		cole.add(p);
		System.out.println(cole);

		int contBri = 0;
		int contSinBri = 0;
		for (Pokemon pIterador : cole) {
			if (!pIterador.isBrillante()) {// !negacion, si es boolean le da la vuelta a la tortilla
				contSinBri++;

			}
			if (pIterador.isBrillante()) {// !negacion, si es boolean le da la vuelta a la tortilla
				contBri++;
			}

		}
		System.out.println("hay" + contSinBri + "Pokemons");
		System.out.println("hay" + contBri + "Pokemons");
	}

}
