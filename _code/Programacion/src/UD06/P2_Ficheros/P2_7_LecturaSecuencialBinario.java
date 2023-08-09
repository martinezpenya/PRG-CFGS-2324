package UD06.P2_Ficheros;

import java.io.*;
import java.util.Scanner;

public class P2_7_LecturaSecuencialBinario {

    public static void main(String[] args) {

        try (DataInputStream fe = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream("jugadores.dat")));) {
            while (true) {
                //Leemos nombre
                System.out.println(fe.readUTF());

                //leemos y desechamos resto de datos
                fe.readInt();
                System.out.println(fe.readDouble());
            }
        } catch (EOFException e) {
            //Se lanzará cuando se llegue al final del fichero
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
    }
}