/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davpen
 */
public class Aleatorio {

    public static void main(String[] args) {
        System.out.print((int) ((Math.random() * 26) + 2));
        int direccion = (int) ((Math.random() * 3) + 1);
        System.out.println((direccion == 1) ? " ↑ amunt ↑" :  " ↓ avall ↓");
    }

}