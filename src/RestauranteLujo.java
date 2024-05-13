import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RestauranteLujo implements Restaurante {
    Scanner sc =new Scanner(System.in);
    @Override
    public void prepararComida() {
        System.out.println("Preparando comida en restaurante de lujo temático...");
    }

    @Override
    public void pedirComida(String primerPlato, String segundoPlato, String postre) {
        System.out.println("Pedido en restaurante de lujo temático: Primer plato - " + seleccionarPrimerPlato()
                + ", Segundo plato - " + seleccionarSegundoPlato() + ", Postre - " + seleccionarPostre());
    }

    private String seleccionarPrimerPlato() {
        System.out.println("Primeros Platos: \n1. Ensalada de Langosta. \n2. Foie de pato");
        String plato= sc.nextLine();

        switch (plato) {
            case "1":
                return "Ensalada de langosta";
            case "2":
                return "Foie de pato";
            default:
                return "Plato no reconocido";
        }
    }
    private String seleccionarSegundoPlato() {
        System.out.println("Segundos Platos: \n1. Filete Mignon. \n2. Lubina salvaje");
        String plato= sc.nextLine();

        switch (plato) {
            case "1":
                return "Filete Mignon";
            case "2":
                return "Lubina Salvaje";
            default:
                return "Plato no reconocido";
        }
    }
    private String seleccionarPostre() {
        System.out.println("Postres: \n1. Tarta de queso \n2. Cabello de Angel");
        String plato= sc.nextLine();

        switch (plato) {
            case "1":
                return "Tarta de queso";
            case "2":
                return "Cabello de Angel";
            default:
                return "Plato no reconocido";
        }
    }

}