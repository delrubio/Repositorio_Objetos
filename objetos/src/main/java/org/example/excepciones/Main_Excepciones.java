package org.example.excepciones;

public class Main_Excepciones {
    public static void main(String[] args) throws NivelMaximoException {
        int nivel = 120;

        if (nivel>100){
            throw new NivelMaximoException();
        }
    }
}
