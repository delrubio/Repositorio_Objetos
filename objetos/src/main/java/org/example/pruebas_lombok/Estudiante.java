package org.example.pruebas_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}