package UD03;

//Programa Java para la excepción de falta de memoria.
import java.util.ArrayList;

public class P4_5_HeapSpace {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            ar.add(i);
        }
    }
}
