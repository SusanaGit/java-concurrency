package com.susanafigueroa.camarerococinero;

public class Camarero implements Runnable {

    private Pedido pedido;

    public Camarero(Pedido nuevoPedido) {
        this.pedido = nuevoPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {

        // El camarero tarda 5 segundos en recibir un pedido
        try {
            System.out.println("El camarero está esperando recibir un pedido.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El camarero ha recibido el pedido.");

        // El camarero tiene el pedido, lo comunica a los demás hilos
        notifyAll();
        System.out.println("El camarero ha comunicado a los demás hilos que tiene un pedido.");
    }

}
