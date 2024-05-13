package FactoryMethod;

public class RestauranteComidaRapidaFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteComidaRapida();
    }
}