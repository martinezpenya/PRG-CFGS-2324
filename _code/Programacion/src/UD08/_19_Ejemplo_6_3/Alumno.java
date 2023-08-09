package UD08._19_Ejemplo_6_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;

    public Alumno(String nombre, String apellidos,
            LocalDate fechaNacim, String grupo, double notaMedia) {
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public Alumno(String nombre, String apellidos,
            LocalDate fechaNacim) {
        super(nombre, apellidos, fechaNacim);
    }

    // Método getGrupo
    public String getGrupo() {
        return grupo;
    }

    // Método getNotaMedia
    public double getNotaMedia() {
        return notaMedia;
    }

    // Método setGrupo
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // Método setNotaMedia
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Método getNombre
    @Override
    public String getNombre() {
        return "Alumno: " + this.nombre;
    }

    @Override
    public void mostrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringfecha = formato.format(this.fechaNacim);
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellidos: %s\n", this.apellidos);
        System.out.printf("Fecha de nacimiento: %s\n", stringfecha);
        // A continuación mostramos la información "especializada" de esta subclase
        System.out.printf("Grupo: %s\n", this.grupo);
        System.out.printf("Nota media: %5.2f\n", this.notaMedia);
    }

    @Override
    public HashMap devolverContenidoHashMap() {
        // Llamada al método de la superclase
        HashMap contenido = super.devolverContenidoHashMap();
        // Añadimos los atributos específicos de la clase
        contenido.put("grupo", this.grupo);
        contenido.put("notaMedia", this.notaMedia);
        // Devolvemos la HashMap rellena
        return contenido;
    }

    @Override
    public ArrayList devolverContenidoArrayList() {
        // Llamada al método de la superclase
        ArrayList contenido = super.devolverContenidoArrayList();
        // Añadimos los atributos específicos de la clase
        contenido.add(this.grupo);
        contenido.add(this.notaMedia);
        // Devolvemos la ArrayList
        return contenido;
    }

    @Override
    public String devolverContenidoString() {
        // Llamada al método de la superclase
        String contenido = super.devolverContenidoString();
        //Eliminamos el último carácter, que contiene una llave de cierre.
        contenido = contenido.substring(0, contenido.length() - 1);
        contenido = contenido + ", " + this.grupo + ", " + this.notaMedia + "}";
        // Devolvemos el String creado.
        return contenido;
    }
}
