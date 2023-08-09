package UD08._06_Ejemplo_3_3;

import java.time.LocalDate;

public class Profesor extends Persona {

    String especialidad;
    double salario;

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

    // Método getEspecialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Método getSalario
    public double getSalario() {
        return salario;
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

    // Método setSalario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método setESpecialidad
    public void setESpecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
