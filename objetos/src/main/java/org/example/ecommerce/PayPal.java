package org.example.ecommerce;

public class PayPal extends MetodoPago{

    public static String cuentaPaypal = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static final double saldoInicial = 23;

    private String cuenta;
    private double saldo;

    public PayPal(double importe) {
        super(importe);
        procesarPago(importe);
        saldo=saldoInicial;
    }

    public PayPal(double importe, String cuenta, double saldo){
        super (importe);
        procesarPago(importe);
        this.saldo=saldo;
        validarPayPal(cuenta, importe);
    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal...");
    }

    public void validarPayPal(String cuenta, double importe){
        if (cuenta.matches(cuentaPaypal)){
            if (saldo>=importe){
                saldo-=importe;
                System.out.println("El pago se ha realizado correctamente.");
                System.out.println("Actualizando saldo...");
                System.out.println("Saldo actual: " + saldo);
            }else {
                System.out.println("ERROR. No tienes saldo suficiente.");
            }
        }else {
            System.out.println("ERROR. El formato de cuenta no es correcto.");
        }
    }
}
