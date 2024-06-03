package com.susanafigueroa.numerosprimos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainNumerosPrimos {

    public static void main(String[] args) {

        // creo tantas tareas como el número que me dan, por ejemplo el número 4
        int numero = 4;

        // creo el executor
        ExecutorService executor = Executors.newFixedThreadPool(numero);

        for ( int i = 0; i < numero; i++ ) {
            Tarea tarea = new Tarea(i*1000,i*1000+1000);
            executor.execute(tarea);
        }
        executor.shutdown();
    }
}