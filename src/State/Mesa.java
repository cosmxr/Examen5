package State;



public class Mesa {
    private EstadoMesa estado;

    public Mesa() {
        estado = new Libre();  // inicialmente, la mesa está libre
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public void estadoSiguiente() {
        estado.siguiente(this);
    }

    public void estadoAnterior() {
        estado.anterior(this);
    }

    public void printStatus() {
        estado.printStatus();
    }
}