package ServicioCliente;

public class ServicioClienteMexicano implements EstrategiaServicioCliente {
    @Override
    public void atender() {
        System.out.println("Atendiendo al cliente con un servicio amigable y cálido...");
    }
}