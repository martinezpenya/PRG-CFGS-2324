package UD04;

public class Recursividad {

    public static void main(String[] args) {

        //factorial
        System.out.println(factorial(4));

        //busqueda binaria recursiva
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int buscaDieciocho = BusquedaBinaria(array, 0, array.length - 1, 18);
        int buscaCinco = BusquedaBinaria(array, 0, array.length - 1, 5);
        System.out.println("Busqueda del 18: " + buscaDieciocho);
        System.out.println("Busqueda del 5: " + buscaCinco);
        
        //desbordamiento de pila
        desbordamientoPila(9);
    }

    /**
     * Método recursivo que calcula el factorial
     */
    public static int factorial(int n) {
        if (n == 0) {
            //Caso base: Se sabe el resultado directamente
            System.out.println("Caso base: n es igual a 0");
            return 1;
        } else {
            //Caso recursivo: Para calcularlo hay que invocar al método recursivo
            //El valor del nuevo parámetro de entradad se ha de modificar, de
            //manera que se vaya acercando al caso base
            System.out.println("Caso recursivo " + (n - 1)
                    + ": Se invoca al factorial(" + (n - 1) + ")");
            int resultado = n * factorial(n - 1);
            System.out.println("  cuyo resultado es: " + resultado);
            return resultado;
        }
    }

    public static int BusquedaBinaria(int[] array, int inicio, int fin, int valor) {
        if (inicio > fin) {
            //Caso base: No se ha encontrado el valor
            return - 1;
        }
        //Es calcula la posició central entre els dos índexs de cerca
        int pos = inicio + (fin - inicio) / 2;
        if (array[pos] > valor) {
            //Caso recursivo: Si el valor es menor que la posición que se ha 
            //consultado, entonces hay que seguir buscando por la parte 
            //"izquierda" del array
            return BusquedaBinaria(array, inicio, pos - 1, valor);
        } else if (array[pos] < valor) {
            //Caso recursivo: Si el valor es mayor que la posición que se ha
            //consultado, entonces hay que seguir buscando por la parte 
            //"derecha" del array
            return BusquedaBinaria(array, pos + 1, fin, valor);
        } else {
            //caso base: Es igual, por tanto, se ha encontrado
            return pos;
        }
    }

    public static int desbordamientoPila(int n) {
        // condición base incorrecta (esto provoca un desbordamiento de la pila).
        if (n == 100) {
            return 1;
        } else {
            return n * desbordamientoPila(n - 1);
        }
    }
}