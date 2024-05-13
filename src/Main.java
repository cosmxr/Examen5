import FactoryMethod.RestauranteComidaRapidaFactory;
import FactoryMethod.RestauranteFactory;
import FactoryMethod.RestauranteLujoFactory;
import FactoryMethod.RestauranteMexicanoFactory;
import Restaurantes.Restaurante;
import SistemaReserva.Reserva;

public class Main {
    public static void main(String[] args) {
       ´   RestauranteFactory restauranteMexicanoFactory = new RestauranteMexicanoFactory();
        RestauranteFactory restauranteLujoFactory = new RestauranteLujoFactory();
        RestauranteFactory restauranteComidaRapidaFactory = new RestauranteComidaRapidaFactory();

        // Crea los restaurantes utilizando las fábricas
        Restaurante restauranteMexicano = restauranteMexicanoFactory.crearRestaurante();
        Restaurante restauranteLujo = restauranteLujoFactory.crearRestaurante();
        Restaurante restauranteComidaRapida = restauranteComidaRapidaFactory.crearRestaurante();

        // Pide la comida necesaria
        restauranteMexicano.pedirComida(1,2,1);
        restauranteLujo.pedirComida(1,1,1);
        restauranteComidaRapida.pedirComida(1,1,2);

       Reserva reserva = new Reserva()
        re
    }
}