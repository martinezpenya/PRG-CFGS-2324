package UD08._07_Ejemplo_3_3_1;

public class Alumno extends Persona {

    protected String grupo;
    protected double notaMedia;

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
}
