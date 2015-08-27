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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        circulo.setRadio(Double.parseDouble("15"));
        
        System.out.println(circulo.toString());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(6);
        rectangulo.setAncho(12);
        
        System.out.println(rectangulo.toString());
        System.out.println(rectangulo.getArea());
        System.out.println(rectangulo.getPerimetro());
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(6);
        
        System.out.println(cuadrado.toString());
        System.out.println(cuadrado.getArea());
        System.out.println(cuadrado.getPerimetro());
        
        
    }
    
}
