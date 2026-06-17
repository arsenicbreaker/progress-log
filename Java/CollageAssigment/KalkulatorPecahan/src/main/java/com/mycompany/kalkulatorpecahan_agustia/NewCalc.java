/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorpecahan_agustia;

/**
 *
 * @author erina
 */
public class NewCalc {

    /**
     * @return the pembilang
     */
    public int getPembilang() {
        return pembilang;
    }

    /**
     * @param pembilang the pembilang to set
     */
    public void setPembilang(int pembilang) {
        this.pembilang = pembilang;
    }

    /**
     * @return the penyebut
     */
    public int getPenyebut() {
        return penyebut;
    }

    /**
     * @param penyebut the penyebut to set
     */
    public void setPenyebut(int penyebut) {
        this.penyebut = penyebut;
    }
    
private int pembilang;
private int penyebut;


    //static method
    public static Pembagian kurang(Pecahan p1, Pecahan p2) {
        
        int hPembilang = (p1.pembilang*p2.penyebut);
        int hPenyebut = (p1.penyebut*p2.pembilang);
        
        Pecahan hasilp = new Pecahan (getPembilang(), getPenyebut());
        return hasilP;
    }
}
