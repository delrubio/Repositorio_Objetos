package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Persona persona1 = new Persona();
//        Persona persona2 = new Persona("Mohamed", "Hakimi", "ILEGAL", 'M', 26);
//        Persona persona3 = new Persona("Messi", "Liones", "23123141l", 'M', 21);
//
//        persona1.mostrarInfo();
//        persona2.mostrarInfo();
//
//        System.out.println(persona2.concatenar());
//
//        System.out.println("La edad de " + persona2.getNombre() + " es: " + persona2.getEdad() + " años");
//        persona1.setNombre("Sin nombre");
//        System.out.println(persona1.getNombre());
//
//        persona3.mostrarInfo();

        Paciente paciente = new Paciente("David", 18, 'H', 90, 1.90);
        Paciente paciente1 = new Paciente();
        paciente1.imprimirInfo();
        paciente.imprimirInfo();

    }
}