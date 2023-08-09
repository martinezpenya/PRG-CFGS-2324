package UD08._08_Ejemplo_3_4;

public class Profesor extends Persona {

    String especialidad;
    double salario;

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
}