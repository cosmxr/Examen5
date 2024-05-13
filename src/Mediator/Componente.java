package Mediator;

public abstract class Componente {
    protected Mediator mediator;

    public Componente(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void recibir(String mensaje);
}