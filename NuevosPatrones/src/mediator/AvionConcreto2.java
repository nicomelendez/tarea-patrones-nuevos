package mediator;

public class AvionConcreto2 extends Avion {

	public AvionConcreto2(ITorreDeControl t) {
		this.setMediador(t);
	}
	
	// -------------------------------

	public void recibir(String mensaje) {
		System.out.println("AvionConcreto2: " + mensaje);
	}
}
