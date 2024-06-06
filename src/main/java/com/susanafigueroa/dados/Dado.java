package com.susanafigueroa.dados;

public class Dado extends Thread {

    @Override
    public void run() {

        int numeroAleatorio = (int) (Math.random()*10);

        System.out.println("El " + Thread.currentThread().getName() + " ha obtingut el número " + numeroAleatorio + ".");

    }

}
