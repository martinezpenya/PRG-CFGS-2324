package UD03;

public class P5_1_sentencia_break {
 
    public static void main(String[] args) {
        int contador;
        for (contador=1;contador<=10;contador++){
            if (contador==7)
                break;
            System.out.println("Valor: " + contador);
        }
        System.out.println("Fin del programa");
        /*
         * El bucle solo se ejecutará en 6 ocasiones, ya que cuando
         * la variable contador sea igual a 7 encontraremos un break que
         * romperá el flujo del bucle, transfiriéndonos a la sentencia que
         * imprime el mensaje de Fin del programa.
         */
    }
}