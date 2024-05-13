package FactoryMethod;

public class RestauranteLujoFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteLujo();
    }
}