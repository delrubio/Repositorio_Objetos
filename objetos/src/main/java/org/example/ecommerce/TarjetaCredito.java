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
        //PIDO EL TIPO DE TAJETA Y LO CONVIERTO EN MAYUSCULAS PARA AHORRAR PROBLEMAS
        System.out.println("¿Que tipo de tarjeta vas a utilizar?");
        tarjeta=teclado.next().toUpperCase();

        //SI ESTÁ EN LA LISTA, COMENZAMOS CON EL PAGO
        if (Arrays.asList(listaTarjetas).contains(tarjeta)){
            System.out.println("Procesando pago de " + importe + "€, con tarjeta de " + tarjeta);
        }else {
            System.out.println("ERROR. Tipo de tarjeta desconocido");
            System.exit(1);
        }
        validarTarjeta();

    }

    public void validarTarjeta(){
        //PIDO EL NÚMERO DE LA TARJETA
        System.out.println("Número de la tarjeta");
        nro_tarjeta= teclado.next();
        //AL SER STRING LO MIRO CON EL MATCHES Y QUE SEAN 16 DÍGITOS
        if (!nro_tarjeta.matches("\\d{16}")){
            System.out.println("ERROR. El número de la tarjeta no es correcto");
            System.exit(1);
        }

        //CREO UN PIN RANDOM DE 6 DÍGITOS
        int randompin = random.nextInt(900000) + 100000;

        System.out.println(randompin);
        System.out.println("Dime el PIN de la tarjeta - 6 dígitos");
        pin = teclado.nextInt();
        System.out.println("Procesando pago...");

        //SI COINCIDE EL PIN CON EL QUE HE CREADO BIEN Y SI NO MAL.
        if (randompin==pin){
            System.out.println("Transacción completa!");
        }else {
            System.out.println("Transacción fallida!");
        }
    }
}
