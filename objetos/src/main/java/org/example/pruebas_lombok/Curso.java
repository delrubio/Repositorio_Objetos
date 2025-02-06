package org.example.pruebas_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class Curso {

    @NonNull
    private String nombre;
    private int horas;
}