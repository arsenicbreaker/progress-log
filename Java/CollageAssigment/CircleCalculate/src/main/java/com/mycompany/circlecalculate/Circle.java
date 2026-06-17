/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circlecalculate;

/**
 *
 * @author erina
 */
public class Circle {
    private double radius;
    
    //getter
    public double getRadius() {
        return radius;
    }
    
    //setter
    public void setRadius(double newValue) {
        this.radius = newValue;
    }
    
    public double calculateKeliling() {
        return 2*Math.PI*this.radius;
    }
    
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }
}
