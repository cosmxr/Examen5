package Composite;

import java.util.ArrayList;
import java.util.List;

public class RestauranteLista implements RestauranteComponente {
    private List<RestauranteComponente> hijos;
    private String nombre;

    public RestauranteLista(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public void add(RestauranteComponente componente) {
        hijos.add(componente);
    }

    public void remove(RestauranteComponente componente) {
        hijos.remove(componente);
    }

    @Override
    public void print() {
        System.out.println("Restaurante: " + nombre);
        for (RestauranteComponente hijo : hijos) {
            hijo.print();
        }
    }
}