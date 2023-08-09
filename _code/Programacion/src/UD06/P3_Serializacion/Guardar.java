package UD06.P3_Serializacion;

import java.io.*;

public class Guardar {

    public static void main(String args[]) {
        ObjectOutputStream salida;
        Persona p1, p2, p3, p4;

        p1 = new Persona("Vicent", 1200.0);
        p2 = new Persona("Mireia", 1800.0);
        p3 = new Persona("Josep", 2100.0);
        p4 = new Persona("Marta", 850.0);

        p1.setEdad(55);
        p1.asignaTutor(p2);
        p2.asignaTutor(p3);
        p3.asignaTutor(p4);
        
        System.out.println(p1.getEdad());

        try {
            salida = new ObjectOutputStream(new FileOutputStream("src/empleats.ser"));
            salida.writeObject(p1);
            salida.close();
        } catch (IOException e) {
            System.out.println("Algún problema guardando a disco.");
        }
    }
}