package org.example.excepciones;

public class NivelMaximoException extends RuntimeException{

    public NivelMaximoException(){
        super("El nivel no puede ser mayor a 100");
    }

}
