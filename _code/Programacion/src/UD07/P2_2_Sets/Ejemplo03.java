package UD07.P2_2_Sets;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class Ejemplo03 {

    private static void imprimirColeccion(Collection<?> c) {
        for (Object i : c) {
            System.out.print(i.toString() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        TreeSet<Integer> conjuntoA = new TreeSet<>();
        conjuntoA.add(9);
        conjuntoA.add(19);
        conjuntoA.add(5);
        conjuntoA.add(7); // Elementos del conjunto A: 9, 19, 5 y 7
        LinkedHashSet<Integer> conjuntoB = new LinkedHashSet<>();
        conjuntoB.add(10);
        conjuntoB.add(20);
        conjuntoB.add(5);
        conjuntoB.add(7); // Elementos del conjunto B: 10, 20, 5 y 7

        conjuntoA.addAll(conjuntoB);
        imprimirColeccion(conjuntoA); //5 7 9 10 19 20

        conjuntoA.removeAll(conjuntoB);
        imprimirColeccion(conjuntoA); //9 19

        //recolocamos todo como al principio
        conjuntoA.add(5);
        conjuntoA.add(7);

        conjuntoA.retainAll(conjuntoB);
        imprimirColeccion(conjuntoA); //5 7
        
    }
}
