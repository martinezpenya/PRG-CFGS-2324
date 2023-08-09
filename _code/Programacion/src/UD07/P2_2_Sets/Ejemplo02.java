package UD07.P2_2_Sets;

import java.util.LinkedHashSet;

/**
 *
 * @author David Martínez (wwww.martinezpenya.es|ieseduardoprimo.es)
 */
public class Ejemplo02 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> t = new LinkedHashSet<>();
        t.add(4);
        t.add(3);
        t.add(1);
        t.add(99);
        for (Integer i : t) {
            System.out.print(i + " ");
        }
    }
}
