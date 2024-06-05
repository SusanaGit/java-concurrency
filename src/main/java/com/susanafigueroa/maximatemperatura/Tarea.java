package com.susanafigueroa.maximatemperatura;

public class Tarea extends Thread {

    int[] listadoTemperaturas;
    public Tarea(int[] listadoTemperaturas) {
        this.listadoTemperaturas = listadoTemperaturas;
    }

    @Override
    public void run() {
        int numeroMayor = -30;
        for ( int i = 0; i < listadoTemperaturas.length; i++ ) {
            if ( listadoTemperaturas[i] > numeroMayor ) {
                numeroMayor = listadoTemperaturas[i];
            }
        }
        System.out.println(Thread.currentThread().getName() + ": El número mayor es el: " + numeroMayor);
    }
}
