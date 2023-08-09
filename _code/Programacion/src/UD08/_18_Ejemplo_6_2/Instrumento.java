package UD08._18_Ejemplo_6_2;

public abstract class Instrumento {

    public void tocarNota(String nota) {
        System.out.format("Instrumento: tocar nota %s.\n", nota);
    }
    
    public void estirarCuerda(){
        System.out.println("cuerda se estira al instrumento");
    }
    
    public void tocarAgudo(){
        System.out.println("instrumento toca agudo");
    }
}
