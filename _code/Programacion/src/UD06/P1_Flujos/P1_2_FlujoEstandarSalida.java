package UD06.P1_Flujos;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class P1_2_FlujoEstandarSalida {

    public static void main(String[] args) {
        // Por si ocurre una excepción ponemos el bloque try-cath
        try {
            PrintWriter salida = new PrintWriter(new FileWriter("test/salida.txt", true));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while (!(s = br.readLine()).toLowerCase().equals("salir")) {
                salida.println(s);
            }
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }        
    }
}