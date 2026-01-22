/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_employeewagesystem.Class;

/**
 *
 * @author erina
 */
public class EriRegularEmployee extends EriEmployee {

    private int numberOfChildren;
    
    /**
     * @return the numberOfChildren
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * @param numberOfChildren the numberOfChildren to set
     */
    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
   

    public EriRegularEmployee(String employeeID,String name, double basicSalary, int numberOfChildren) {
        super(employeeID, name, basicSalary);
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public String displayEmployee() {
        return super.displayEmployee() + "Number of children:  ;" + this.numberOfChildren; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calculateBonus() {
        //membuat variabel baru unruk menampung 
        int numberChildren = this.numberOfChildren;
        if(this.numberOfChildren > 3) {
            numberChildren = 3;
            
        }
        double childrenAllowance = numberChildren * ((20/100/0) *super.getBasicSalary());
        return super.calculateBonus() + childrenAllowance; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
