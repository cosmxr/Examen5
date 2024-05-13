package FactoryMethod;

import Restaurantes.Restaurante;
import Restaurantes.RestauranteComidaRapida;

public class RestauranteComidaRapidaFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteComidaRapida();
    }
}