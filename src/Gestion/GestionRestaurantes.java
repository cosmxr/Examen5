package Gestion;

import FactoryMethod.RestauranteComidaRapidaFactory;
import FactoryMethod.RestauranteFactory;
import FactoryMethod.RestauranteLujoFactory;
import FactoryMethod.RestauranteMexicanoFactory;
import Restaurantes.Restaurante;
import Restaurantes.RestaurantesClass;
import ServicioCliente.EstrategiaServicioCliente;
import ServicioCliente.ServicioClienteComidaRapida;
import ServicioCliente.ServicioClienteLujo;
import ServicioCliente.ServicioClienteMexicano;

public class GestionRestaurantes {
    private static GestionRestaurantes instancia;

    private GestionRestaurantes() {
    }

    public static GestionRestaurantes getInstancia() {
        if (instancia == null) {
            instancia = new GestionRestaurantes();
        }
        return instancia;
    }

    public Restaurante getRestaurante(String tipoRestaurante) {
        RestauranteFactory restauranteFactory;
        EstrategiaServicioCliente estrategiaServicioCliente;
        switch (tipoRestaurante) {
            case "lujo":
                restauranteFactory = new RestauranteLujoFactory();
                estrategiaServicioCliente = new ServicioClienteLujo();
                break;
            case "comidaRapida":
                restauranteFactory = new RestauranteComidaRapidaFactory();
                estrategiaServicioCliente = new ServicioClienteComidaRapida();
                break;
            case "mexicano":
                restauranteFactory = new RestauranteMexicanoFactory();
                estrategiaServicioCliente = new ServicioClienteMexicano();
                break;
            default:
                throw new IllegalArgumentException("Tipo de restaurante no soportado");
        }

        Restaurante restaurante = restauranteFactory.crearRestaurante();
        if (restaurante instanceof Restaurantes.RestaurantesClass) {
            ((Restaurantes.RestaurantesClass) restaurante).setEstrategiaServicioCliente(estrategiaServicioCliente);
        }
        return restaurante;
    }
    }
