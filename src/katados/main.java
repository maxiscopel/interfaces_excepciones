package katados;

public class main {
    public static void main(String[] args) {
        tarjetaCredito tc = new tarjetaCredito("569874123");
        tc.procesarPago(250000);
        tc.aplicarDescuento(20);

        paypal pay = new paypal("maxiscopel@gmail.com");
        pay.procesarPago(542000);
        pay.aplicarDescuento(16);




    }
}