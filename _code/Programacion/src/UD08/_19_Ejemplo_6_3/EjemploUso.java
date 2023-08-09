package UD08._19_Ejemplo_6_3;

import java.time.LocalDate;
import java.util.Scanner;

public class EjemploUso {

    public static void main(String[] args) {
        Persona obj;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Deseas crear un Profesor o un Alumno ('p' o 'a')?: ");
        char respuesta = teclado.nextLine().toLowerCase().charAt(0);

        if (respuesta == 'a') {
            // Ejemplo de objeto polimórfico (en este caso va adquirir forma de Alumno)
            obj = new Alumno("Alumno", "Apellidos", LocalDate.of(1977, 3, 8));
        } else {
            // Ejemplo de objeto polimórfico (en este caso va adquirir forma de Profesor)
            obj = new Profesor("Profe", "Apellidos", LocalDate.of(1977, 3, 8));
        }
        System.out.format("Contenido del objeto: %s\n", obj.devolverContenidoString());
    } 
}