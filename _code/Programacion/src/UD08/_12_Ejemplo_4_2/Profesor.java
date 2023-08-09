package UD08._12_Ejemplo_4_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesor extends Persona {

    String especialidad;
    double salario;

    public Profesor(String nombre, String apellidos,
            LocalDate fechaNacim, String especialidad, double salario) {
        super(nombre, apellidos, fechaNacim);
        this.especialidad = especialidad;
        this.salario = salario;
    }
    
    // Método getEspecialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Método getSalario
    public double getSalario() {
        return salario;
    }

    // Método setSalario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método setEspecialidad
    public void setESpecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método getNombre
    @Override
    public String getNombre() {
        return "Profesor: " + this.nombre;
    }

    @Override
    public void mostrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringfecha = formato.format(this.fechaNacim);
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringfecha);
        // A continuación mostramos la información "especializada" de esta subclase
        System.out.printf("Especialidad: %s\n", this.especialidad);
        System.out.printf("Salario: %7.2f euros\n", this.salario);
    }
}