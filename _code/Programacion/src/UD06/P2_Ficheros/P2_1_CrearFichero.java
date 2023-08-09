package UD06.P2_Ficheros;

import java.io.*;

public class P2_1_CrearFichero {

    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("src/texto.txt");
            f.write("Este texto se escribe en el fichero\n\r");
        } catch (IOException e) {
            System.out.println("Problema al abrir o escribir ");
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    System.out.println("Problema al cerrar el fichero");
                }
            }
        }
    }
}