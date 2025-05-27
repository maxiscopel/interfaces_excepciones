package katauno;


import java.util.ArrayList;

public class pedido implements pagable {

    private ArrayList<producto> listaProductos;

    public pedido(ArrayList<producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (producto producto : listaProductos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}