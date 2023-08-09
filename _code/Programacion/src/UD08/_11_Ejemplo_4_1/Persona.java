package UD08._11_Ejemplo_4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacim;

    public Persona(String nombre, String apellidos, LocalDate fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
    }

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
        String stringFecha = formato.format(this.fechaNacim);
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringFecha);
    }
}
