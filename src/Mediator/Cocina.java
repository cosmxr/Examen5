package Mediator;

public class Cocina extends Componente {
    public Cocina(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Cocina recibió: " + mensaje);
    }
}