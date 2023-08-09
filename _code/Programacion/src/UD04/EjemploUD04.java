package UD04;

import java.util.Scanner;

public class EjemploUD04 {

    public static void main(String[] args) {
        //declaración
        double lluvia1[]; // lluvia1 es un array de double
        double[] lluvia2;  // lluvia2 es un array de double

        //instanciación
        lluvia1 = new double[31];

        //declaración + instanciación
        double lluvia3[] = new double[31];

        // usamos un array para almacenar las edades de un grupo de personas
        // la variable numPersonas contiene el número de personas del grupo
        // y se asigna en tiempo de ejecución
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce cuantos elementos debe tener el array edad[]:");
        int numPersonas = teclado.nextInt();
        int edad[] = new int[numPersonas];

        //acceso a componentes
        System.out.print("Introduce el dato para el componente 0: ");
        edad[0] = teclado.nextInt();
        System.out.println("El componente [0] vale " + edad[0]);
        edad[1] = edad[0] + 1;
        edad[2] = edad[0] + edad[1];
        edad[2]++;
        System.out.println("El componente [1] vale " + edad[1]);
        System.out.println("El componente [2] vale " + edad[2]);

        //el índice también admite calculos/variables:
        int i = 3;
        edad[i] = edad[i + 1];
        edad[i + 2] = edad[i];

        //Inicialización
        int edad2[] = new int[10];
        edad2[0] = 25;
        edad2[1] = 10;
        edad2[9] = 12;
        //...

        int edad3[] = {25, 10, 23, 34, 65, 23, 1, 67, 54, 12};

        //Ejemplo práctico
        System.out.println(nombreMes(3)); //marzo

        //Paso de arrays como parámetros:
        int a = 1;
        int v[] = {1, 1, 1};
        metodo(v, a); //Pasar un array como parámetro
        System.out.println(a); // Muesta 1
        System.out.println(v[0]); // Muestra 2

        //atributo lenght
        double estatura[] = new double[25];
        System.out.println(estatura.length); // Mostrará por pantalla: 25

        //Array args[] del método main contiene los parámetros de entrada
        System.out.println(args[0]);//parámetro 1 de la línea de comandos
        System.out.println(args[1]);//parámetro 2 de la línea de comandos

        //busquedas y recorridos de arrays
        double pluviosidad[] = {5, 4, 0, 0, 0, 10, 0, 0, 0, 0, 2, 2, 3, 4, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 6, 0, 0};

        //recorrido ascendente
        System.out.println(pluviosidadMediaAscendente(pluviosidad)); //1.3
        //recorrido descendente
        System.out.println(pluviosidadMediaDescendente(pluviosidad)); //1.3
        //recorrido para máximo
        System.out.println(pluviosidadMaxima(pluviosidad)); //10.0
        //busqueda con while y boolean
        System.out.println(primerDiaSinLluvia1(pluviosidad)); //2
        //busqueda con while sin boolean
        System.out.println(primerDiaSinLluvia2(pluviosidad)); //2
        //busqueda con for
        System.out.println(primerDiaSinLluvia3(pluviosidad)); //2
        //busqueda descendente
        System.out.println(ultimoDiaSinLluvia(pluviosidad)); //31

        //busqueda en arrays ordenados (busqueda binaria)
        int buscarEdad[] = {15, 22, 33, 36, 41, 56, 71, 92};
        System.out.println(hayAlguienDe36(buscarEdad)); //true

        //ordenar arrays
        int desordenado[] = {62, 4, 25, 27, 32, 1, 80, 43, 22};
        seleccionDirecta(desordenado);
        //con el siguiente bucle recorremos el array ascendentemente y al
        //imprimirlo resulta en: 1 4 22 25 27 32 43 62 80
        for (int j = 0; j <= desordenado.length - 1; j++) {
            System.out.print(desordenado[j] + " ");
        }

        //arrays bidimensionales
        double m1[][] = new double[5][4];

        //con el mismo número de columnas
        double m2[][] = new double[5][];
        m2[0] = new double[4];
        m2[1] = new double[4];
        m2[2] = new double[4];
        m2[3] = new double[4];
        m2[4] = new double[4];

        //diferentes números de columnas
        double m3[][] = new double[5][];
        m3[0] = new double[3];
        m3[1] = new double[4];
        m3[2] = new double[14];
        m3[3] = new double[10];
        m3[4] = new double[9];

        int m4[][] = {
            {7, 2, 4},
            {8, 2, 5},
            {9, 4, 3},
            {1, 2, 4}
        };

        //recorrido por filas
        System.out.println("\nRecorrido por filas: ");
        for (int r = 0; r < m4.length; r++) {
            for (int s = 0; s < m4[r].length; s++) {
                System.out.print(m4[r][s] + " ");
            }
            System.out.println("");
        }
        //Recorrido por filas:
        //7 2 4 
        //8 2 5 
        //9 4 3 
        //1 2 4 

        System.out.println("\nRecorrido por columnas: ");
        int numFilas = m4.length;
        int numColumnas = m4[0].length;
        for (int j = 0; j < numColumnas; j++) {
            for (int k = 0; k < numFilas; k++) {
                System.out.print(m4[k][j] + " ");
            }
            System.out.println("");
        }
        //Recorrido por columnas: 
        //7 8 9 1 
        //2 2 4 2 
        //4 5 3 4         

        System.out.println("\nRecorrido por columnas versión 2: ");
        for (int j = 0; j < m4[0].length; j++) {
            for (int k = 0; k < m4.length; k++) {
                System.out.print(m4[k][j] + " ");
            }
            System.out.println("");
        }
        //Recorrido por columnas versión 2: 
        //7 8 9 1 
        //2 2 4 2 
        //4 5 3 4
        
        //arrays multidimensionales:
        int notas[][][] = new int[10][5][3]; //Notas de 10 alum. en 5 asign. en 3 eval.
        double w[][][][][] = new double [2][7][10][4][10];
    }

