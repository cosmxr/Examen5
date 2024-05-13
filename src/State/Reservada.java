package State;
import State.EstadoMesa;
import State.Libre;

public class Reservada implements EstadoMesa {
    @Override
    public void siguiente(Mesa mesa) {
        mesa.setEstado(new Ocupada());
    }

    @Override
    public void anterior(Mesa mesa) {
        mesa.setEstado(new Libre());
    }

    @Override
    public void printStatus() {
        System.out.println("La mesa está reservada.");
    }
}