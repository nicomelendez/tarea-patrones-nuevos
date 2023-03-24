package facade;

public class Cerveza implements ICerveza {

	private String tipo;

	public Cerveza(String tipo) {
		this.tipo = tipo;
	}

	public void vender(int cantidad) {
		System.out.println(cantidad + " unidades de cerveza " + tipo + " vendidas");
	}

}
