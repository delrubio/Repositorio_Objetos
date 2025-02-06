package org.example.ElFormiguero;

import java.util.Arrays;

public class Empleado {

    public static final String ID_EMPLEADO= "EP";//si necesitamos cambiar el prefijo de las ID, se cambia en todos lados
    public static int numeroEmpleados = 0; //contador que usaré para que se sumen los números de empleados
    public static String[] listaCargos = {"director", "técnico", "presentador", "colaborador"};//lista donde quedan registrados los cargos

    private String id;
    private String nombre;
    private String cargo;

    private Empleado director;

    public Empleado(String nombre, String cargo){
        setId();//no paso la id porque el metodo la calcula sola
        this.nombre=nombre;
        setCargo(cargo);//cogemos el cargo que nos han pasado por el constructor y se lo mandamos al metodo para que haga
                        // la lógica que sea conveniente
        setDirector(this);//le decimos al setDirector que me paso a mi mismo para ver si puedo o no puedo serlo
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (Arrays.asList(listaCargos).contains(cargo)){//me meto en la lista de cargos y veo si los que me han introducido
                                                        // coincide o si no coincide se le pondrá como cargo pte.
            this.cargo=cargo;
        }else {
            this.cargo="pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        if (director.getCargo().equals("director")){//miramos que si el objeto de tipo Empleado es director, lo hacemos el director.
            this.director=director;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id=ID_EMPLEADO + String.format("%03d", ++numeroEmpleados);//establecemos la id con el prefijo global, y el String.format
                                                                        // que rellena con ceros delante justo del contador de empleado
    }

    @Override
    public String toString(){
        return "Empleado | Nombre: " + getNombre() + " | ID: " + getId() + " | Cargo: " + getCargo() + " | Director : " + director.getNombre();
    }

}
