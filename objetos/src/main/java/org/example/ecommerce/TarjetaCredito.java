package org.example.ecommerce;

import java.util.Arrays;
import java.util.Scanner;

public class TarjetaCredito extends MetodoPago {

    public static String[] listaTarjetas = {"VISA", "MASTERCARD", "MAESTRO"};
    public static int numMax = 16;

    private String nro_tarjeta;
    private String tarjeta;

    Scanner teclado = new Scanner(System.in);

    public TarjetaCredito(double importe) {
        super(importe);
        comenzarPago();
    }

    public void procesarPago(double importe) {

        if (Arrays.asList(listaTarjetas).contains(tarjeta)){
            System.out.println("Procesando pago de " + importe + "€, con tarjeta de " + tarjeta);
        }

    }

    public void comenzarPago(){
        System.out.println("Número de tarjeta");
        validarTarjeta(teclado.next());
    }

    public void validarTarjeta(String nro_tarjeta){

        if (!nro_tarjeta.matches("\\d{16}")){
            System.out.println("ERROR. El número de la tarjeta no es correcto");
        }
    }
}
