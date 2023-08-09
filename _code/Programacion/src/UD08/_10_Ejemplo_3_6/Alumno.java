package UD08._10_Ejemplo_3_6;

import java.time.LocalDate;

public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;

    public Alumno(String nombre, String apellidos,
            LocalDate fechaNacim, String grupo, double notaMedia) {
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
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
        // Llamada al método "mostrar" de la superclase
        super.mostrar();
        // A continuación mostramos la información "especializada" de esta subclase
        System.out.printf("Grupo: %s\n", this.grupo);
        System.out.printf("Nota media: %5.2f\n", this.notaMedia);
    }
}
