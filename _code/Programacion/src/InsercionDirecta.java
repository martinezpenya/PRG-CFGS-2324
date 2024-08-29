public class InsercionDirecta {

    public static void insercionDirecta(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Mover los elementos mayores que key hacia la derecha
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Insertar key en su posición correcta
            array[j + 1] = key;
        }
    }

    public static void imprimirArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Array antes de ordenar:");
        imprimirArray(array);

        insercionDirecta(array);

        System.out.println("Array después de ordenar:");
        imprimirArray(array);
    }
}