package org.example.ecommerce;

import java.util.Scanner;

public class PayPal extends MetodoPago{

    public static final String cuentaPaypal = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static final double saldoInicial = 23;

    private String cuenta;
    private double saldo;

    Scanner teclado =new Scanner(System.in);

    public PayPal(double importe) {
        super(importe);
        saldo=saldoInicial;
        procesarPago(importe);
    }

    //COMENZAMOS EL PAGO
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal...");
        validarPayPal(importe);
    }

    public void validarPayPal(double importe){
        System.out.println("Dime tu cuenta de PayPal: ...@alu.edu.gva.es");
        cuenta=teclado.next();

        //MIRAMOS QUE EL FORMATO DEL CORREO COINCIDA CON LA VARIABLE GLOBAL QUE HE CREADO
        if (cuenta.matches(cuentaPaypal)){

            //SI ES CORRECTO EL FORMATO, MIRAMOS QUE HAYA SALDO SUFICIENTE
            if (saldo>importe){
                saldo-=importe;//RESTO EL SALDO
                System.out.println("El pago se ha realizado correctamente.");
                System.out.println("Actualizando saldo...");
                System.out.println("Saldo actual: " + saldo + "€");//MUESTRO EL SALDO ACTUAL
            }else {//SI NO HAY SALDO DA ERROR
                System.out.println("ERROR. No tienes saldo suficiente.");
            }
        }else {//SI EL FORMATO DEL CORREO ES INCORRECTO DA ERROR
            System.out.println("ERROR. El formato de cuenta no es correcto.");
        }
    }
}
