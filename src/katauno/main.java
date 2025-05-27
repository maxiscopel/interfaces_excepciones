package katauno;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        producto pro1 = new producto("Televisor", 250000);
        producto pro2 = new producto("celular", 300000);
        producto pro3 = new producto("sillon", 200000);
        producto pro4 = new producto("mesa", 100000);


        ArrayList<producto> listaProductos = new ArrayList<>();
        listaProductos.add(pro1);
        listaProductos.add(pro2);
        listaProductos.add(pro3);
        listaProductos.add(pro4);

        pedido pedido = new pedido(listaProductos);

        System.out.println("Total a pagar: $" + pedido.calcularTotal());

    }
}