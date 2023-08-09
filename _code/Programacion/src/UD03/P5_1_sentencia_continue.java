package UD03;

public class P5_1_sentencia_continue {

    public static void main(String[] args) {
        int contador;
        System.out.println("Imprimiendo los números pares que hay del 1 al 10...");
        for (contador = 1; contador <= 10; contador++) {
            if (contador % 2 != 0) {
                continue;
            }
            System.out.println(contador + " ");
        }
        System.out.println("\nFin del programa");
        /*
         * Las iteraciones del bucle que generarán la impresión de cada uno de
         * los números pares, serán aquellas en las que el resultado de calcular
         * el resto de la división entre 2 de cada valor de la variable
         * contador, sea igual a 0.
         */
    }
}