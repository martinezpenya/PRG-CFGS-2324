package UD07.P2_3_Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Ejemplo05 {
    
    private static void imprimirColeccion(Collection<?> c) {
        for (Object i : c) {
            System.out.print(i.toString() + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> t = new LinkedList<>(); // Declaración y creación del LinkedList de enteros.
        t.add(1); // Añade un elemento al final de la lista.
        t.add(3); // Añade otro elemento al final de la lista.
        t.add(1, 2); // Añade en la posición 1 el elemento 2.
        t.add(t.get(1) + t.get(2)); // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.
        t.remove(0); // Elimina el primer elementos de la lista.
        imprimirColeccion(t); //2 3 5 

        ArrayList<Integer> al = new ArrayList<>(); // Declaración y creación del ArrayList de enteros.
        al.add(10);
        al.add(11); // Añadimos dos elementos a la lista.
        al.set(al.indexOf(11), 12); // Sustituimos el 11 por el 12, primero lo buscamos y luego lo reemplazamos.

        al.addAll(0, t.subList(1, t.size()));
        imprimirColeccion(al); //3 5 10 12 
        
        al.subList(0, 2).clear();
        imprimirColeccion(al); //10 12 
    }
}
