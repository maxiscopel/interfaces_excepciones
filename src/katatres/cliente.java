package katatres;


public class cliente implements notificable {
    private String nombre;
    private String email;

    public cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notifcar(String mensaje) {
        System.out.println("Notificación reciente para " + nombre + "(" + email + ")" + mensaje);
    }
}