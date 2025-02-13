package org.example.herencia_rrss;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numero_retransmisiones=numero_retransmisiones;
        this.horas_directo=horas_directo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Retransmisiones: " + numero_retransmisiones);
        System.out.println("Numero de Horas: " + horas_directo);
    }
}
