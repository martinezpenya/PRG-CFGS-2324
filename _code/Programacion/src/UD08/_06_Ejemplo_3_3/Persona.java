package UD08._06_Ejemplo_3_3;

import java.time.LocalDate;

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
}
