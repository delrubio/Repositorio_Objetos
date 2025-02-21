package org.example.enum_semaforo;

public class SemaforoApp {
    public static void main(String[] args) {

        Semaforo nuevo = Semaforo.VERDE;

        for (int i = 0; i < 10; i++) {
            System.out.println(nuevo);
            nuevo=nuevo.siguiente(nuevo);
        }
    }
}
