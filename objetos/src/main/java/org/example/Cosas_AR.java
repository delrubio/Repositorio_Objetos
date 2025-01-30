package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Cosas_AR {
    public static void main(String[] argas){

        ArrayList<Integer>listaNum = new ArrayList<>();

        listaNum.add(9);
        listaNum.add(19);
        listaNum.add(2);
        listaNum.add(4);
        listaNum.add(1);

        System.out.println(listaNum.get(1));
        listaNum.remove(1);
        System.out.println(listaNum.get(1));
        listaNum.remove((Integer) 4);
        System.out.println(listaNum);
        System.out.println(listaNum.indexOf(54));
        System.out.println(listaNum.size());

        for (int i = 0; i < listaNum.size(); i++) {
            System.out.println(listaNum.get(i));
        }

        for (int num : listaNum){
            System.out.println(num);
        }

        listaNum.set(1, 34);
        System.out.println(listaNum);

        ArrayList<Integer>listaNum_copia = (ArrayList<Integer>) listaNum.clone();
        System.out.println(listaNum_copia);

        if(listaNum.contains(9)){
            System.out.println("Tienes un 9");
        }else {
            System.out.println("No hay un 9");
        }

        if(listaNum.isEmpty()){
            System.out.println("Lista vaccía");
        }else {
            System.out.println("Lista no vacia");
        }

        listaNum_copia.addAll(Arrays.asList(2,5,4,7,8));
        System.out.println(listaNum_copia);

        añadirVarios(listaNum, 6,8,7,1);
        System.out.println(listaNum);

    }

    public static void añadirVarios(ArrayList<Integer> lista, Integer... num){
        lista.addAll(Arrays.asList(num));
    }
}
