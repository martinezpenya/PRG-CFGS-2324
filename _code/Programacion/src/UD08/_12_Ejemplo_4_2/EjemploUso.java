package UD08._12_Ejemplo_4_2;

import java.time.LocalDate;

public class EjemploUso {

    public static int calcularEdad(final Alumno a) {
        a.grupo="2SMX";
        return 14;
    }

    public static void main(String[] args) {
        // Declaración de objetos
        Alumno alumno;
        Profesor profesor;
        // Creación de objetos (llamada a constructores)
        alumno = new Alumno("Juan", "Torres", LocalDate.of(1990, 10, 6), "1DAW",
                7.5);
        profesor = new Profesor("Antonio", "Campos", LocalDate.of(1970, 8, 15),
                "Informatica", 2000);
        // Utilización del método mostrar
        alumno.mostrar();
        profesor.mostrar();
        System.out.println(calcularEdad(alumno));
        alumno.mostrar();

    }
}
