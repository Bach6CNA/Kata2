/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpstms.java.kata2;

/**
 *
 * @author richpolis
 */
public class Figura {
    
    private String color;
    private boolean rellena;

    public Figura() {
        this.color = "rojo";
        this.rellena = true;
    }

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + ", rellena=" + rellena + '}';
    }
    
    
}
