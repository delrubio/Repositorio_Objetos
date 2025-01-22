package org.example;

import java.util.Scanner;

public class Televisor {

    static Scanner teclado = new Scanner(System.in);

    private int canal;
    private int volumen;

    public Televisor(){

    }

    public Televisor(int canal, int volumen){

        setCanal(canal);
        setVol(volumen);

    }

    public void mostrarInfo(){
        System.out.println("Canal: " + this.canal);
        System.out.println("Volumen: " + this.volumen);

    }

    public void subirVol(){
        System.out.println("Subir el volumen [s] y bajar el volumen [b]");
        String opc = teclado.next();

        if (opc.equalsIgnoreCase("e")){
            this.volumen=volumen++;
            setVol(this.volumen);
        }else if (opc.equalsIgnoreCase("e")){
            bajarVol();
        }

    }

    public void bajarVol(){
        this.volumen=volumen--;
        setCanal(this.volumen);
    }

    public void subirCanal(){

    }

    public void bajarCanal(){

    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){

        if (canal >= 1 || canal <= 99){
            this.canal=canal;
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
    }

    public int getVol(){
        return this.volumen;
    }

    public void setVol(int volumen){
        if (volumen >= 0 || volumen <= 100){
            this.volumen=volumen;
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
    }


}
