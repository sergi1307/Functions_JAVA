package FuncionesII;

public class Funciones {

    /*Función que imprima vector pasado como parámetro separados por guiones y con salto de líneas tras imprimir el
    * último vector*/
    public static void mostrarVectorInt(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                System.out.print(vector[i] + " - ");
            } else {
                System.out.print(vector[i]);
                System.out.println();
            }
        }
    }

    public static void mostrarMatrizInt(int[][] matriz) {

    }

    public static void copiar2Vectores(int[] vector1, int[] vector2) {

    }

    public static void copiarVector(int[] vector) {

    }

    public static boolean igualesVectores(int[] vector1, int[] vector2) {
        return false;
    }

    public static int[] vectorAleatorio(int tamanyo) {
        int[] vector = new int[tamanyo];
        return vector;
    }

    public static int mediaVector(int[] vector) {
        return 0;
    }

    public static boolean esMayorEdad(int edad) {
        return false;
    }

    public static int fibonacci(int num) {
        return 0;
    }

    public static void aproximaPhi(int num) {

    }

}
