/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustiaerianilistofcircle;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author erina
 */
public class Circle {
   
    private int id;
    private double radius;
    private String color;
    
    private ArrayList<Circle> listOfCircle = new ArrayList<>(); //menyimpan data bisa dinamis
    
     public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) throws Exception {
        
        //dikasih pengecakan bilangan tidak boleh dibawah 0/ negatif
        if(id < 0) {
            throw new Exception("ID tidak boleh negatif");
        }
        this.id = id;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) throws Exception {
        //pengecakan gaboleh negatif
        if (radius < 0) {
            throw new Exception("Radius tidak boleh negatif");
        }
        this.radius = radius;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    //constructor
    public Circle() {
        this.id = 0;
        this.radius = 0;
        this.color = "";
    }
    
    //membuat contructor yang menerima sebuah inputan
    public Circle(int id, double radius, String color) throws Exception {
        if(id < 0) {
            throw new Exception("ID tidak boleh negatif");
        }
        if (radius < 0) {
            throw new Exception("Radius tidak boleh negatif");
        }
        
        this.id = id;
        this.radius = radius;
        this.color = color;
    }
    
    //function
    public void addCircle(Circle circle) throws Exception {
        
        int id = 0;
        if(listOfCircle.isEmpty()) {
            id = 1; 
        }else{
            id = listOfCircle.size() + 1;
        }
        
        circle.setId(id);
        
        listOfCircle.add(circle);
    }
    
    //function
    public void updateCircle(Circle circle, int id) {
        //menginisialisasi karena index belum tentu keluar
        int index = -1;
        
        for(int i=0;i<listOfCircle.size();i++) {
            if(listOfCircle.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        
        listOfCircle.set(index, circle);
        
    }
    
    //menampilkan data nya
    public String showDataCircle() {
        String print = "";
        
        for(int i=0;i<listOfCircle.size();i++) {
            print +="Circle ke-" +(i+1)+"\n"
                    + "ID : " + listOfCircle.get(i).getId() + "\n"
                    + "Radius: " + listOfCircle.get(i).getRadius() + "\n"
                    + "Color: " + listOfCircle.get(i).getColor() + "\n"
                    + "Luas: " + listOfCircle.get(i).getArea() + "\n"
                    + "Keliling: " + listOfCircle.get(i).getKeliling() + "\n" 
                    + "=================================";
        }
    return print;
    }
    
    //fuction menghitung luas
    public double getArea() {
        return Math.PI*Math.pow(this.getRadius(), 2);
    }
    
    //function menghitung keliling
    public double getKeliling() {
        return 2*Math.PI*this.getRadius();
    }
    
    //function resize berdasarkan scale
    public void resizeCircle(double scale) throws Exception {
        this.setRadius(this.getRadius() * scale);
    }
    
}
