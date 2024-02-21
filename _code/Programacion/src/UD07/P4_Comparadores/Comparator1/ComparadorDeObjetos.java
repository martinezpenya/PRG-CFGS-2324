package UD07.P4_Comparadores.Comparator1;

import java.util.Comparator;

class ComparadorDeObjetos implements Comparator<Objeto> {

    @Override
    public int compare(Objeto o1, Objeto o2) {
        int sumao1 = o1.a + o1.b;
        int sumao2 = o2.a + o2.b;
        if (sumao1 < sumao2) {
            return -1;
        } else if (sumao1 > sumao2) {
            return 1;
        } else {
            return 0;
        }
    }
}
