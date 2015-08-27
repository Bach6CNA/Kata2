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
public class Rectangulo extends Figura implements Propiedades {
    
    private double ancho;
    private double alto;

    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    public Rectangulo(double ancho, double alto, String color, boolean rellena) {
        super(color, rellena);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public double getPerimetro() {
        return (this.alto * 2) + (this.ancho * 2);
    }

    @Override
    public double getArea() {
        return (this.alto * this.ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + 
                    "ancho=" + ancho + 
                    ", alto=" + alto + 
                    ", " + super.toString() +
                '}';
    }
    
    
}
