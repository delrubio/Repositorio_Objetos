package org.example.biblioteca;

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

//        Paciente paciente = new Paciente("David", 18, 'H', 90, 1.90);
//        Paciente paciente1 = new Paciente();
//        paciente1.imprimirInfo();
//        paciente.imprimirInfo();

//        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("nombre?");
//        String nombre = teclado.next();
//        System.out.println("edad?");
//        int edad = teclado.nextInt();
//        System.out.println("genero?");
//        char genero = teclado.next().charAt(0);
//        System.out.println("peso?");
//        double peso = teclado.nextDouble();
//        System.out.println("altura?");
//        double altura = teclado.nextDouble();
//
//        Paciente paciente = new Paciente();
//        Paciente paciente1 = new Paciente(nombre, edad, genero);
//        Paciente paciente2 = new Paciente(nombre, edad, genero, peso, altura);
//
//        paciente1.setNombre("Agustín");
//        paciente1.setEdad(19);
//
////        paciente.imprimirInfo();
////        paciente1.imprimirInfo();
////        paciente2.imprimirInfo();
//
//        mostrarMensajeIMC(paciente);
//        mostrarMensajeIMC(paciente1);
//        mostrarMensajeIMC(paciente2);
//
//        mayorEdad(paciente);
//        mayorEdad(paciente1);
//        mayorEdad(paciente2);
//
//        System.out.println(paciente2);

//        Estudiante estudiante1 = new Estudiante("Paco");
//        Estudiante estudiante2 = new Estudiante("Rafaela");
//        Estudiante estudiante3 = new Estudiante("Rafaela", "2 ESO", "mellamomiguel@gmail.com");
//        Estudiante estudiante4 = new Estudiante("Rafaela", "2 ESO", "mellamomiguel@alu.edu.gva.es");
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//        System.out.println(estudiante3);
//        System.out.println(estudiante4);
//
//        if (Estudiante.validarCorreo(estudiante3.getEmail())){
//            System.out.println("BIEN!");
//        }else{
//            System.out.println("MAL");
//        }
//
//        if (Estudiante.validarCorreo(estudiante4  .getEmail())){
//            System.out.println("BIEN!");
//        }else{
//            System.out.println("MAL");
//        }
//
//    }
//
//    public static void mostrarMensajeIMC(Paciente paciente){
//
//        int peso = paciente.calcularIMC();
//
//        switch (peso){
//            case Paciente.BAJO_PESO:
//                System.out.println("El paciente " + paciente.getNombre() + " está por debajo del peso ideal.");
//                break;
//            case Paciente.PESO_IDEAL:
//                System.out.println("El paciente " + paciente.getNombre() + " está en su peso ideal.");
//                break;
//            case Paciente.SOBRE_PESO:
//                System.out.println("El paciente " + paciente.getNombre() + " está por encima del peso ideal.");
//            break;
//        }
//
//    }
//
//    public static void mayorEdad(Paciente paciente){
//
//        if (paciente.esMayorDeEdad()){
//            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad.");
//        }else{
//            System.out.println("El paciente " + paciente.getNombre() + " no es mayor de edad.");
//        }
//
        Editorial editorial1 = new Editorial("ANAYA", "España");

        Libro libro1 = new Libro("El principito", "Quevedo", editorial1);
        Libro libro2 = new Libro("Mikel de la Era", "Hola", editorial1);
        Libro libro3 = new Libro("Cano", "Kassandra", editorial1);

        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Agustin", "4 ESO", "mellamomiguel@alu.edu.gva.es");
        Estudiante estudiante3 = new Estudiante("Rafaela", "2 ESO", "mellamomiguel@gmail.com");

        System.out.println(editorial1);

        editorial1.insertarLibro(libro1);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);

        Prestamo prestamo1 = libro1.prestarLibro(estudiante3);

        libro2.prestarLibro(estudiante2);

        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolverLibro(estudiante3);

        System.out.println(Libro.getLibrosDisponibles());

        System.out.println(libro2.estaDisponible());

        System.out.println(estudiante2);
        System.out.println(estudiante3);

        System.out.println(prestamo1);

//        Persona persona1 = new Persona("Javi", "Vazquez", "50508996F", 'M', 18);
//        Equipo equipo1 = new Equipo("Real de Madrid");
//
//        equipo1.insertarIntegrante(persona1);
//        System.out.println(equipo1);
    }

}