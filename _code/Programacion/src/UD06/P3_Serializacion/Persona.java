package UD06.P3_Serializacion;

import java.io.*;

public class Persona implements Serializable {

    private String nombre;
    transient private int edad; //No se guardará al serializar
    private double salario;
    private Persona tutor;

    public Persona(String nom, double salari) {
        this.nombre = nom;
        this.salario = salari;
        edad = 0;
        tutor = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public Persona getTutor() {
        return tutor;
    }

    public void incrementaEdad() {
        edad++;
    }

    public void asignaTutor(Persona p) {
        this.tutor = p;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}