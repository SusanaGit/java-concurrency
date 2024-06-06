package com.susanafigueroa.dadosrunnable;

public class MainDadoRunnable {

    public static void main(String[] args) throws InterruptedException {

        // Creo los dados que implementan Runnable
        DadoRunnable dadoRojo = new DadoRunnable();
        DadoRunnable dadoVerde = new DadoRunnable();

        // Creo los hilos que ejecutarán las tareas dadoRojo y dadoVerde
        Thread hiloDadoRojo = new Thread(dadoRojo);
        Thread hiloDadoVerde = new Thread(dadoVerde);

        // Modifico los nombres de los hilos
        hiloDadoRojo.setName("Hilo dadoRojo");
        hiloDadoVerde.setName("Hilo dadoVerde");

        // Ejecuto los hilos para que hagan las tareas
        hiloDadoRojo.start();
        hiloDadoVerde.start();

        // Espero a que los hilos terminen las tareas
        hiloDadoRojo.join();
        hiloDadoVerde.join();

        System.out.println("Los hilos han terminado su trabajo.");

    }

}
