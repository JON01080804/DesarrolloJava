package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pedir por pantalla temperaturas hasta que se aburra el usuario. Ir
 * guardandolas una a una en unn array. Al terminar recorrer array y mostrar
 * media.
 * 
 * @author Admin
 *
 */
public class TemperaturaMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		int temp;

		boolean repetir = true;
		String dec;
//		float tottemp = temperaturas.get(i) * temperaturas.size();

		do {
			System.out.println("Introduce temperatura: ");
			temp = Integer.parseInt(sc.nextLine());
			temperaturas.add(temp);
			System.out.println("quieres seguir introduciendo");
			dec = sc.nextLine();
			if ("s".equalsIgnoreCase(dec) || "si".equalsIgnoreCase(dec)) {
				repetir = true;
			} else {
				repetir = false;
			}
		} while (repetir);

		System.out.println(temperaturas);

		for (int i = 0; i < temperaturas.size(); i++) {

		}

		sc.close();
	}

}