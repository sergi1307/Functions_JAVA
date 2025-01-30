package FuncionesII;

public class Main {
    public static void main(String[] args) {

        int[] vector1;
        int opc, num;

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
                    num = Leer.leerEntero("Introduzca la longitud del vector: ");
                    vector1 = new int[num];

                    for (int i = 0; i < num; i++) {
                        vector1[i] = Leer.leerEntero("Introduzca un número a almacenar: ");
                    }

                    System.out.println("Mostrando vector:");
                    Funciones.mostrarVectorInt(vector1);
                    break;
                case 2:
                    break;
                case 3:
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