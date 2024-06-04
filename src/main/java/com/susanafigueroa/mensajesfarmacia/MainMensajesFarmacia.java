package com.susanafigueroa.mensajesfarmacia;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainMensajesFarmacia {

    public static void main(String[] args) throws InterruptedException {

        // creo el executor para ejecutar las tareas
        ScheduledExecutorService schExService = Executors.newSingleThreadScheduledExecutor();

        // creo el objeto de tipo Tarea que implementa Runnable
        Runnable tarea = new Tarea();

        // la aparición del primer mensaje se produce de forma immediata y luego cada 5 seg
        schExService.scheduleWithFixedDelay(tarea, 0, 5, TimeUnit.SECONDS);

        // se tiene que mostrar durante 1 minuto
        schExService.awaitTermination(60, TimeUnit.SECONDS);

        // cuando hayan pasado los 60 segundos cierra el pool de ejecución
        schExService.shutdownNow();
    }
}
