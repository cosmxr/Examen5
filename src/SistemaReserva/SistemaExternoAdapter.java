package SistemaReserva;

public class SistemaExternoAdapter implements SistemaReserva {
    private SistemaExterno sistemaExterno;

    public SistemaExternoAdapter(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void reservarMesa(int numeroMesa) {
        sistemaExterno.hacerReserva(numeroMesa);
    }

    @Override
    public void entregarComida(String direccion) {
        sistemaExterno.enviarComida(direccion);
    }
}
