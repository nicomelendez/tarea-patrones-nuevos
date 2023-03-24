package facade;

public class CompraCervezaFacade {

	private ICerveza cerveza;

	public CompraCervezaFacade(String tipoCerveza) {
		cerveza = new Cerveza(tipoCerveza);
	}

	public void comprarCerveza(int cantidad) {
		cerveza.vender(cantidad);
		System.out.println(cantidad + " unidades de cerveza compradas exitosamente");
	}

}
