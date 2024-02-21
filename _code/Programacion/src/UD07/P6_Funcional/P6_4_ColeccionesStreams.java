package UD07.P6_Funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P6_4_ColeccionesStreams {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Nacho", 52));
        personas.add(new Persona("David", 47));
        personas.add(new Persona("Pepe", 42));
        personas.add(new Persona("Maria", 22));
        personas.add(new Persona("Marta", 4));

        // FILTRADO
        System.out.println("FILTRADO");
        Stream<Persona> adultos = personas.stream().filter(p -> p.getEdad() >= 18);
        //La función lambda se podría traducir como: "Aquellas personas 'p' de la
        // colección cuya edad sea mayor o igual que 18 años".
        adultos.forEach(p -> System.out.println(p.getNombre() + " " + p.getEdad()));

        // MAPEO
        System.out.println("MAPEO");
        Stream<Integer> edades = personas.stream().map(p -> p.getEdad());
        //La función lambda hace que se añadan al stream de enteros las edades de las
        // personas 'p' de la colección personas.
        edades.forEach(e -> System.out.println(e));

        // COMBINAR
        System.out.println("COMBINAR");
        Stream<Integer> edadesAdultos = personas.stream().
                filter(p -> p.getEdad() >= 18).map(p -> p.getEdad());
        //Añadiríamos al stream solamente las edades, de aquellas personas que son mayores de edad.
        edadesAdultos.forEach(e -> System.out.println(e));

        // ORDENAR
        System.out.println("ORDENAR");
        Stream<Persona> personasOrdenadas = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .sorted((p1, p2) -> p1.getEdad() - p2.getEdad());
        //Para cada pareja de personas p1 y p2, ordénalas en función de la resta
        // de la edad de p1 menos la edad de p2 (lo que hacíamos en el compareTo)
        personasOrdenadas.forEach(p -> System.out.println(p.getNombre() + " " + p.getEdad()));

        // COLECCIÓN
        System.out.println("COLECCIÓN");
        List<Integer> edadesAdultos2 = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .map(p -> p.getEdad()).collect(Collectors.toList());
        //similar a ejemplos anteriores, pero esta vez obtenemos una lista de enteros,
        // en lugar de un stream.
        System.out.println("Lista: " + edadesAdultos2);

        String nombresAdultos = personas.stream().filter(p -> p.getEdad() >= 18)
                .map(p -> p.getNombre())
                .collect(Collectors.joining(", ","Adultos: ",""));
        //genera una lista de nombres de personas, con un prefijo, separado y sufijo.
        System.out.println("String: " + nombresAdultos);

        // FOREACH
        System.out.println("FOREACH");
        personas.stream().filter(p -> p.getEdad() >= 18)
                .map(p -> p.getNombre()).forEach(p -> System.out.println(p));

        // MEDIA
        System.out.println("MEDIA");
        double mediaAdultos = personas.stream().filter(p -> p.getEdad() >= 18)
                .mapToInt(p -> p.getEdad()).average().getAsDouble();
        System.out.println("Media adultos: " + mediaAdultos);
    }
}
