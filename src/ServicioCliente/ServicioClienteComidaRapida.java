package ServicioCliente;

public class ServicioClienteComidaRapida implements EstrategiaServicioCliente {
    @Override
    public void atender() {
        System.out.println("Atendiendo al cliente con un servicio rápido...");
    }
}