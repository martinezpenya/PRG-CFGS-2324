package UD06.P5_Manejo;

import java.io.*;
import java.util.*;

public class P5_1_Manejo {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce ruta absoluta de una carpeta");
        String nombreCarpeta = tec.nextLine();
        //Creamos objeto File para representar a la carpeta
        File car = new File(nombreCarpeta);
        //Comprobamos si existe
        if (car.exists()) {
            //¿Es una carpeta?
            if (car.isDirectory()) {
                if (car.canRead()) {
                    System.out.println("Lectura permitida");
                } else {
                    System.out.println("Lectura no permitida");
                }

                if (car.canWrite()) {
                    System.out.println("Escritura permitida");
                } else {
                    System.out.println("Escritura no permitida");
                }

                if (car.isHidden()) {
                    System.out.println("Carpet oculta");
                } else {
                    System.out.println("Carpeta visible");
                }

                System.out.println("---- Contenido de la carpeta ----");
                File[] contenido = car.listFiles();
                for (File f : contenido) {
                    System.out.println(f.getName() +" "+f.isDirectory());
                }
            } else {
                System.out.println(car.getAbsolutePath() + " No es una carpeta");
            }
        } else {
            System.out.println(
                    "No existe la carpeta/archivo " + car.getAbsolutePath());
        }
    }
}