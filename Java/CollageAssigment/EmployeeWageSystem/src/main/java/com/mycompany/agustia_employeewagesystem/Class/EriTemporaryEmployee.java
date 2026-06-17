/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_employeewagesystem.Class;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author erina
 */
public class EriTemporaryEmployee extends EriEmployee {
    
    
    private LocalDate startingWorkingDate;
    private LocalDate endingWorkingDate;

    /**
     * @return the startingWorkingDate
     */
    public LocalDate getStartingWorkingDate() {
        return startingWorkingDate;
    }

    /**
     * @param startingWorkingDate the startingWorkingDate to set
     */
    public void setStartingWorkingDate(LocalDate startingWorkingDate) {
        this.startingWorkingDate = startingWorkingDate;
    }

    /**
     * @return the endingWorkingDate
     */
    public LocalDate getEndingWorkingDate() {
        return endingWorkingDate;
    }

    /**
     * @param endingWorkingDate the endingWorkingDate to set
     */
    public void setEndingWorkingDate(LocalDate endingWorkingDate) {
        this.endingWorkingDate = endingWorkingDate;
    }

    public EriTemporaryEmployee(String employeeID, 
                                String name, 
                                double basicSalary, 
                                LocalDate startingWorking, 
                                LocalDate endingWorking) {
        super(employeeID, name, basicSalary);
        this.startingWorkingDate = startingWorking;
        this.endingWorkingDate = endingWorking;
    }

    @Override
    public String displayEmployee() {
        return super.displayEmployee()
                + "Starting working date: " + this.startingWorkingDate + "\n"
                + "Ending working date: " + this.endingWorkingDate + "\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calculateBonus() {
        int numberOfAttendance = (int) ChronoUnit.DAYS.between(startingWorkingDate, endingWorkingDate);
        double attendanceBonus = numberOfAttendance * (0.1 * super.getBasicSalary());
        return (10/100.0 * super.calculateBonus()) + attendanceBonus; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
