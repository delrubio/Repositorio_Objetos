package org.example.carrera_solidaria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
@AllArgsConstructor
@Data
public class Corredor {

    public static double importeVuelta = 0.50;
    public static int numeroVueltas = 0;

    @NonNull
    private String nombre;
    private int dorsal;
    private ArrayList<String> listapatrocinadores;
    private double importe_vuelta;
    private int vueltas_completadas;
}
