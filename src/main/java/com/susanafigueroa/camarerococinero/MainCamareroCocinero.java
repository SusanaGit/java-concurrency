package com.susanafigueroa.camarerococinero;

public class MainCamareroCocinero {

    public static void main(String[] args) throws InterruptedException {

        // Creación de un pedido
        Pedido pedido1 = new Pedido("Espaguetis con tomate.");

        // Creamos el camarero que implementa Runnable
        Runnable camarero = new Camarero(pedido1);

        // Creamos el cocinero que implementa Runnable
        Runnable cocinero = new Cocinero((Camarero) camarero);

        // Creo los hilos que realizarán las tareas camarero y cocinero
        Thread hiloCamarero = new Thread(camarero);
        Thread hiloCocinero = new Thread(cocinero);

        // Cambio los nombres de los hilos
        hiloCamarero.setName("Hilo camarero");
        hiloCocinero.setName("Hilo cocinero");

        // Ejecuto los hilos
        hiloCamarero.start();
        hiloCamarero.start();

        // Espero a que los hilos hayan terminado las faenas
        hiloCamarero.join();
        hiloCamarero.join();

        System.out.println("Los hilos han terminado su faena.");
    }
}
