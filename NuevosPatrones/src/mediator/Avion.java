package mediator;

public abstract class Avion {

	protected ITorreDeControl torre;

	public ITorreDeControl getMediador() {
		return this.torre;
	}

	public void setMediador(ITorreDeControl t) {
		this.torre = t;
	}

	public void comunicar(String mensaje) {
		this.getMediador().enviar(mensaje, this);
	}

	public abstract void recibir(String mensaje);

}
