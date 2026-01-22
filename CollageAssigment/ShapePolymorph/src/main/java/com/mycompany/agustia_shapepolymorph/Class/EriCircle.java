/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_shapepolymorph.Class;

/**
 *
 * @author erina
 */
public class EriCircle extends EriShape{
    
    private double diameter;

    /**
     * @return the diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    
    public EriCircle(double left, double top, double diameter) {
        super(left, top);
        this.diameter = diameter;
    }

    @Override
    public String printShape() {
        return super.printShape() +
                "Diameter: " + this.diameter + "\n" +
                "Area: " + this.calculateArea() + "\n" ;
                
        
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((diameter/2), 2); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
