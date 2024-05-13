package SistemaReserva;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ObserverNotificaciones.*;

public class SistemaExternoAdapter implements SistemaReserva {
    private SistemaExterno sistemaExterno;
    private List<Reserva> reservas;

    public SistemaExternoAdapter(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
        this.reservas = new ArrayList<>();
    }

    @Override
    public void reservarMesa(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la fecha de la reserva (formato: yyyy-MM-dd HH:mm):");
        String fechaStr = scanner.nextLine();
        LocalDateTime fecha = LocalDateTime.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.println("Por favor, ingrese el sitio de la reserva:");
        int numeroMesa = scanner.nextInt();

        Reserva reserva = new Reserva(usuario, fecha, numeroMesa);
        reservas.add(reserva);

        sistemaExterno.hacerReserva(fecha, String.valueOf(numeroMesa));
    }

    @Override
    public void entregarComida(String direccion) {
        sistemaExterno.enviarComida(direccion);
    }

    public void cancelarReserva(Usuario usuario, int numeroMesa) {
        reservas.removeIf(reserva -> reserva.getUsuario().equals(usuario) && reserva.getNumeroMesa() == numeroMesa);
    }
}
