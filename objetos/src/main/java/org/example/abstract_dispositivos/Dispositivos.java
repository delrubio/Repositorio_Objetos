package org.example.abstract_dispositivos;

public abstract class Dispositivos {

    private String nombre;
    private boolean estado;

    public Dispositivos(String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){
        if (estado){
            estado=false;
            System.out.println(nombre + " está apagado.");
        }else {
            System.out.println(nombre + " ya está apagado");
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado=estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEstado(){
        System.out.println(nombre + " está " + (estado? "ecendido" : "apagado"));
    }
}
