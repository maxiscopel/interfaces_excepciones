package katados;

public class paypal implements pago, pagoConDescuento {
    private String email;
    private double monto;

    public paypal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        this.monto = monto;
        System.out.println("Pago de $" + monto + "se enviará el detalle al siguiente mail" + email);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = this.monto * (porcentaje/100);
        this.monto -= descuento;
        System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo monto: $" + this.monto);
        return this.monto;
    }
}