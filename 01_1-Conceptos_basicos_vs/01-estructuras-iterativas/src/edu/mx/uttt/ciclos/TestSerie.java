package edu.mx.uttt.ciclos;

import javax.swing.JOptionPane;

public class TestSerie {
    public static void main(String[] args) {
        /*
         * double x = 0.0;
         * int y = 1;
         * int z = 2;
         * x = (double)y / z;
         * System.out.println(x);
         * 
         * double r = 0.0;
         * int n = 2;
         * 
         * for(int i = 1; i<=n; i++){
         * r+=i/i;
         * System.out.println(r);
         * }
         */

        String resultado = "";

        Serie serie1 = new Serie();
        Serie serie2 = new Serie(3);

        resultado = "EL resultado es:" +
                "\nEl valor de n es: " + serie1.getN() +
                "\nEl resultado de la serie utilizando el for: " + serie1.calcularFor() +
                "\nEl resultado de la serie utilizando el while: " + serie1.calcularWhile() +
                "\nEl resultado de la serie utilizando el do-while: " + serie1.caluclarDoWhile() +
                "\nResultado con formato: " + serie1.toString() + " = " + serie1.calcularFor();

        JOptionPane.showMessageDialog(null, resultado);

        /*
         * int n = serie1.getN();
         * 
         * System.out.println("El valor de n es: " + n);
         * System.out.println(serie1);
         * 
         * System.out.println("El valor de n es: " + serie2.getN());
         * System.out.println(serie2);
         * 
         * serie1.setN(-4);
         * System.out.println("El valor de n es: " + serie1.getN());
         * 
         * serie2.setN(10);
         * System.out.println("El valor de n es: " + serie2.getN());
         */
    }
}
