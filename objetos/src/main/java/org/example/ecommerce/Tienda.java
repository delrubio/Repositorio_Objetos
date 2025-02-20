package org.example.ecommerce;

import java.util.Scanner;

public class Tienda {

    private MetodoPago metodo;
    static private double importe;
    static private int eleccion;

    static Scanner teclado = new Scanner(System.in);

    public static void iniciarPago(){

        System.out.println("Que método de pago quieres utilizar:");
        System.out.println("1.  - Tarjeta");
        System.out.println("2.  - PayPal");
        System.out.println("3.  - Bizum");
        eleccion = teclado.nextInt();

        //SEGÚN LA ELECCIÓN PEDIREMOS LA CANTIDAD DE LA TRANSACCIÓN PARA PODER PEDIR EL OBJETO.
        switch (eleccion){
            case 1:
                System.out.println("Dime el importe de la transacción.");
                importe=teclado.nextInt();
                TarjetaCredito tarjeta = new TarjetaCredito(importe);
                break;
            case 2:
                System.out.println("Dime el importe de la transacción.");
                importe=teclado.nextInt();
                PayPal paypal = new PayPal(importe);
                break;
            case 3:
                System.out.println("Dime el importe de la transacción.");
                importe=teclado.nextInt();
                Bizum bizum = new Bizum(importe);
                break;
            default:
                System.out.println("ERROR. Elige una opción válida.");
                System.exit(1);
            break;
        }

    }

    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }

}
