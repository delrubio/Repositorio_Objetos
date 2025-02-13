package org.example.herencia_rrss;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores, String... colabos) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones.addAll(Arrays.asList(colabos));
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
