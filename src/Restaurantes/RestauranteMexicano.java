package Restaurantes;

import java.util.Scanner;

public class RestauranteMexicano implements Restaurante {
    Scanner sc = new Scanner(System.in);

    @Override
    public void prepararComida() {
        System.out.println("Preparando comida en restaurante mexicano...");
    }

    @Override
    public void pedirComida(String primerPlato, String segundoPlato, String postre) {
        System.out.println("Pedido en restaurante mexicano: Primer plato - " + seleccionarPrimerPlato()
                + ", Segundo plato - " + seleccionarSegundoPlato() + ", Postre - " + seleccionarPostre());
    }

    private String seleccionarPrimerPlato() {
        System.out.println("Primeros Platos: \n1. Tacos. \n2. Ensalada de nopal");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Tacos";
            case "2":
                return "Ensalada de nopal";
            default:
                return "Plato no reconocido";
        }
    }

    private String seleccionarSegundoPlato() {
        System.out.println("Segundos Platos: \n1. Enchiladas. \n2. Chiles rellenos");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Enchiladas";
            case "2":
                return "Chiles rellenos";
            default:
                return "Plato no reconocido";
        }
    }

    private String seleccionarPostre() {
        System.out.println("Postres: \n1. Flan \n2. Churros");
        String plato = sc.nextLine();

        switch (plato) {
            case "1":
                return "Flan";
            case "2":
                return "Churros";
            default:
                return "Plato no reconocido";
        }
    }
}