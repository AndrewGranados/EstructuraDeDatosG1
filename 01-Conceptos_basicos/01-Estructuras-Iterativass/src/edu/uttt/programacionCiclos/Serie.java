package edu.uttt.programacionCiclos;

/**
 * @author aleks
 */
public class Serie {

    private int n;

    public Serie() {
        this.n = 1;
    }

    public Serie(int n) {
        this.n = (n > 0) ? n : 1;
        /*
        if (n > 0) {
            this.n = n;
        } else {
            this.n = 1;
        }
         */
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }
}
