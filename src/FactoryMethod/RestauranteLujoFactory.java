package FactoryMethod;

import Restaurantes.Restaurante;
import Restaurantes.RestauranteLujo;

public class RestauranteLujoFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteLujo();
    }
}