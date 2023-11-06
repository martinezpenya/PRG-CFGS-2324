package UD03;

import java.util.Scanner;

public class P6_2_PropagacionExcepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduzca un número entre 0 y 100: ");
            String linea = teclado.nextLine();
            int numero = Integer.parseInt(linea);
            metodoA(numero);
        } catch (Exception e) {
            System.out.println("Excepción atrapada en el método main: " + e.getMessage());
        }
    }

    public static void metodoA(int numero) {
        try {
            metodoB(numero);
        } catch (ArithmeticException e) {
            System.out.println("Excepción atrapada en el método A: " + e.getMessage());
        }
    }

    public static void metodoB(int divisor) {
        int resultado = 10 / divisor;
    }

}