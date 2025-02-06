package org.example;

import org.example.pruebas_lombok.Curso;
import org.example.pruebas_lombok.Estudiante;
import org.example.pruebas_lombok.Instituto;

public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("IES MUTXAMEL");
        //crear cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);

        try {
            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoPython);
            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
            instituto.agregarEstudiantes(estudiante1);
            instituto.agregarEstudiantes(estudiante2);
            //intento de crear un estudiante con nombre nulo (esto lanza
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }
        //intento de añadir un estudiante nulo en la lista de estudiantes
        instituto.agregarEstudiantes(null);
        //intento de añadir un curso nulo en la lista de cursos
        instituto.agregarCurso(null);
        //mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());
        //mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
    }
}


//        try {
//            Instituto villafranqueza = new Instituto(null, 21);
//            System.out.println(villafranqueza);
//        }catch (NullPointerException e){
//            System.out.println("Pichón pon bien el nombre");
//        }
//        Instituto hola = new Instituto("Caca", 12, "tumadreesmuyguapa");
//        System.out.println(hola);
