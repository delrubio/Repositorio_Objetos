package org.example;

import java.util.Random;

public class Paciente {

    public final static  char GENERO_DEF = 'X';
    public final static int BAJO_PESO = -1;
    public final static int PESO_IDEAL= 0;
    public final static int SOBRE_PESO = 1;
    public final static int MAYOR_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;

    public Paciente(){
//        this.genero=GENERO_DEF;
//        generarDni();

        this("", 0, GENERO_DEF, 0.0, 0.0);
        //ponemos estos parametros para que salte al otro constructor Paciente() que rellena con esa info.
    }

    public Paciente(String nombre, int edad, char genero){
        this(nombre, edad, genero, 0.0, 0.0);
    }

    public Paciente(String nombre, int edad, char genero, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;

        setGenero(genero);

        this.peso=peso;
        this.altura=altura;
        generarDni();
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setGenero(char genero){
        comprobarGenero(genero);
    }

    public char getGenero(){
        return genero;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getAltura(){
        return altura;
    }

    private String generarDni(){

        Random random = new Random();

        int numeroDni = random.nextInt(10000000, 99999999);
        int resto = numeroDni%23;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        return this.dni=Integer.toString(numeroDni) + letras[resto];
    }

    public int calcularIMC(){

        double resultado = peso/Math.pow(peso, 2);

        if (resultado < 20){
            return BAJO_PESO;
        }else if (resultado>25)
            return SOBRE_PESO;
        else {
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){

        if (edad>=MAYOR_EDAD){
            return true;
        }else {
            return false;
        }
    }

    private void comprobarGenero(char genero){

        if (genero=='M' || genero=='H'){
            this.genero=genero;
        }else {
            this.genero=GENERO_DEF;
        }

    }

    public void imprimirInfo(){
        System.out.println(this.nombre + " " + this.edad + " " + this.genero + " " + this.altura + " " + this.altura + " " + this.peso + " " + this.dni);
    }

}
