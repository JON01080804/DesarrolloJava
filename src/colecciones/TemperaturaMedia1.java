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
public class TemperaturaMedia1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Float> temperaturas = new ArrayList<Float>();
		float temp;
		boolean repetir = true;
		String dec;
		float suma = 0;

		do {
			System.out.println("Introduce temperatura: ");
			temp = Float.parseFloat(sc.nextLine());
			temperaturas.add(temp);
//			suma = suma + temp;
			System.out.println("quieres seguir introduciendo");
			dec = sc.nextLine();
			if ("s".equalsIgnoreCase(dec) || "si".equalsIgnoreCase(dec)) {
				repetir = true;
			} else if ("n".equalsIgnoreCase(dec) || "no".equalsIgnoreCase(dec)) {
				repetir = false;
			} else {
				System.out.println("Por favor escribe si o no");
				System.out.println("quieres seguir introduciendo");
				dec = sc.nextLine();
				if ("s".equalsIgnoreCase(dec) || "si".equalsIgnoreCase(dec)) {
					repetir = true;
				} else if ("n".equalsIgnoreCase(dec) || "no".equalsIgnoreCase(dec)) {
					repetir = false;
				}
			}
		} while (repetir);

		System.out.println(temperaturas);

		float tempMax = -100;
		float tempMin = 100;

		for (int i = 0; i < temperaturas.size(); i++) {
			suma = suma + temperaturas.get(i);
			if (temperaturas.get(i) > tempMax) {
				tempMax = temperaturas.get(i);
			}
			if (temperaturas.get(i) < tempMin) {
				tempMin = temperaturas.get(i);
			}
		}
		System.out.println("La suma es " + suma);
		System.out.println("La media es " + (suma / temperaturas.size()));
		System.out.println("ddd" + tempMax);
		System.out.println("ddd" + tempMin);

		for (Float float1 : temperaturas) {
			System.out.println(float1);
		}
		sc.close();
	}

}
