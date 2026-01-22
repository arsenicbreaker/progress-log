/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorpecahan_agustia;

/**
 *
 * @author erina
 */
public class Calculator {
    private int pembilang;
    private int penyebut;
    
    
    //getter
    public int getPembilang() {
        return pembilang;
    }

    public int getPenyebut() {
        return penyebut;
    }
    
    // setter
    public void setPembilang(int pembilang) {
        this.pembilang = pembilang;
    }

    public void setPenyebut(int penyebut) throws Exception{
        if (penyebut == 0){
            throw new Exception("Tidak boleh nol");
        }
        this.penyebut = penyebut;
    }
    
    // deff
    public Calculator(){
        this.pembilang = 0;
        this.penyebut = 1;
    }
    
    // + parameter
    public Calculator(int pembilang, int penyebut) throws Exception {
        if (penyebut == 0){
            throw new Exception("tidak boleh nol");
        }
        
        //parsing
        this.pembilang = pembilang;
        this.penyebut = penyebut;
        sederhanakan();
    }
    
    
    
    public Calculator tambah(Calculator lawan) throws Exception{
        // this = objek disni
        // lawan = obejk parameter 
        int pembilangHasil = (this.getPembilang() * lawan.getPenyebut()) + (this.getPenyebut() * lawan.getPembilang());
        int penyebutHasil = (this.getPenyebut() * lawan.getPenyebut());
        System.out.println(pembilangHasil + "/" + penyebutHasil);
        return new Calculator(pembilangHasil, penyebutHasil);
    }
    
    public Calculator kurang(Calculator lawan) throws Exception{
        
        int pembilangHasil = (this.getPembilang() * lawan.getPenyebut()) - (this.getPenyebut() * lawan.getPembilang());
        int penyebutHasil = (this.getPenyebut() * lawan.getPenyebut());
        
        return new Calculator(pembilangHasil, penyebutHasil);
    }
    
    public Calculator kali(Calculator lawan) throws Exception{
        
        int pembilangHasil = this.getPembilang() * lawan.getPembilang();
        int penyebutHasil = this.getPenyebut() * lawan.getPenyebut();
        
        return new Calculator(pembilangHasil, penyebutHasil);
    }
    
    public Calculator bagi(Calculator lawan) throws Exception{
        if (lawan.getPembilang() == 0) {
            throw new Exception("Tidak bisa membagi dengan 0!");
        }
        int pembilangHasil = this.getPembilang() * lawan.getPenyebut();
        int penyebutHasil = this.getPenyebut() * lawan.getPembilang();
        
        return new Calculator(pembilangHasil, penyebutHasil);
    }
    
    // CARI PEMBAGI UNTK MENYEDERHANAKAN PECAHAN
    private int FPB(int a, int b) {
        // Ubah nilai nya jadi positif , jika ada yg negatif
        a = Math.abs(a);
        b = Math.abs(b);
    
        // kalau b = 0, return a
        if (b == 0) {
            return a;
        }
    
        // recursive method
        return FPB(b, a % b);
    }


    private void sederhanakan() {
        // pembilang = 0
        if (pembilang == 0) {
            penyebut = 1;
            return;
        }
    
        // fpb
        int fpb = FPB(pembilang, penyebut);
    
        // bagi dengan hasil fpb nya 
        pembilang = pembilang / fpb;
        penyebut = penyebut / fpb;
    
       
        if (penyebut < 0) {
            pembilang = -pembilang;
            penyebut = -penyebut;
        }
}
    
    // BIAR KALO NEGPRINT YANG KELUAR GA ALAMAT !!!, METHOD BAWAAN JAVA
    @Override
    public String toString() {
        if (this.getPenyebut() == 1) {
            return String.valueOf(this.getPembilang());
        }
        return this.getPembilang() + "/" + this.getPenyebut();
    }
    
//    public void show(){
//        System.out.println(toString());
//    }
    
    
    public static void main(String[] args) throws Exception {
        Calculator p1 = new Calculator(1,2);
        Calculator p2 = new Calculator(1,3);
        Calculator hasil = p1.tambah(p2);
        System.out.println(hasil);
    }

    
}

