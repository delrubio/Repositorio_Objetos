package org.example.abstract_pokemon;

public class Electrico extends Pokemon{
    public Electrico(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("IMPACTRUENOOOO");
    }
}
