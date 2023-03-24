package factory;

public class PerroFactory extends MascotaFactory {

    public Mascota crearMascota() {
        return new Perro();
    }
}
