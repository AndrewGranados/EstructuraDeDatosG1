package edu.mx.uttt.ciclos;

public class TestSerie {
    public static void main(String[] args) {
        /* 
        double x = 0.0;
        int y = 1;
        int z = 2;
        x = (double)y / z;
        System.out.println(x);
        */

        double r = 0.0;
        int n = 2;

        for(int i = 1; i<=n; i++){
            r+=i/i;
            System.out.println(r);
        }

    }
}
