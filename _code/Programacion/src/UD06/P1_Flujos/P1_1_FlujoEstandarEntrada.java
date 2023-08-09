package UD06.P1_Flujos;

import java.io.IOException;

public class P1_1_FlujoEstandarEntrada {

    public static void main(String[] args) {
        // Cadena donde iremos almacenando los caracteres que se escriban     
        StringBuilder str = new StringBuilder();
        char c;
        // Por si ocurre una excepción ponemos el bloque try-cath
        try {
            // Mientras la entrada de terclado no sea Intro
            while ((c = (char) System.in.read()) != '\n') {
                // Añadir el character leído a la cadena str
                str.append(c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // Escribir la cadena que se ha ido tecleando
        System.out.println("Cadena introducida: " + str);
    }
}