package colecciones;

public class TemperaturaSemana {

	public static void main(String[] args) {

		int[] temperaturas = new int[7];
		int suma = 0;

		temperaturas[0] = 12;
		temperaturas[1] = 20;
		temperaturas[2] = 18;
		temperaturas[3] = 5;
		temperaturas[4] = 22;
		temperaturas[5] = 15;
		temperaturas[6] = 18;

//		int tempMax = temperaturas[0]; esta forma tb es valida, la de bajo es mas elegante.
//		int tempMin = temperaturas[0];

		int tempMax = Integer.MAX_VALUE;
		int tempMin = Integer.MIN_VALUE;

		for (int i = 0; i < temperaturas.length; i++) {

			int temp = temperaturas[i];
			suma = suma + temp;

			for (int j = 1; j < temperaturas.length; j++) {

				if (temperaturas[j] > tempMax) {
					tempMax = temperaturas[j];
				}
				if (temperaturas[j] < tempMin) {
					tempMin = temperaturas[j];

				}
			}

		}

		System.out.println("La media es " + suma / temperaturas.length);
		System.out.println("La temperatura maxima es " + tempMax);
		System.out.println("La temperatura minima es " + tempMin);
	}
}
