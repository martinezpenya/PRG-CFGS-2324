package UD07.P4_Comparadores.Comparator2;

import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        TreeSet<Objeto> ts = new TreeSet<>();

        ts.add(new Objeto(0, 1));
        ts.add(new Objeto(1, 2));
        ts.add(new Objeto(4, 5));
        ts.add(new Objeto(2, 3));

        for (Objeto o : ts) {
            System.out.println(o);
        }
    }
}
