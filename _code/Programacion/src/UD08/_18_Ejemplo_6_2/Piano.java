package UD08._18_Ejemplo_6_2;

public class Piano extends Instrumento {

    @Override
    public void tocarNota(String nota) {
        System.out.format("Piano: tocar nota %s.\n", nota);
    }
    
    @Override
    public void estirarCuerda(){
        System.out.println("cuerda estirada");
    }
}
