package UD06.P2_Ficheros;

import java.io.*;
import java.util.Scanner;

public class P2_6_EscrituraSecuencialBinario {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try (
                DataOutputStream fs = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("jugadores.dat")));) {
            for (int i = 1; i <= 5; i++) {
                //Pedimos datos al usuario
                System.out.println(" ---- Jugador " + i + " -----");
                System.out.print("Nombre: ");
                String nombre = tec.nextLine();

                System.out.print("Nacimiento: ");
                int anyo = tec.nextInt();

                System.out.print("Estatura: ");
                double est = tec.nextDouble();
                //Vaciar salto linea
                tec.nextLine();

                //Volcamos información al fichero
                fs.writeUTF(nombre);
                fs.writeInt(anyo);
                fs.writeDouble(est);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Probrema al abrir el fichero");
        } catch (IOException e) {
            System.out.println("Problema al leer o escribir");
        }
    }
}