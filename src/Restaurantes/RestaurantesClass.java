package Restaurantes;

import ServicioCliente.EstrategiaServicioCliente;

public abstract class RestaurantesClass {
    protected EstrategiaServicioCliente estrategiaServicioCliente;

    public void setEstrategiaServicioCliente(EstrategiaServicioCliente estrategiaServicioCliente) {
        this.estrategiaServicioCliente = estrategiaServicioCliente;
    }

    public void atenderCliente() {
        estrategiaServicioCliente.atender();
    }
}
