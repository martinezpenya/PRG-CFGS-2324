package UD08._18_Ejemplo_6_2;

import java.util.Scanner;

public class EjemploUso {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Deseas un Piano o una Flauta (p o f)?: ");
        char respuesta = teclado.nextLine().toLowerCase().charAt(0);

        Instrumento instrumento1; // Ejemplo de objeto polimórfico (podrá ser Piano o Flauta)
        if (respuesta == 'p') {
            // Ejemplo de objeto polimórfico (en este caso va adquirir forma de Piano)
            instrumento1 = new Piano();
        } else {
            // Ejemplo de objeto polimórfico (en este caso va adquirir forma de Flauta)
            instrumento1 = new Flauta();
        }
        // Interpretamos una nota con el objeto instrumento1
        // No sabemos si se ejecutará el método tocarNota de Piano o de Flauta
        // (dependerá de la ejecución)
        instrumento1.tocarAgudo();
        instrumento1.estirarCuerda();
        instrumento1.tocarNota("do");  // Ejemplo de ligadura dinámica (tiempo de ejecución)
    }
}
