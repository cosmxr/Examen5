package Command;

import ObserverNotificaciones.Usuario;
import SistemaReserva.SistemaExternoAdapter;

public class ReservarCommand implements Command {
    private SistemaExternoAdapter sistemaExternoAdapter;
    private int numeroMesa;
    private Usuario usuario;

    public ReservarCommand(SistemaExternoAdapter sistemaExternoAdapter,Usuario usuario) {
        this.sistemaExternoAdapter = sistemaExternoAdapter;
        this.usuario=usuario;
    }

    @Override
    public void execute() {
        sistemaExternoAdapter.reservarMesa(usuario);
    }
}
