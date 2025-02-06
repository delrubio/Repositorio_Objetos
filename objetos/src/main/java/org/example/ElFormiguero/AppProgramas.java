package org.example.ElFormiguero;

public class AppProgramas {
    public static void main(String[] args) {

//        Programa programa1 = new Programa("El Hormiguero");
//        Programa programa2 = new Programa("La Resistencia");
//        Programa programa3 = new Programa("La Isla de las Tentaciones");
//
//        Cadena cadena = new Cadena("Telecinco");
//        Cadena cadena1 = new Cadena("FDF");
//        Cadena cadena2 = new Cadena("A3Series");
//
//        programa1.setCadena(cadena);
//        programa2.setCadena(cadena1);
//        programa3.setCadena(cadena2);
//
//        cadena.setPrograma(programa1);
//        cadena1.setPrograma(programa2);
//        cadena2.setPrograma(programa3);
//
//        cadena.setListaProgramas(programa1);
//        cadena1.setListaProgramas(programa2);
//        cadena2.setListaProgramas(programa3);
//
//        System.out.println(programa1);
//        System.out.println(programa2);
//        System.out.println(programa3);
//
//        System.out.println(cadena);
//        System.out.println(cadena1);
//        System.out.println(cadena2);

//        programa1.agregarEmpleados("Miguel", "técnico");
//        programa1.agregarEmpleados("Maria", "técnico");
//        programa1.agregarEmpleados("Alejandro", "presentador");
//        programa1.agregarEmpleados("David", "colaborador");
//
//        programa2.agregarEmpleados("Miguel", "técnico");
//        programa2.agregarEmpleados("Maria", "técnico");
//        programa2.agregarEmpleados("Alejandro", "presentador");
//        programa2.agregarEmpleados("David", "colaborador");

//        programa1.agregarInvitado("Paco", "Estuiante", 1);
//
//        programa1.invitadosTemporada(1);
//
//        System.out.println(programa1);
//        System.out.println(" ");
//        System.out.println(programa2);

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero");
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        //insertamos empleados en el programa
        el_hormiguero.agregarEmpleados("Pablo Motos","presentador");
        System.out.println(el_hormiguero);
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        //insertamos invitados en el programa
        el_hormiguero.agregarInvitado("Aitana","cantante",1);
        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

    }
}