package org.example.enum_asignaturas;

public enum Asignaturas {
    PROGRAMACION(256), IPE(92), BBDD(14), LENGUAJE_DE_MARCAS(87), SISTEMAS_INFORMATICOS(176), PROYECTO_INTERMODURLAR(54), ENTORNOS_DE_DESARROLLO(104);

    private int horas;

    Asignaturas(int horas){
        this.horas=horas;
    }

    public int getHoras(){
        return horas;
    }

}
