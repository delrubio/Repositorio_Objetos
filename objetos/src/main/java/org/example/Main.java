package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco", "Sanchez", "50508996F", 'M', 8);

        persona1.mostrarInfo();
        persona2.mostrarInfo();

        System.out.println(persona2.concatenar());

    }
}