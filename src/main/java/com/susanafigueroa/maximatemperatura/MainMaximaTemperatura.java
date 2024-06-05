package com.susanafigueroa.maximatemperatura;

public class MainMaximaTemperatura {

    public static void main(String[] args) throws InterruptedException {

        // Creo los 5 arrays, uno para cada hilo
        TemperaturaMaxima t = new TemperaturaMaxima();
        int[] arrayHilo0 = t.listadoTemperaturasMaximas();
        int[] arrayHilo1 = t.listadoTemperaturasMaximas();
        int[] arrayHilo2 = t.listadoTemperaturasMaximas();
        int[] arrayHilo3 = t.listadoTemperaturasMaximas();
        int[] arrayHilo4 = t.listadoTemperaturasMaximas();

        // Creo 5 tareas que extiende de Thread, cada uno se encargará de buscar el valor más alto de su array
        Tarea tarea0 = new Tarea(arrayHilo0);
        Tarea tarea1 = new Tarea(arrayHilo1);
        Tarea tarea2 = new Tarea(arrayHilo2);
        Tarea tarea3 = new Tarea(arrayHilo3);
        Tarea tarea4 = new Tarea(arrayHilo4);

        tarea0.setName("Hilo 0");
        tarea1.setName("Hilo 1");
        tarea2.setName("Hilo 2");
        tarea3.setName("Hilo 3");
        tarea4.setName("Hilo 4");

        // Ejecuto los hilos para que hagan su faena
        tarea0.start();
        tarea1.start();
        tarea2.start();
        tarea3.start();
        tarea4.start();

        // Me aseguro que han terminado todos
        tarea0.join();
        tarea1.join();
        tarea2.join();
        tarea3.join();
        tarea4.join();
    }
}
