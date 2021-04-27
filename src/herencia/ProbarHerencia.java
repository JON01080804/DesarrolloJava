package herencia;

public class ProbarHerencia {

	public static void main(String[] args) {

		Animal aCerdo = new Animal("cerdo");
		aCerdo.cantar();
		System.out.println(aCerdo.toString());

		Pajaro pColibri = new Pajaro("Colibri");
		pColibri.cantar();
		System.out.println("Puede volar " + pColibri.isVolador());
		System.out.println(pColibri.toString());

		Pajaro pPinguino = new Pajaro();
		pPinguino.setNombre("pinguino");
		pPinguino.setVolador(false);
		pPinguino.cantar();
		System.out.println("Puede volar " + pPinguino.isVolador());

		Perro p1 = new Perro();
		p1.setNombre("Snoppy");
		p1.cantar();

		PerroPresa pp = new PerroPresa();
		pp.setNombre("Bubbba");
		pp.cantar();

		Dinosaurio di1 = new Dinosaurio(11, "Ty");
		di1.cantar();
		System.out.println(di1);

		Dinosaurio di2 = new Dinosaurio();
		di2.setAltura(12);
		di2.setNombre("Ve");
		di2.cantar();
		System.out.println(di2);

	}

}