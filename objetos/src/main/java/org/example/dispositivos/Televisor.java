package org.example.dispositivos;

public class Televisor extends Dispositivos implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (getEstado()){
            System.out.println("El Televisore ya está encendido");
        }else {
            System.out.println("Encendiendo el Televisor...");
            setEstado();
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando el Televisor con control remoto...");
    }
}
