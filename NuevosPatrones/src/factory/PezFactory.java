package factory;

public class PezFactory extends MascotaFactory {
	
    public Mascota crearMascota() {
        return new Pez();
    }
}
