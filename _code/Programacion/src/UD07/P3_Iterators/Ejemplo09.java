package UD07.P3_Iterators;

import UD07.P2_3_Listas.Producto;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo09 {

    public static void main(String[] args) {

        //Definimos 5 instancias de la clase Producto
        Producto p1 = new Producto("Pan", 6);
        Producto p2 = new Producto("Leche", 2);
        Producto p3 = new Producto("Manzanas", 5);
        Producto p4 = new Producto("Brocoli", 2);
        Producto p5 = new Producto("Carne", 2);

        //Definir un ArrayList
        ArrayList<Producto> lista = new ArrayList<>();

        //Colocar instancias de producto en ArrayList
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        //Añadimos "Carne" en la posición 1 de la lista
        lista.add(1, p5);

        //Añadimos "Carne" en la última posición
        lista.add(p5);

        
        //Imprimir el contenido del ArrayList
        System.out.println(" - Lista con " + lista.size() + " elementos");
       
        //Definir Iterator  para extraer/imprimir valores
        //si queremos utilizar un for con el iterador no hace falta poner el incremento
        for (Iterator<Producto> it = lista.iterator(); it.hasNext();) {
            Producto p = it.next();
            System.out.println(p.getNombre() + " : " + p.getCantidad());
        }
        //Salida:
        // - Lista con 6 elementos
        //Pan : 6
        //Carne : 2
        //Leche : 2
        //Manzanas : 5
        //Brocoli : 2
        //Carne : 2

        p5.setCantidad(99); //cambiamos la cantidad al producto, cambiará la lista?

        ((Producto)lista.get(1)).setCantidad(66); //
        
        System.out.println(p5.getCantidad());
        
        //Imprimir el contenido del ArrayList
        System.out.println(" - Lista con " + lista.size() + " elementos");

        //Definir Iterator  para extraer/imprimir valores
        //si queremos utilizar un for con el iterador no hace falta poner el incremento
        for (Iterator<Producto> it = lista.iterator(); it.hasNext();) {
            Producto p = it.next();
            System.out.println(p.getNombre() + " : " + p.getCantidad());
        }
        
        //Eliminar todos los valores del ArrayList
        lista.clear();
        System.out.println(" - Lista final con " + lista.size() + " elementos");
    }
}
