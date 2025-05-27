package katatres;


public class pedido {
    private cliente cliente;
    private String estado;

    public pedido(katatres.cliente cliente, String estadoInicial) {
        this.cliente = cliente;
        this.estado = estadoInicial;
    }

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        String mensaje = "Su pedido ha cambiado de estado a " + nuevoEstado;
        cliente.notifcar(mensaje);
    }

}