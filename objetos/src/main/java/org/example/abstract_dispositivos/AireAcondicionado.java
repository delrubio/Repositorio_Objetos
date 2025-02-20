package org.example.abstract_dispositivos;

public class AireAcondicionado extends Dispositivos implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    public void sincronizar() {
        System.out.println("Sincronizando el aire acondicionado con control remoto...");
    }

    public void encender() {
        if (getEstado()){
            System.out.println("El aire acondicionado ya está encendido.");
        }else {
            System.out.println("Encendiendo el aire acondicionado...");
            setEstado(true);
        }
    }
}
