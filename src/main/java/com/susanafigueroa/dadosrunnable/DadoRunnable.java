package com.susanafigueroa.dadosrunnable;

public class DadoRunnable implements Runnable {

    int numeroAleatorio = (int) (Math.random()*10);

    @Override
    public void run() {

        int numeroAleatorio = (int) (Math.random()*10);

        System.out.println("El " + Thread.currentThread().getName() + " ha obtingut el número " + numeroAleatorio + ".");

    }

}
