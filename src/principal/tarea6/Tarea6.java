package principal.tarea6;

import java.text.DecimalFormat;

public class Tarea6 {


    public static void main(String[] args) {

        double valor = 1000;
        int iva = 19;
        System.out.println("El IVA de " + valor +" es el "+iva+"%, por lo tanto el precio es de =" + calcularIva(valor,iva));


    }

    public static double calcularIva(double valorSinIva, double porcentajeIva){
        return (valorSinIva * (porcentajeIva/100)) + valorSinIva;
    }

}
