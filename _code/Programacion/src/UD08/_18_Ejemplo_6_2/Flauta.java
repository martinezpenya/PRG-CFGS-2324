package UD08._18_Ejemplo_6_2;

public class Flauta extends Instrumento {

    @Override
    public void tocarNota(String nota) {
        System.out.format("Flauta: tocar nota %s.\n", nota);
    }
    
    @Override
    public void tocarAgudo(){
        System.out.println("agudo");
    }
}
