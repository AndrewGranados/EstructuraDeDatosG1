package edu.uttt.programacionCiclos.edu.uttt.conceptosBasicos;

public class Operaciones {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    //Metodo iterativo
    public void imprimir() {
        int i = 0;
        do {
            System.out.println("Hola Mundo");
            i++;
        } while (i < this.n);
    }

    //Metodo recursivo
    public void imprimir(int n) {
        //Caso base
        if (n == 1) {
            System.out.println("Hola Mundo");
        } else {
            //Caso general
            System.out.println("Hola Mundo");
            imprimir(n - 1);
        }
    }

}
