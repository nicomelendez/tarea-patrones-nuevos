package factory;

public class Principal {

	private static MascotaFactory factory;
	
	// Main
	public static void main(String[] args) {

		crear("perro");
		crear("pez");
		crear("gato");

	}

	// Método crear
	static void crear(String tipoMascota) {

		if (tipoMascota.equals("pez")) {

			factory = new PezFactory();
			factory.crearMascota().movimiento();

		} else if (tipoMascota.equals("perro")) {

			factory = new PerroFactory();
			factory.crearMascota().movimiento();

		} else {

			System.out.println("ERROR - Debe ingresar la mascota 'perro' o 'pez'");

		}
	}
}
