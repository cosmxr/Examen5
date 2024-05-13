package Mediator;

public class RestauranteMediator implements Mediator {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public void setServicioCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public void enviar(String mensaje, Componente componente) {
        if (componente == cocina) {
            servicioCliente.recibir(mensaje);
            entrega.recibir(mensaje);
        } else if (componente == servicioCliente) {
            cocina.recibir(mensaje);
            entrega.recibir(mensaje);
        } else if (componente == entrega) {
            cocina.recibir(mensaje);
            servicioCliente.recibir(mensaje);
        }
    }
}