package UD03;

//Programa Java para ilustrar varias trampas de bucles.
public class P4_5_BucleInfinito{
    
    public static void main(String[] args)
    {
        // bucle infinito porque la condición no es apta
        // la condición; debería haber sido i>0.
        for (int i = 5; i != 0; i -= 2)
        {
            System.out.println(i);
        }

        int x = 5; 
        // bucle infinito porque la actualización
        // no se proporciona
        while (x == 5)
        {
            System.out.println("En el bucle");
        }
    }
}