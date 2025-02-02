package FuncionesI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opc, num1, num2, num3, resultado;
        double cant, cantDesc;

        do {
            System.out.println("1. Imprimir tabla de multiplicar.");
            System.out.println("2. Multiplicar dos números.");
            System.out.println("3. Comprobar Pitágoras.");
            System.out.println("4. Calcular porcentaje descuento.");
            System.out.println("5. Decir positivo negativo o cero.");
            System.out.println("6. Pasar de millas a km.");
            System.out.println("7. Salir.");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");
            System.out.println();

            switch (opc) {
                case 1:
                    num1 = Leer.leerEntero("Introduzca el número del que quiere ver toda la tabla de multiplicar: ");
                    tablaMul(num1);
                    System.out.println();
                    break;
                case 2:
                    num1 = Leer.leerEntero("Introduzca el primer número a multiplicar: ");
                    num2 = Leer.leerEntero("Introduzca el segundo número a multiplicar: ");
                    resultado = multiplica(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado + ".");
                    System.out.println();
                    break;
                case 3:
                    num1 = Leer.leerEntero("Introduzca el número x para comprobar: ");
                    num2 = Leer.leerEntero("Introduzca el número y para comprobar: ");
                    num3 = Leer.leerEntero("Introduzca el número z para comprobar: ");
                    if (esPitagoras(num1, num2, num3)) {
                        System.out.println("Si que es Pitágoras.");
                    } else System.out.println("No es Pitágoras.");
                    System.out.println();
                    break;
                case 4:
                    cant = Leer.leerDouble("Introduzca la cantidad sin el descuento: ");
                    cantDesc = Leer.leerEntero("Introduzca la cantidad con el descuento: ");
                    System.out.println("El % de descuento es: " + Calculos.queDescuento(cant, cantDesc) + "%.");
                    System.out.println();
                    break;
                case 5:
                    num1 = Leer.leerEntero("Introduzca un número entero: ");
                    if (Calculos.dimeSigno(num1) == 1) {
                        System.out.println("Positivo");
                    } else if (Calculos.dimeSigno(num1) == -1) {
                        System.out.println("Negativo");
                    } else {
                        System.out.println("Cero");
                    }
                    System.out.println();
                    break;
                case 6:
                    num1 = Leer.leerEntero("Introduzca los km en número entero: ");
                    System.out.println("Los millas " + num1 + " en km son: " + Calculos.millas_a_km(num1));
                    System.out.println();
                case 7:
                    System.out.println("Nos vemos en la próxima.");
                default:
                    System.out.println("Número introducido no válido.");
            }

        } while (opc != 7);
    }

    /*Función para sacar la tabla de multiplicar a partir de un número dado en el main por un usuario.*/
    public static void tablaMul(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i  + " = " + num * i + ".");
        }
    }

    /*Función para multiplicar dos números dados por el usuario*/
    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    /*Función para comprobar si los 3 números dados por el usuario cumplen la ley de Pitágoras o no*/
    public static boolean esPitagoras(int num1, int num2, int num3) {
        return (num1 * num1) + (num2 * num2) == (num3 * num3);
    }
}