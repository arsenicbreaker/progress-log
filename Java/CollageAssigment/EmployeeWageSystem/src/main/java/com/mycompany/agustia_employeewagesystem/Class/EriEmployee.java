/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_employeewagesystem.Class;

/**
 *
 * @author erina
 */
public class EriEmployee {
    
    private String employeeID;
    private String name;
    private double basicSalary;

    /**
     * @return the employeeID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    // constructor
    public EriEmployee(String employeeID, String name, double basicSalary) {
    this.employeeID = employeeID;
    this.name = name;
    this.basicSalary = basicSalary;
    }
    
    public String displayEmployee(){
        String print = "Employee ID: " + this.employeeID + "\n" 
                + "Name: " + this.name + "\n"
                + "Salary: " + this.basicSalary + "\n" ;
                
    return print;
    }
    
    //method untuk calculatebonus
    public double calculateBonus(){
        return this.basicSalary;
    }
}
