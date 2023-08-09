package UD06.P2_Ficheros;

import java.io.*;

public class P2_3_LecturaSecuencialTexto {

    final static String VOCALES = "AEIOUaeiouáéíóúàèìòù";

    public static void main(String[] args) {
        try (FileReader f = new FileReader(new File("texto.txt"));) {
            int contadorVocales = 0;
            int caracter;
            while ((caracter = f.read()) != -1) {
                char letra = (char) caracter;
                if (VOCALES.indexOf(letra) != -1) {
                    contadorVocales++;
                }
            }
            System.out.println("Numero de vocales: " + contadorVocales);
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer");
        }
    }
}