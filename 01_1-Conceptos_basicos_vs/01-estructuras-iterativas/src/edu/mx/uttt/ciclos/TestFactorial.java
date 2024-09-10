package edu.mx.uttt.ciclos;

import javax.swing.JOptionPane;

public class TestFactorial {
    public static void main(String[] args) {
        String resultado = "";

        Factorial facto1 = new Factorial();
        Factorial facto2 = new Factorial(5);

        resultado = "EL resultado es:" +
                "\nEl valor de n es: " + facto1.getN() +
                "\nEl resultado del factorial utilizando el for: " + facto1.calcularFor() +
                "\nEl resultado del factorial reverse utilizando el for: " + facto1.calcularForReverse() +
                "\nEl resultado del factorial utilizando el while: " + facto1.calcularWhile() +
                "\nEl resultado del factorial utilizando el do-while: " + facto1.calcularDoWhile() +
                "\nResultado con formato: " + facto1.toString() + " = " + facto1.calcularFor();

        JOptionPane.showMessageDialog(null, resultado);
    }
}
