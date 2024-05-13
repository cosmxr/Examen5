package SistemaReserva;

import java.time.LocalDateTime;
import ObserverNotificaciones.*;

public class Reserva {
        private Usuario usuario;
        private LocalDateTime fecha;

        private int numeroMesa;

        public Reserva(Usuario usuario, LocalDateTime fecha,int numeroMesa) {
            this.usuario = usuario;
            this.fecha = fecha;
            this.numeroMesa = numeroMesa;
        }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
