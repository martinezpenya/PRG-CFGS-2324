package UD07.P6_Funcional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class ComparadorPersona implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2){
        return p2.getEdad() - p1.getEdad();
    }
}
public class P6_3_Lambda {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Nacho", 52));
        personas.add(new Persona("David", 47));
        personas.add(new Persona("Pepe", 42));
        personas.add(new Persona("Maria", 22));
        personas.add(new Persona("Marta", 4));

        //IMPERATIVO
        personas.sort(new ComparadorPersona());
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i).toString());
        }

        //FUNCIONAL
        personas.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i).toString());
        }
    }
}