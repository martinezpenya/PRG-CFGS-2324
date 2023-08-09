package UD08._09_Ejemplo_3_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacim;

    // Método getNombre
    public String getNombre() {
        return nombre;
    }

    // Método getApellidos
    public String getApellidos() {
        return apellidos;
    }

    // Método getFechaNacim
    public LocalDate getFechaNacim() {
        return this.fechaNacim;
    }

    // Método setNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setApellidos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método setFechaNacim
    public void setFechaNacim(LocalDate fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public void mostrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringfecha = formato.format(this.fechaNacim);
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringfecha);
    }
}
