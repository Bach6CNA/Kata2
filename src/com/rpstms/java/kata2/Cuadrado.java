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
public class Cuadrado extends Rectangulo {
    
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        super.setAlto(lado);
        super.setAncho(lado);
    }

    public Cuadrado(double lado,  String color, boolean rellena) {
        super(lado, lado, color, rellena);
    }

    public double getLado(){
        return super.getAlto();
    }
    
    public void setLado(double lado){
        super.setAlto(lado);
        super.setAncho(lado);
    }
    
}
