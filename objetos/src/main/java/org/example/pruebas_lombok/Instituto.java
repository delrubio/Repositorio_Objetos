package org.example.pruebas_lombok;

import jdk.jfr.DataAmount;
import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@Data
public class Instituto {

    @NonNull //es un requerido porque quiere que no sea nulo
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre){
        this.nombre=Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        listaCursos = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void agregarEstudiantes(Estudiante estudiantes) {
        listaEstudiantes.add(estudiantes);
    }

}