package Restaurantes;

import java.util.Scanner;

public class RestauranteComidaRapida implements Restaurante {
    Scanner sc = new Scanner(System.in);

    @Override
    public void prepararComida() {
        System.out.println("Preparando comida en restaurante de comida rápida...");
    }

    @Override
    public void pedirComida(String primerPlato, String segundoPlato, String postre) {
        System.out.println("Pedido en restaurante de comida rápida: Primer plato - " + seleccionarPrimerPlato()
                + ", Segundo plato - " + seleccionarSegundoPlato() + ", Postre - " + seleccionarPostre());
    }

    private String seleccionarPrimerPlato() {
        System.out.println("Primeros Platos: \n1. Nuggets de pollo. \n2. Ensalada César");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Nuggets de pollo";
            case "2":
                return "Ensalada César";
            default:
                return "Plato no reconocido";
        }
    }

    private String seleccionarSegundoPlato() {
        System.out.println("Segundos Platos: \n1. Whopper. \n2. Big King");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Whopper";
            case "2":
                return "Big King";
            default:
                return "Plato no reconocido";
        }
    }

    private String seleccionarPostre() {
        System.out.println("Postres: \n1. Sundae de chocolate \n2. Pie de manzana");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Sundae de chocolate";
            case "2":
                return "Pie de manzana";
            default:
                return "Plato no reconocido";
        }
    }
}