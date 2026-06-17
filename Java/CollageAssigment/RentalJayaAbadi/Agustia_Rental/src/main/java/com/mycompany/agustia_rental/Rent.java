/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_rental;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author erina
 */
public class Rent {

    /**
     * @return the rencana
     */
    public Date getRencana() {
        return rencana;
    }

    /**
     * @param rencana the rencana to set
     */
    public void setRencana(Date rencana) {
        this.rencana = rencana;
    }

    /**
     * @return the sewa
     */
    public double getSewa() {
        //harga rental = harga * (tanggal pengembalian - tanggal sewa)
        double sewa = 0;
        LocalDate targetLocalDate = starting.toInstant()
                                              .atZone(ZoneId.systemDefault())
                                              .toLocalDate();
        
        LocalDate today = LocalDate.now();
        
        double daysBetween = ChronoUnit.DAYS.between(targetLocalDate,today);
       
        return harga * daysBetween;
    }

    /**
     * @param sewa the sewa to set
     */
    public void setSewa(double sewa) {
        this.sewa = sewa;
    }

    /**
     * @return the nama
     */
  

    /**
     * @return the id
     */
    
    private int id;
    private String jenis;
    private String merk;
    private String plat;
    private Date starting; //tanggal sewa
    private Date back; //tanggal pengembalian
    private double harga;
    private double diskon;
    private double denda;
    private String nama;
    private double sewa;
    private Date rencana;
    
    private ArrayList<Rent> listOfRent = new ArrayList<>();
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) throws Exception {
        if (id<0) {
            throw new Exception("ID Tidak boleh negatif");
        }
        this.id = id;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the plat
     */
    public String getPlat() {
        return plat;
    }

    /**
     * @param plat the plat to set
     */
    public void setPlat(String plat) {
        this.plat = plat;
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

    /**
     * @return the back
     */
    public Date getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(Date back) {
        this.back = back;
    }

    /**
     * @return the biayaSewa
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param biayaSewa the biayaSewa to set
     */
    public void setHarga(double harga) throws Exception {
        if (harga<0) {
            throw new Exception("ID Tidak boleh negatif");
        }
        this.harga = harga;
    }

    /**
     * @return the diskon
     */
    public double getDiskon() {
        LocalDate targetLocalDate = starting.toInstant()
                                              .atZone(ZoneId.systemDefault())
                                              .toLocalDate();
        
        LocalDate today = LocalDate.now();
        
        double daysBetween = ChronoUnit.DAYS.between(targetLocalDate,today);
        
        if (daysBetween >= 7) {
            diskon = 0.1 * sewa;
        } else {
            diskon = 0;
        }
        
        return diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    /**
     * @return the denda
     */
    public double getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(double denda) {
        this.denda = denda;
    }
    
      public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Rent() {
        this.id = 0;
        this.jenis="";
        this.merk="";
        this.plat="";
        LocalDate localDate = LocalDate.now();
        this.starting = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.back = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.harga = 0;
        this.diskon = 0;
        this.denda = 0;
        this.nama = "";
        this.rencana = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    public Rent(int id,String nama,String jenis,String merk,String plat,double harga,Date starting, Date back, Date rencana) throws Exception {
        if (id<0) {
            throw new Exception("ID Tidak boleh negatif");
        }
        if (harga<0) {
            throw new Exception("ID Tidak boleh negatif");
        }
        this.id = id;
        this.nama = nama;
        this.jenis= jenis;
        this.merk= merk;
        this.plat= plat;
        this.harga = harga;
        this.starting = starting;
        this.back = back;
        this.rencana = rencana;
    }
    
    
    //add data
    public void addRent(Rent rent) throws Exception {
        int id = 0;
        if(listOfRent.isEmpty()) {
            id = 1;
        }else{
            id = listOfRent.size() + 1;
        }
        rent.setId(id);
        listOfRent.add(rent);
    }
    
    //update data
    public void updateRent(Rent rent, int id) {
        int index = -1;
        for(int i=0;i<listOfRent.size();i++) {
            if(listOfRent.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        listOfRent.set(index,rent);
    }
    
    //display
    public String showDataRent() {
        String print = "";
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        for(int i=0;i<listOfRent.size();i++) {
            print += "Penyewa ke-" + (i+1) + "\n"
                    + "Nama Penyewa : " + listOfRent.get(i).getNama() + "\n"
                    + "Jenis Mobil : " + listOfRent.get(i).getJenis() + "\n"
                    + "Merk Mobil: " + listOfRent.get(i).getMerk() + "\n"
                    + "Plat Mobil: " + listOfRent.get(i).getPlat() + "\n"
                    + "Harga Sewa: " + rupiahFormat.format(listOfRent.get(i).getHarga()) + "\n"
                    + "Tanggal Sewa: " + listOfRent.get(i).getStarting() + "\n"
                    + "Tanggal Rencana Pengembalian: " + listOfRent.get(i).getRencana() + "\n"
                    + "Tanggal Pengembalian: " + listOfRent.get(i).getBack() + "\n"
                    + "Harga Rental Mobil: " + listOfRent.get(i).getSewa() + "\n"
                    + "Harga Diskon : " + listOfRent.get(i).getDiskon() + "\n"
                    + "Denda : " + "\n"
                    + "Harga Akhir : " + "\n"
                    + "=========================" + "\n"
                    + "Hiks waktunya kurang:(((((((";
            
            }
        return print; 
    }
}
