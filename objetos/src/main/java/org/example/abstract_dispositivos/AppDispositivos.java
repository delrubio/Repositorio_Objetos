package org.example.abstract_dispositivos;

import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {
        ArrayList<Dispositivos> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART TV"));
        listaDispositivos.add(new ParlanteInteligente("ALEXA"));
        listaDispositivos.add(new AireAcondicionado("Mitsubishi"));
        listaDispositivos.add(new Televisor("SAMSUNG Q-LED"));


        Dispositivos proyector = new Dispositivos("Toshiba") {
            @Override
            public void encender() {
                if (getEstado()) {
                    System.out.println("Ya está encendido");
                }else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo");
                    setEstado(true);
                }
            }
        };

        ControlRemoto proyector_remoto = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación");
            }
        };

        Dispositivos horno = new Dispositivos("Balay") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("Ya está encendido.");
                }else {
                    System.out.println("Calentando horno con ajuste automático de temperatura..");
                    setEstado(true);
                }
            }
        };

        listaDispositivos.add(horno);
        listaDispositivos.add(proyector);

        for(Dispositivos disp : listaDispositivos){
            System.out.println("-------------");

            disp.encender();

            if (disp instanceof ControlRemoto){//no se puede mostrar todos los dispositivos con ControlRemoto porque no
                // todos tienen esa instancia
                ((ControlRemoto) disp).sincronizar();
            }else if (disp.getNombre().equals("Toshiba")){
                proyector_remoto.sincronizar();
            }

            disp.mostrarEstado();
            disp.apagar();
        }
        
    }
}
