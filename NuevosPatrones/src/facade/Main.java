package facade;

public class Main {

	public static void main(String[] args) {

		CompraCervezaFacade compraCervezas = new CompraCervezaFacade("IPA");
		compraCervezas.comprarCerveza(12);
		
	}

}
