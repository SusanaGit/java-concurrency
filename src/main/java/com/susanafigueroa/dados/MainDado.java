package com.susanafigueroa.dados;

public class MainDado {

    public static void main(String[] args) throws InterruptedException {
        // Creo los dos dados que extienden de Thread
        Dado dadoRojo = new Dado();
        Dado dadoVerde = new Dado();

        // Doy nombre a los dados
        dadoRojo.setName("Dau vermell");
        dadoVerde.setName("Dau verd");

        // Ejecuto los hilos
        dadoRojo.start();
        dadoVerde.start();

        // Compruevo que los hilos han terminado su trabajo
        dadoRojo.join();
        dadoVerde.join();

        System.out.println("Els daus han acabat la seva execució.");
    }
}
