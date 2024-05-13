package SistemaReserva;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaExternoAdapter implements SistemaReserva {
    private SistemaExterno sistemaExterno;

    public SistemaExternoAdapter(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void reservarMesa(int numeroMesa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la fecha de la reserva (formato: yyyy-MM-dd HH:mm):");
        String fechaStr = scanner.nextLine();
        LocalDateTime fecha = LocalDateTime.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.println("Por favor, ingrese el sitio de la reserva:");
        String sitio = scanner.nextLine();

        sistemaExterno.hacerReserva(fecha, sitio);
    }

    @Override
    public void entregarComida(String direccion) {
        sistemaExterno.enviarComida(direccion);
    }
}
