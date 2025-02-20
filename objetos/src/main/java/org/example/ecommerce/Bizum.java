package org.example.ecommerce;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    private String telefono;
    private int pin;

    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    public Bizum(double importe) {
        super(importe);
        procesarPago(importe);
    }

    public void procesarPago(double importe) {
        //COMENZAMOS EL PAGO Y MANDAMOS UN MENSAJE
        System.out.println("Procesando pago de " + importe + "€ con Bizum...");
        validarBizum();
    }

    public void validarBizum(){

        System.out.println("Dime el número de telefono del Bizum");
        telefono=teclado.next();

        //CON EL MATCHES MIRO SI EL TELÉFONO TIENE 9 DÍGITOS
        if (telefono.matches("\\d{9}")){
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
        }else {
            System.out.println("ERROR. Formato de teléfono incorrecto.");
        }
    }
}
