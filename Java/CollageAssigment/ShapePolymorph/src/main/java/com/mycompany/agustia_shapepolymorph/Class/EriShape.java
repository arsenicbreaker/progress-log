/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_shapepolymorph.Class;

/**
 *
 * @author erina
 */
public class EriShape {
        
    private double left;
    private double top;

    /**
     * @return the left
     */
    public double getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(double left) {
        this.left = left;
    }

    /**
     * @return the top
     */
    public double getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(double top) {
        this.top = top;
    }

    public EriShape(double left, double top) {
        this.left = left;
        this.top = top;
    }
    
    public String printShape() {
        String print = "Left: " + this.left + "\n"
                       + "Top: " + this.top + "\n";
        
        return print;
    }
    
    public double calculateArea() {
        return 0.0;
    }
            
    
}
