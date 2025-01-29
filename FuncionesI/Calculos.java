package FuncionesI;

public class Calculos {

    /*Función para saber el descuento que tenemos ciertos productos.*/
    public static int queDescuento(double cant, double cant_desc) {
        if (cant == 0) return 0;
        return (int)(((cant - cant_desc) / cant) * 100);
    }

    /*Función para saber si el número pasado es positivo, negativo o cero*/
    public static int dimeSigno(int num1) {
        if (num1 < 0) {
            return -1;
        } else if (num1 > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static double millas_a_km(int num1) {
        return num1 * 1.60934;
    }
}
