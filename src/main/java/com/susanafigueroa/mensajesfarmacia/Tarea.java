package com.susanafigueroa.mensajesfarmacia;

public class Tarea implements Runnable {

    private String[] mensajes = {
            "Hidrátate bien",
            "Bebe dos litros de agua al día",
            "Camina 5km cada dia",
            "Haz deporte diariamente",
            "Come 5 piezas de fruta al día"
    };

    @Override
    public void run() {

        int numeroAleatorio = (int) (Math.random() * mensajes.length);
        System.out.println(mensajes[numeroAleatorio]);

    }
}
