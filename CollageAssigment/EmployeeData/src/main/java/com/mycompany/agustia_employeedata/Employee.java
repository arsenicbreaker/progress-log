/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_employeedata;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author erina
 */
public class Employee {
    
    private boolean gender;
    private String nama;
    private int anak;
    private int id;
    private double sallary;
    private Date starting;
    private double Allowance;
    private double Incentive;
    private double total;

    
    private ArrayList<Employee> listOfEmployee = new ArrayList<>(); 

    /**
     * @return the gender
     */
    public String isGender() {
        return gender == true ? "Pria" : "Wanita";
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the anak
     */
    public int getAnak() {
        return anak;
    }

    /**
     * @param anak the anak to set
     */
    public void setAnak(int anak) throws Exception {
        if(anak<0) {
            throw new Exception ("Jumlah anak tidak boleh negatif");
        }
        this.anak = anak;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) throws Exception {
        if(id<0) {
            throw new Exception ("ID tidak boleh negatif");
        }
        this.id = id;
    }

    /**
     * @return the sallary
     */
    public double getSallary() {
        return sallary;
    }

    /**
     * @param sallary the sallary to set
     */
    public void setSallary(double sallary) throws Exception {
        if(sallary<0) {
            throw new Exception ("Sallary tidak boleh negatif");
        }
        this.sallary = sallary;
    }

    /**
     * @return the starting
     */
    public Date getStarting() {
        return starting;
    }

    /**
     * @param starting the starting to set
     */
    public void setStarting(Date starting) {
        this.starting = starting;
    }
    
    public void setAllowance(double Allowance) {
        this.Allowance = Allowance;
    }
    
     public double getAllowance() {
        double tunjangan = anak * 0.1 * sallary;
        return tunjangan;
    }
     
     public double getIncentive() {
        double incentive = 0;
        LocalDate targetLocalDate = starting.toInstant()
                                              .atZone(ZoneId.systemDefault())
                                              .toLocalDate();
        
        LocalDate today = LocalDate.now();
        
        double daysBetween = ChronoUnit.DAYS.between(targetLocalDate,today);
        
        if (daysBetween >= 365) {
            incentive = 0.2 * total;
        }
        
        return incentive;
    }
     
     
     public void setIncentive(double Incentive) {
        this.Incentive = Incentive;
    }
     
     
     //constructor
    public Employee() {
        this.nama = "";
        this.anak = 0;
        this.id = 0;
        this.sallary = 0;
        LocalDate localDate = LocalDate.now();
        this.starting = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.Allowance = 0;
        this.Incentive = 0;
    }
    
    
    public Employee(boolean gender, int anak, String nama, int id, double sallary, Date starting, double totalPenjualanTerakhir) throws Exception {
        if (anak <0) {
            throw new Exception("Anak tidak boleh bernilai negatif");
        }
        if (sallary <0) {
            throw new Exception("Sallary tidak boleh negatif");
        }
        
        this.nama = nama;
        this.anak = anak;
        this.id = id;
        this.sallary = sallary;
        this.starting = starting;
        this.gender = gender;
        this.total = totalPenjualanTerakhir;
    }
    
    //add employee
    public void addEmployee (Employee employee) throws Exception {
        int id = 0;
        if(listOfEmployee.isEmpty()) {
            id =1;
        } else {
            id = listOfEmployee.size() + 1;
        }
        
        employee.setId(id);
        listOfEmployee.add(employee);
    }
    
    //update employee
    public void updateEmployee(Employee employee, int id) {
        int index = -1;
        for(int i=0;i<listOfEmployee.size();i++) {
            if(listOfEmployee.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        listOfEmployee.set(index,employee);
    }
    
    //menampilkan data
    public String showDataEmployee() {
        String print = "";
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        for(int i=0;i<listOfEmployee.size();i++) {
            print += "Employee ke-" + (i+1) + "\n"
                    + "Nama Employee : " + listOfEmployee.get(i).getNama() + "\n"
                    + "Gender Employee : " + listOfEmployee.get(i).isGender() + "\n"
                    + "Starting Date: " + listOfEmployee.get(i).getStarting() + "\n"
                    + "Jumlah Anak: " + listOfEmployee.get(i).getAnak() + "\n" 
                    + "Sallary: " + rupiahFormat.format(listOfEmployee.get(i).getSallary()) + "\n"
                    + "Child Allowance : " + rupiahFormat.format(listOfEmployee.get(i).getAllowance()) + "\n"
                    + "Insentive :" + rupiahFormat.format(listOfEmployee.get(i).getIncentive())+ "\n"
                    + "=========================";
    }
        return print;
    }
    
}
