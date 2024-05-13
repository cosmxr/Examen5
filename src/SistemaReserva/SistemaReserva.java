package SistemaReserva;

import ObserverNotificaciones.Usuario;

public interface SistemaReserva {
    void reservarMesa(Usuario usuario);
    void entregarComida(String direccion);
}


