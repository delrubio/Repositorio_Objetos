package org.example.carrera_solidaria;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Organizador {

    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;
}
