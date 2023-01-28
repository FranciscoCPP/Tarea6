package principal.tarea6;

import java.text.DecimalFormat;

public class Tarea6 {


    public static void main(String[] args) {

        System.out.println("El IVA de 1000 es el 19% =" + calcularIva(1000,19));


    }

    public static double calcularIva(int valorSinIva, double porcentajeIva){
        return valorSinIva * (porcentajeIva/100);
    }

}
