package mediator;

import java.util.ArrayList;

public class TorreControl implements ITorreDeControl {

	private ArrayList<Avion> aviones;

	// -------------------------------

	public TorreControl() {
		this.aviones = new ArrayList<Avion>();
	}

	// -------------------------------

	public void agregarAvion(Avion avion) {
		this.aviones.add(avion);
	}

	public void enviar(String mensaje, Avion originator) {
		for (Avion avion : aviones) {
			if (avion != originator) {
				avion.recibir(mensaje);
			}
		}
	}

}
