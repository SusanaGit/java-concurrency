package com.susanafigueroa.findmultiples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainFindMultiples {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // creación listas de tareas vacías
        ArrayList<Tarea> listadoTareasDivisibleDos = new ArrayList<>();
        ArrayList<Tarea> listadoTareasDivisibleTres = new ArrayList<>();

        // creo 200 objetos de tipo Tarea y lo añado a los arrays que tocan
        for ( int i = 0; i < 100; i++ ) {
            Tarea tareaDos = new Tarea(2, i);
            listadoTareasDivisibleDos.add(tareaDos);

            Tarea tareaTres = new Tarea(3, i);
            listadoTareasDivisibleTres.add(tareaTres);
        }

        // creo el executor con los hilos para que ejecuten las tareas
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // ejecuto las tareas de cada listado de tareas
        List<Future<Boolean>> resultadoTareasEjecutadasDos = executor.invokeAll(listadoTareasDivisibleDos);
        List<Future<Boolean>> resultadoTareasEjecutadasTres = executor.invokeAll(listadoTareasDivisibleTres);

        // cierro el executor
        executor.shutdown();

        // compruebo los valores
        for ( int i = 0; i < 100; i++ ) {
            if ( resultadoTareasEjecutadasDos.get(i).get() && resultadoTareasEjecutadasTres.get(i).get() ) {
                System.out.println("El " + i + " es divisible de 2 y de 3.");
            }
        }
    }
}