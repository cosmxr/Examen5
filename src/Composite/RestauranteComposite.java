package Composite;

public class RestauranteComposite implements RestauranteComponente {
    private String nombre;

    public RestauranteComposite(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void print() {
        System.out.println("Restaurante: " + nombre);
    }
}