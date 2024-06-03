package com.susanafigueroa.findmultiples;

import java.util.concurrent.Callable;

public class Tarea implements Callable<Boolean> {

    int divisor;
    int numero;

    public Tarea(int divisor, int numero) {
        this.divisor = divisor;
        this.numero = numero;
    }

    @Override
    public Boolean call() throws Exception {

        boolean divisible = false;

        if (this.numero % this.divisor == 0) {
            divisible = true;
        }

        return divisible;
    }
}
