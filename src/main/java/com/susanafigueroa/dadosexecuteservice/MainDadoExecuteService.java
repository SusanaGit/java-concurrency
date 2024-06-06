package com.susanafigueroa.dadosexecuteservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDadoExecuteService {

    public static void main(String[] args) {

        // Creo las tareas que implementan Runnable
        DadoExecuteService dadoRojo = new DadoExecuteService();
        DadoExecuteService dadoVerde = new DadoExecuteService();

        // Creo el ExecutorService para gestionar los hilos que realizarán las tareas
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Ejecuto las tareas
        executor.execute(dadoRojo);
        executor.execute(dadoVerde);

        // cierro el executor cuando los hilos hayan terminado las tareas
        executor.shutdown();

        System.out.println("Los hilos han terminado las tareas.");

    }

}
