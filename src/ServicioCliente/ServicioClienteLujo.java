package ServicioCliente;

public class ServicioClienteLujo implements EstrategiaServicioCliente {
    @Override
    public void atender() {
        System.out.println("Atendiendo al cliente con un servicio de lujo...");
    }
}
