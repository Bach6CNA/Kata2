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
public class Circulo extends Figura implements Propiedades{
    
    private double radio;

    public Circulo() {
        this.radio = 1.0;
    }

    public Circulo(String color, boolean rellena) {
        super(color, rellena);
        this.radio = 1.0;
    }

    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    @Override
    public double getPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + 
                "radio=" + radio +
                ", " + super.toString() +
                '}';
    }
    
    
    
}
