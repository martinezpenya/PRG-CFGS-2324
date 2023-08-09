package UD08._14_Ejemplo_5_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

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
        String stringFecha = formato.format(this.fechaNacim);
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringFecha);
        // A continuación mostramos la información "especializada" de esta subclase
        System.out.printf("Especialidad: %s\n", this.especialidad);
        System.out.printf("Salario: %7.2f euros\n", this.salario);
    }

    @Override
    public HashMap devolverContenidoHashMap() {
        // Llamada al método de la superclase
        HashMap contenido = super.devolverContenidoHashMap();
        // Añadimos los atributos específicos de la clase
        contenido.put("grupo", this.especialidad);
        contenido.put("notaMedia", this.salario);
        // Devolvemos la HashMap rellena
        return contenido;
    }

    @Override
    public ArrayList devolverContenidoArrayList() {
        // Llamada al método de la superclase
        ArrayList contenido = super.devolverContenidoArrayList();
        // Añadimos los atributos específicos de la clase
        contenido.add(this.especialidad);
        contenido.add(this.salario);
        // Devolvemos la ArrayList
        return contenido;
    }

    @Override
    public String devolverContenidoString() {
        // Llamada al método de la superclase
        String contenido = super.devolverContenidoString();
        //Eliminamos el último carácter, que contiene una llave de cierre.
        contenido = contenido.substring(0, contenido.length() - 1);
        contenido = contenido + ", " + this.especialidad + ", " + this.salario + "}";
        // Devolvemos el String creado.
        return contenido;
    }    
}