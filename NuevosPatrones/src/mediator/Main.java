package mediator;

public class Main {

	public static void main(String[] args) {

		TorreControl t = new TorreControl();

		Avion aa1 = new AvionConcreto1(t);
		Avion aa2 = new AvionConcreto2(t);

		t.agregarAvion(aa1);
		t.agregarAvion(aa2);
		System.out.println("|----------------------------RADIO DE TORRE CONTROL--------------------------|");
		saltoDeLinea();

		aa1.comunicar("Avión COMERCIAL se reporta mediante la torre de control!");
		saltoDeLinea();

		aa2.comunicar("Avión CHARTER se reporta mediante la torre de control!");
		saltoDeLinea();

		System.out.println("|---------------------------FIN DE LA COMUNICACIÓN---------------------------|");

	}

	public static void saltoDeLinea() {
		System.out.println(" ");
	}

}
