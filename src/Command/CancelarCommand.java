package Command;

import SistemaReserva.SistemaExternoAdapter;
import ObserverNotificaciones.*;

public class CancelarCommand implements Command {
    private SistemaExternoAdapter sistemaExternoAdapter;
    private int numeroMesa;
    private Usuario usuario;

    public CancelarCommand(SistemaExternoAdapter sistemaExternoAdapter, Usuario usuario,int numeroMesa) {
        this.sistemaExternoAdapter = sistemaExternoAdapter;
        this.numeroMesa = numeroMesa;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        sistemaExternoAdapter.cancelarReserva(usuario,numeroMesa);
    }
}