package Command;

import SistemaReserva.SistemaExternoAdapter;

public class OrdenarCommand implements Command {
    private SistemaExternoAdapter sistemaExternoAdapter;
    private String direccion;

    public OrdenarCommand(SistemaExternoAdapter sistemaExternoAdapter, String direccion) {
        this.sistemaExternoAdapter = sistemaExternoAdapter;
        this.direccion = direccion;
    }

    @Override
    public void execute() {
        sistemaExternoAdapter.entregarComida(direccion);
    }
}