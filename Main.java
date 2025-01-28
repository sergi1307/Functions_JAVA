//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opc, num;

        do {
            System.out.println("1. Imprimir tabla de multiplicar.");
            System.out.println("2. Multiplicar dos números.");
            System.out.println("3. Comprobar Pitágoras.");
            System.out.println("4. Calcular porcentaje descuento.");
            System.out.println("5. Decir positivo negativo o cero.");
            System.out.println("6. Pasar de millas a km.");
            System.out.println("7. Salir.");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");

            switch (opc) {
                case 1:
                    num = Leer.leerEntero("Introduzca el número del que quiere ver toda la tabla de multiplicar: ");
                    tablaMul(num);
                    break;
                case 2:
                    System.out.println("Opción 2.");
                    break;
                case 3:
                    System.out.println("Opción 3.");
                    break;
                case 4:
                    System.out.println("Opción 4.");
                    break;
                case 5:
                    System.out.println("Opción 5.");
                    break;
                case 6:
                    System.out.println("Opción 6.");
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
}