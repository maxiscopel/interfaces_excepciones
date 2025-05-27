package katatres;

public class main {
    public static void main(String[] args) {

        cliente c = new cliente("Rodrigo", "rodrigo@gmail.com");

        pedido p = new pedido(c, "pendiente");
        p.cambiarEstado("Enviado");
        p.cambiarEstado("Entregado");
    }
}