package org.example.abstract_pokemon;

public class Agua extends Pokemon implements AtaquesAgua{

    public Agua(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("SALPICADURAAAAAAAAAA");
    }

    public void pistolaAgua() {
        System.out.println("Flushhhhh Flushhhh");
    }

    public void salpicadura() {
        System.out.println("SALPICADURAAAAAAAAAA");
    }

    public void sur() {
        System.out.println("COGIENDO OLASSSSSSSSSSSS");
    }

    public void hidroBomba() {
        System.out.println("BOMBA REFRESCANTE");
    }
}
