package State;
import State.EstadoMesa;

public class Ocupada implements EstadoMesa {
    @Override
    public void siguiente(Mesa mesa) {
        // No hay estado siguiente a Ocupada
    }

    @Override
    public void anterior(Mesa mesa) {
        mesa.setEstado(new Reservada());
    }

    @Override
    public void printStatus() {
        System.out.println("La mesa está ocupada.");
    }
}