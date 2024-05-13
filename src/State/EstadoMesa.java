package State;

public interface EstadoMesa {
    void siguiente(Mesa mesa);
    void anterior(Mesa mesa);
    void printStatus();
}