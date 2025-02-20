package org.example.abstract_dispositivos;

public class ParlanteInteligente extends Dispositivos{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (getEstado()){
            System.out.println("Alexa ya está conectada.");
        }else{
            System.out.println("Activando Alexa con comando de voz...");
            setEstado(true);
        }
    }
}
