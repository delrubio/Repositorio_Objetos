package org.example.dispositivos;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {
        ArrayList<Dispositivos> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART TV"));
        listaDispositivos.add(new ParlanteInteligente("ALEXA"));
        listaDispositivos.add(new AireAcondicionado("Mitsubishi"));
        listaDispositivos.add(new Televisor("SAMSUNG Q-LED"));

        for(Dispositivos disp : listaDispositivos){
            System.out.println("-------------");

            disp.encender();

            if (disp instanceof ControlRemoto){//no se puede mostrar todos los dispositivos con ControlRemoto porque no
                // todos tienen esa instancia
                ((ControlRemoto) disp).sincronizar();
            }

            disp.mostrarEstado();
            disp.apagar();
        }


    }
}
