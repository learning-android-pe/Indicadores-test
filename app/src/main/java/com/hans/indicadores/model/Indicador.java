package com.hans.indicadores.model;

/**
 * Created by Felipe (04-11-2016).
 */

public class Indicador {

    private String nombre;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
