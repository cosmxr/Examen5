package State;

public class Libre implements EstadoMesa {
    @Override
    public void siguiente(Mesa mesa) {
        mesa.setEstado(new Reservada());
    }

    @Override
    public void anterior(Mesa mesa) {
        // No hay estado anterior a Libre
    }

    @Override
    public void printStatus() {
        System.out.println("La mesa está libre.");
    }
}