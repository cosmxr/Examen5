package ObserverNotificaciones;

public class Usuario implements Observer {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Usuario " + name + " ha recibido una actualización: " + message);
    }
}