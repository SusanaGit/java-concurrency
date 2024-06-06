package com.susanafigueroa.camarerococinero;

public class Cocinero implements Runnable {

    private Camarero camarero;

    public Cocinero(Camarero nuevoCamarero) {
        this.camarero = nuevoCamarero;
    }

    @Override
    public void run() {

        // El cocinero tarda 4 segundos en servir un plato
        try {
            System.out.println("El cocinero está realizando la comida del pedido.");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El cocinero ya tiene lista la comida del pedido.");
        notifyAll();
    }

}
