package org.example.ecommerce;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TarjetaCredito extends MetodoPago {

    public static String[] listaTarjetas = {"VISA", "MASTERCARD", "MAESTRO"};

    private String nro_tarjeta;
    private String tarjeta;
    private int pin;

    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    public TarjetaCredito(double importe) {
        super(importe);
        procesarPago(importe);
    }

    public void procesarPago(double importe) {
        validarTipo(importe);
        validarNumTarjeta();
        validarPin();

    }

    public void validarTipo(double importe){

        System.out.println("¿Que tipo de tarjeta vas a utilizar?");
        tarjeta= teclado.next();

        if (Arrays.asList(listaTarjetas).contains(tarjeta)){
            System.out.println("Procesando pago de " + importe + "€, con tarjeta de " + tarjeta);
        }else {
            System.out.println("ERROR. Tipo de tarjeta desconocido");
        }

    }

    public void validarNumTarjeta(){

        System.out.println("Número de la tarjeta");
        nro_tarjeta= teclado.next();

        if (!nro_tarjeta.matches("\\d{16}")){
            System.out.println("ERROR. El número de la tarjeta no es correcto");
        }
    }

    public void validarPin(){

        int randompin = random.nextInt(9000) + 1000;

        System.out.println(randompin);

        System.out.println("Dime el PIN de la tarjeta - 4 dígitos");
        pin = teclado.nextInt();

        System.out.println("Procesando pago...");
        if (randompin==pin){
            System.out.println("Transacción completa!");
        }else {
            System.out.println("Transacción fallida!");
        }
    }
}
