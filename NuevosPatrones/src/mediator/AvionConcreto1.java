package mediator;

public class AvionConcreto1 extends Avion{

	public AvionConcreto1(ITorreDeControl t) {
        this.setMediador( t);
    }
    
	// -------------------------------
	
     public void recibir(String mensaje){
        System.out.println( "AvionConcreto1: " + mensaje );
    }
}