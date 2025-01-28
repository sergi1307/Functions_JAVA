public class Calculos {

    /*Función para saber el descuento que tenemos ciertos productos.*/
    public static int queDescuento(double cant, double cant_desc) {
        if (cant == 0) return 0;
        return (int)(((cant - cant_desc) / cant) * 100);
    }

    public static int dimeSigno(int num1) {
        return 0;
    }

    public static double millas_a_km(int num1) {
        return 0;
    }
}
