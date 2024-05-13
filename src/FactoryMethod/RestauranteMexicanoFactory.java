package FactoryMethod;

import Restaurantes.Restaurante;
import Restaurantes.RestauranteMexicano;

public class RestauranteMexicanoFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteMexicano();
    }
}