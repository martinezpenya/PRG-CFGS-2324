package UD07.P4_Comparadores.Comparator2;

public class Objeto implements Comparable<Objeto> {

    public int a;
    public int b;

    public Objeto(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Objeto{" + "a=" + a + ", b=" + b + '}';
    }

    @Override
    public int compareTo(Objeto t) {
        int sumao1 = this.a + this.b;
        int sumao2 = t.a + t.b;
        if (sumao1 < sumao2) {
            return -1;
        } else if (sumao1 > sumao2) {
            return 1;
        } else {
            return 0;
        }
    }

}
