package UD07.P3_Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo08 {

    public static void main(String[] args) {
        //creamos la lista
        ArrayList<String> l = new ArrayList<>();

        //Añadimos elementos al final de la lista
        l.add("uno");
        l.add("dos");
        l.add("tres");
        l.add("cuatro");

        //Añadimos el elemento en la posición 2
        l.add(2, "dos2");

        System.out.println(l.size()); //devuelve 5
        System.out.println(l.get(0)); //devuelve uno
        System.out.println(l.get(1)); //devuelve dos
        System.out.println(l.get(2)); //devuelve dos2
        System.out.println(l.get(3)); //devuelve tres
        System.out.println(l.get(4)); //devuelve cuatro

        //Recorremos la lista con un for y mostramos su contenido
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
        }//imprime: unodosdos2trescuatro

        System.out.println();

        //Recorremos la lista con un Iterador
        //creamos el iterador
        Iterator it = l.iterator();

        //mientras haya elementos
        while (it.hasNext()) {
            System.out.print(it.next()); //obtengo el siguiente elemento
        }//imprime; unodosdos2trescuatro

        System.out.println();

        for (String s : l) {
            System.out.print(s);
        }//imprime; unodosdos2trescuatro
    }
}
