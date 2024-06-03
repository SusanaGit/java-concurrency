package com.susanafigueroa.numerosprimos;

public class Tarea implements Runnable {

    int numeroMin;
    int numMax;

    public Tarea(int numeroMin, int numMax) {
        this.numeroMin = numeroMin;
        this.numMax = numMax;
    }

    @Override
    public void run() {

        for ( int i = numeroMin; i < numMax; i++ ) {
            if ( esPrimo(i) ) {
                System.out.println(i + " es primo.");
            }
        }

    }

    private boolean esPrimo(int numero) {

        if ( numero == 1 || numero == 0 ) {
            return false;
        }

        for ( int i = 2; i < numero; i++ ) {
            if ( numero % i == 0 ) {
                return false;
            }
        }

        return true;
    }
}