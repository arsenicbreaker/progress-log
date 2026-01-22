/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_publishersistem.Class;

/**
 *
 * @author erina
 */
public class Publisher {
    private String id;
    private String nama;
    private String address;
    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    //constructor

    public Publisher(String id, String nama, String address) {
        this.id = id;
        this.nama = nama;
        this.address = address;
    }
    
    public String toString() {
        return this.id + " " + this.nama;
    }
    
}
