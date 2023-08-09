package UD08._14_Ejemplo_5_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Persona implements Imprimible {

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

    public abstract void mostrar();

    @Override
    public HashMap devolverContenidoHashMap() {
        // Creamos la HashMap que va a ser devuelta
        HashMap contenido = new HashMap();
        // Añadimos los atributos de la clase
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringFecha = formato.format(this.fechaNacim);
        contenido.put("nombre", this.nombre);
        contenido.put("apellidos", this.apellidos);
        contenido.put("fechaNacim", stringFecha);
        // Devolvemos la HashMap
        return contenido;
    }

    @Override
    public ArrayList devolverContenidoArrayList() {
        // Creamos la ArrayList que va a ser devuelta
        ArrayList contenido = new ArrayList();
        // Añadimos los atributos de la clase
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringFecha = formato.format(this.fechaNacim);
        contenido.add(this.nombre);
        contenido.add(this.apellidos);
        contenido.add(stringFecha);
        // Devolvemos la ArrayList
        return contenido;
    }

    @Override
    public String devolverContenidoString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String stringFecha = formato.format(this.fechaNacim);
        String contenido = "{" + this.nombre + ", " + this.apellidos + ", " + stringFecha + "}";
        return contenido;
    }
}
