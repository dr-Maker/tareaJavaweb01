package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    public static String dato() {
        String texto = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            texto = br.readLine();

        } catch (IOException exe) {
            System.out.println(exe.getMessage());
        }
        return texto;
    }

    public static int datoInt() {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException exe) {
            return Integer.MIN_VALUE;
        }
    }
    
    public static int datoShort() {
        try {
            return Short.parseShort(dato());
        } catch (NumberFormatException exe) {
            return Short.MIN_VALUE;
        }
    }
    
    public static long datoLong() {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException exe) {
            return Long.MIN_VALUE;
        }
    }
    
    public static float datoFloat(){
         try {
            return Float.parseFloat(dato());
        } catch (NumberFormatException exe) {
            return Float.MIN_VALUE;
        }
    }
    
    public static double datoDouble(){
         try {
            return Double.parseDouble(dato());
        } catch (NumberFormatException exe) {
            return Double.MIN_VALUE;
        }
    }
}
