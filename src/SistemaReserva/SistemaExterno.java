package SistemaReserva;

import java.time.LocalDateTime;

public class SistemaExterno {
    public void hacerReserva(LocalDateTime fecha, String sitio) {
        System.out.println("Reserva realizada para la fecha: " + fecha + " en el sitio: " + sitio);
    }

    public void enviarComida(String direccion) {
        System.out.println("Comida enviada a la dirección: " + direccion);
    }
}