package com.susanafigueroa.maximatemperatura;

public class TemperaturaMaxima {

    int[] temperaturasMaximas = new int[750];

    // obtener listado de temperaturas entre -30 y 80
    public int[] listadoTemperaturasMaximas() {

        for ( int i = 0; i < temperaturasMaximas.length; i++ ) {
            int temperaturaAleatoria = ((int) (Math.random() * 81)) - 30;
            temperaturasMaximas[i] = temperaturaAleatoria;
        }

        return temperaturasMaximas;
    }

}
