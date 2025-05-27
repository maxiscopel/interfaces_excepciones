package katados;

public class tarjetaCredito implements pago, pagoConDescuento {
    private String numeroTarjeta;
    private double monto;

    public tarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        this.monto = monto;
        System.out.println("Procesando pago de: $" + monto + "realizado con la tarjeta: "+ numeroTarjeta);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double Descuento = this.monto * (porcentaje/100) ;
        this.monto -= Descuento;
        System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo monto: $" + this.monto);
        return this.monto;
    }
}