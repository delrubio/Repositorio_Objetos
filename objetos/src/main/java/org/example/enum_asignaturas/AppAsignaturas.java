package org.example.enum_asignaturas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppAsignaturas {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);

        for (Asignaturas asag : Asignaturas.values()){
            System.out.println("Asignatura " + asag + ", tiene " + asag.getHoras() + " horas.");
        }

        System.out.println("Dime una asignatura." + Arrays.toString(Asignaturas.values()));
        String modulo = teclado.next();
        Asignaturas modulo_asignatura = Asignaturas.valueOf(modulo);
        System.out.println(modulo_asignatura);

        String ipe_string = ipe.name();
        System.out.println(ipe_string + " como string");

        int posicion = Asignaturas.ENTORNOS_DE_DESARROLLO.ordinal();
        System.out.println(posicion + " es la posición de entornoss");

    }
}