    public static String nombreMes(int mes) {
        String nombre[] = {" ", "enero", "febrero", "marzo", "abril",
            "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
            "noviembre", "diciembre"};
        return nombre[mes];
    }

    public static void metodo(int x[], int y) { //recibir un array como parámetro
        x[0]++;
        y++;
    }

    //recorremos ascendentemente el array para obtener la media
    public static double pluviosidadMediaAscendente(double lluvia[]) {
        double suma = 0;
        //Recorremos el array
        for (int i = 0; i < lluvia.length; i++) {
            suma += lluvia[i];
        }
        double media = suma / lluvia.length;
        return media;
    }

    //recorremos descendentemente el array para obtener la media
    public static double pluviosidadMediaDescendente(double lluvia[]) {
        double suma = 0;
        //Recorremos el array
        for (int i = lluvia.length - 1; i >= 0; i--) {
            suma += lluvia[i];
        }
        double media = suma / lluvia.length;
        return media;
    }

    //recorremos el array para encontrar el dia con más pluviosidad
    public static double pluviosidadMaxima(double lluvia[]) {
        // Suponemos el la pluviosidad máxima se produjo el primer día
        double max = lluvia[0];
        //Recorremos el array desde la posición 1, comprobando si hay una pluviosidad mayor
        for (int i = 1; i < lluvia.length; i++) {
            if (lluvia[i] > max) {
                max = lluvia[i];
            }
        }
        return max;
    }
    //Devolveremos el subíndice del primer componente del array cuyo valor es cero.
// Si no hay ningún día sin lluvias devolveremos -1

    public static int primerDiaSinLluvia1(double lluvia[]) {
        int i = 0;
        boolean encontrado = false;
        while (i < lluvia.length && !encontrado) {
            if (lluvia[i] == 0) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            return i;
        } else {
            return -1;
        }
    }

    public static int primerDiaSinLluvia2(double lluvia[]) {
        int i = 0;
        while (i < lluvia.length && lluvia[i] != 0) {
            i++;
        }
        if (i == lluvia.length) {
            return -1;
        } else {
            return i;
        }
    }

    public static int primerDiaSinLluvia3(double lluvia[]) {
        int i;
        for (i = 0; i < lluvia.length && lluvia[i] != 0; i++) /*Nada*/ ;
        if (i == lluvia.length) {
            return -1;
        } else {
            return i;
        }
    }

    public static int ultimoDiaSinLluvia(double lluvia[]) {
        int i = lluvia.length - 1;
        boolean encontrado = false;
        while (i >= 0 && !encontrado) {
            if (lluvia[i] == 0) {
                encontrado = true;
            } else {
                i--;
            }
        }
        if (encontrado) {
            return i;
        } else {
            return -1;
        }
    }

    public static boolean hayAlguienDe36(int edad[]) {
        // Las variables izq y der marcarán el fragmento del array en el que
        // realizamos la búsqueda. Inicialmente buscamos en todo el array.
        int izq = 0;
        int der = edad.length - 1;
        boolean encontrado = false;
        while (izq <= der && !encontrado) {
            // Calculamos posición central del fragmento en el que buscamos
            int m = (izq + der) / 2;
            if (edad[m] == 36) // Hemos encontrado una persona de 36
            {
                encontrado = true;
            } else if (edad[m] > 36) {
                // El elemento central tiene más de 36.
                // Continuamos la búsqueda en la mitad izquierda. Es decir,
                // entre las posiciónes izq y m-1
                der = m - 1;
            } else {
                // El elemento central tiene menos de 36.
                //Continuamos la búsqueda en la mitad derecha. Es decir,
                // entre las posiciones m+1 y der
                izq = m + 1;
            } // del if
        } // del while
        return encontrado; // if (encontrado) return true; else return false;
    }

    public static void seleccionDirecta(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            //Localizamos elemento que tiene que ir en la posición i
            int posMin = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[posMin]) {
                    posMin = j;
                }
            }
            //Intercambiamos los elementos de las posiciones i y posMin
            int aux = v[posMin];
            v[posMin] = v[i];
            v[i] = aux;
        }
    }
}
