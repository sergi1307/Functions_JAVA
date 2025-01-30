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

    /*Imprima una matriz de enteros en forma de matriz, cada fila separada por guiones.*/
    public static void mostrarMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    /*Recibirá dos vectores y copiará el primero al segundo, se debe comprobar que el vector origen
    * cabe en el de destino*/
    public static int[] copiar2Vectores(int[] vectorOrigen, int[] vectorDestino) {
        vectorDestino = new int[vectorOrigen.length];
        for (int i = 0; i < vectorDestino.length; i++) {
             vectorDestino[i] = vectorOrigen[i];
        }
        return vectorDestino;
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
