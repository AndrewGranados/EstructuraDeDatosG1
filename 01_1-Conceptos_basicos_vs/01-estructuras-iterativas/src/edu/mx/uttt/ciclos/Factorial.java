package edu.mx.uttt.ciclos;

public class Factorial {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Factorial() {
        this.n = 1;
    }

    public Factorial(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public long calcularFor() {
        long fact = 1;
        for (int i = 1; i <= this.n; i++) {
            fact *= i;
        }

        return fact;
    }

    public long calcularForReverse() {
        long fact = 1;
        for (int i = this.n; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public long calcularWhile() {
        long fact = 1;
        int i = 1;
        while (i <= this.n) {
            fact *= i;
            i++;
        }

        return fact;
    }

    public long calcularDoWhile() {
        long fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= this.n);

        return fact;
    }

    @Override
    public String toString(){
        return "Factorial [n = " + n + "]";
    }
}
