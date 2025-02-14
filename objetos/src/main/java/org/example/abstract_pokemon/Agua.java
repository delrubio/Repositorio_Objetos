package org.example.abstract_pokemon;

public class Agua extends Pokemon{
    public Agua(int nivel) {
        super(nivel);
    }

    @Override
    public void atacar() {
        System.out.println("SALPICADURAAAAAAAAAA");
    }
}
