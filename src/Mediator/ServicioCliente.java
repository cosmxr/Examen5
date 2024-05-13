package Mediator;

public class ServicioCliente extends Componente {
    public ServicioCliente(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Servicio al cliente recibió: " + mensaje);
    }
}