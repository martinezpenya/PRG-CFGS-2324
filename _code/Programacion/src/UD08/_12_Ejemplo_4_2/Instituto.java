package UD08._12_Ejemplo_4_2;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<Alumno> listaAlumnos;

    public Alumno devuelvePrimerAlumno(){
        return listaAlumnos.get(0);
    }

    public void imprimirAlumno (Alumno alumno){
        System.out.println(alumno);
    }
}
