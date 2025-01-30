package FuncionesII;

public class Main {
    public static void main(String[] args) {

        int[] vector1, vector2 = new int[0];
        int[][] matriz1;
        int opc, num1, num2;

        do {
            System.out.println("1 - MostrarVectorInt");
            System.out.println("2 - MostrarMatrizInt");
            System.out.println("3 - Copiar2Vectores");
            System.out.println("4 - CopiarVector");
            System.out.println("5 - IgualesVectores");
            System.out.println("6 - vectorAleatorio");
            System.out.println("7 - MediaVector");
            System.out.println("8 - EsMayorDeEdad");
            System.out.println("9 - Fibonacci");
            System.out.println("10 - AproximaPhi");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");

            switch (opc) {
                case 1:
                    num1 = Leer.leerEntero("Introduzca la longitud del vector: ");
                    vector1 = new int[num1];

                    for (int i = 0; i < num1; i++) {
                        vector1[i] = Leer.leerEntero("Introduzca un número a almacenar: ");
                    }

                    System.out.println("Mostrando vector:");
                    Funciones.mostrarVectorInt(vector1);
                    break;
                case 2:
                    num1 = Leer.leerEntero("Introduzca las filas de la matriz: ");
                    num2 = Leer.leerEntero("Introduzca las columnas de la matriz: ");

                    matriz1 = new int[num1][num2];

                    for (int i = 0; i < num1; i++) {
                        for (int j = 0; j < num2; j++) {
                            matriz1[i][j] = Leer.leerEntero("Introduzca el número para la posición " + i + j + " : ");
                        }
                    }

                    Funciones.mostrarMatrizInt(matriz1);
                    break;
                case 3:
                    num1 = Leer.leerEntero("Introduzca la longitud del vector Origen: ");
                    vector1 = new int[num1];

                    for (int i = 0; i < num1; i++) {
                        vector1[i] = Leer.leerEntero("Introduzca el número a almacenar: ");
                    }

                    vector2 = Funciones.copiar2Vectores(vector1, vector2);

                    System.out.println("El resultado del vector copiado: ");
                    for (int i = 0; i < vector2.length; i++) {
                        System.out.print(vector2[i]);
                        if ( i < vector2.length - 1) {
                            System.out.print(" - ");
                        }
                    }
                    System.out.println();

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
            }
        } while (opc != 0);
    }
}