package tools;

import java.text.DecimalFormat;

public class Rutinas {

    public static String formatoMonto(int monto) {
        DecimalFormat salida = new DecimalFormat("###,###,###,###.##");
        return salida.format((double) monto);
    }

}
