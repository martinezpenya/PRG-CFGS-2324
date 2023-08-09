package UD03;

public class P5_2_EtiquetasSalto {

    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            bloque_uno:
            {
                bloque_dos:
                {
                    System.out.println("Iteración: " + i);
                    if (i == 1) {
                        break bloque_uno;
                    }
                    if (i == 2) {
                        break bloque_dos;
                    }
                }
                System.out.println("después del bloque dos");
            }
            System.out.println("después del bloque uno");
        }
        System.out.println("Fin del bucle");
    }
}