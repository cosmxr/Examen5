package FactoryMethod;

public class RestauranteMexicanoFactory implements RestauranteFactory {
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteMexicano();
    }
}