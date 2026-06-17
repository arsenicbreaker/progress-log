/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_shapepolymorph.Class;

/**
 *
 * @author erina
 */
public class EriRectangle extends EriShape{
    
    private double height;
    private double width;

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    
    public EriRectangle(double left, double top, double height, double width) {
        super(left, top);
        this.height = height;
        this.width = width;
    }

    @Override
    public String printShape() {
        return super.printShape() +
                     "Height: " + this.height + "\n" +
                     "Width: " + this.width + "\n" +
                     "Area: " + this.calculateArea() + "\n";// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calculateArea() {
        return this.height * this.width; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
