package com.susanafigueroa.camarerococinero;

public class Pedido {

    private String plato = "";
    private int countPedido = 0;

    public Pedido(String plato) {
        this.plato = plato;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String nuevoPlato) {
        this.plato = nuevoPlato;
    }

}
