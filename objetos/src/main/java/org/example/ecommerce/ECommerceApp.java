package org.example.ecommerce;

public class ECommerceApp {
    public static void main(String[] args) {
        TarjetaCredito prog1 = new TarjetaCredito(65.87);

        System.out.println(prog1);

        PayPal prog2 = new PayPal(74.12, "david@gmail.com", 78);

    }
}
