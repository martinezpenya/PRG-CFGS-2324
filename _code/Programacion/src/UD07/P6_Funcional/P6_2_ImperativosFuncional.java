package UD07.P6_Funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Persona{

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String toString(){
        return nombre + " " + edad;
    }
}

public class P6_2_ImperativosFuncional {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Nacho", 52));
        personas.add(new Persona("David", 47));
        personas.add(new Persona("Pepe", 42));
        personas.add(new Persona("Maria", 22));
        personas.add(new Persona("Marta", 4));

        //IMPERATIVO
        List<Persona> adultosImperativo = new ArrayList<>();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getEdad() >= 18)
                adultosImperativo.add(personas.get(i));
        }
        for (Persona p : adultosImperativo) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }

        //FUNCIONAL
        List<Persona> adultosDeclarativo = personas.stream().filter(p -> p.getEdad() >= 18).collect(Collectors.toList());
        for (Persona p : adultosDeclarativo) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }
    }
}