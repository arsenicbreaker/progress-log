/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_perpustakaan;

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
    
    //method utk menghitung lamapinjam
    public long getLamaPinjam() {
    if (starting == null || rencana == null) {
        return 0;
    }

    LocalDate tPinjam = starting.toInstant()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate();

    LocalDate tRencana = rencana.toInstant()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate();

    long lamaHari = ChronoUnit.DAYS.between(tPinjam, tRencana);

    if (lamaHari <= 0) {
        lamaHari = 1;
    }

    return lamaHari;
}

    
    public double getSewa() {
        //harga rental = harga * (tanggal rencana pengembalian - tanggal sewa)
        long lamaHari = getLamaPinjam();
        this.sewa = harga * lamaHari;
        return this.sewa;
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
        double biayaPinjam = getSewa();     // Biaya Pinjam = harga * lama hari
    long lamaHari = getLamaPinjam();   // Lama pinjam dalam hari

    double diskonStatus = 0;
    double diskonLamaPinjam = 0;

    if (jenis != null) {
        String j = jenis.toLowerCase();

        // Diskon berdasarkan status peminjam
        if (j.equals("mahasiswa")) {
            // Contoh yang kamu tulis: Total Diskon Status = 50% x Biaya pinjam
            diskonStatus = 0.8 * biayaPinjam;
        } else if (j.equals("dosen") || j.equals("tenaga pendidik") || j.equals("dosen/tendik")) {
            // Dari deskripsi: Dosen/Tendik mendapat 90%
            diskonStatus = 0.9 * biayaPinjam;
        } else {
            // Umum atau status lain tidak dapat diskon status
            diskonStatus = 0;
        }

        // Diskon berdasarkan lama pinjam (hanya untuk Mahasiswa dan > 7 hari)
        if (j.equals("mahasiswa") && lamaHari > 7) {
            diskonLamaPinjam = 0.1 * biayaPinjam;  // 10% x Biaya pinjam
        }
    }

    this.diskon = diskonStatus + diskonLamaPinjam;  // Total Diskon
    return this.diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    
    public double getTotalBiaya() {
    double biayaPinjam = getSewa();
    double totalDiskon = getDiskon();
    return biayaPinjam - totalDiskon + denda;
    }

    /**
     * @return the denda
     */
    
    public long getHariTerlambat() {
    if (rencana == null || back == null) {
        return 0;
    }

    LocalDate tRencana = rencana.toInstant()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate();

    LocalDate tKembali = back.toInstant()
                             .atZone(ZoneId.systemDefault())
                             .toLocalDate();

    long terlambat = ChronoUnit.DAYS.between(tRencana, tKembali);

    // Kalau dikembalikan lebih cepat atau tepat waktu → tidak terlambat
    if (terlambat <= 0) {
        return 0;
    }

    return terlambat;
}
    
    public int getTarifDendaPerHari() {
    long terlambat = getHariTerlambat();

    if (terlambat < 2) {
        return 0;
    } else if (terlambat <= 3) {
        return 25000;
    } else if (terlambat <= 7) {
        return 50000;
    } else {
        return 100000;
    }
}


    public double getDenda() {
        long terlambat = getHariTerlambat();

    if (terlambat < 2) {
        // Telat 0–1 hari → tidak kena denda
        denda = 0;
    } else if (terlambat <= 3) {
        // Telat 2–3 hari
        denda = 25000 * terlambat;
    } else if (terlambat <= 7) {
        // Telat 4–7 hari
        denda = 50000 * terlambat;
    } else {
        // Telat lebih dari 7 hari
        denda = 100000 * terlambat;
    }

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
            Rent r = listOfRent.get(i);
            long telat = r.getHariTerlambat();
            int tarif = r.getTarifDendaPerHari();
            double totalDenda = r.getDenda();
            print += "Penyewa ke-" + (i+1) + "\n"
                    + "Nama Peminjam : " + listOfRent.get(i).getNama() + "\n"
                    + "Status Peminjam : " + listOfRent.get(i).getJenis() + "\n"
                    + "Judul Buku: " + listOfRent.get(i).getMerk() + "\n"
                    + "Kategori Buku: " + listOfRent.get(i).getPlat() + "\n"
                    + "Harga Peminjaman: " + rupiahFormat.format(listOfRent.get(i).getHarga()) + "\n"
                    + "Tanggal Peminjaman: " + listOfRent.get(i).getStarting() + "\n"
                    + "Tanggal Rencana Pengembalian: " + listOfRent.get(i).getRencana() + "\n"
                    + "Tanggal Pengembalian: " + listOfRent.get(i).getBack() + "\n"
                    + "Biaya Peminjaman: " + rupiahFormat.format(listOfRent.get(i).getSewa()) + "\n"
                    + "Harga Diskon : " + listOfRent.get(i).getDiskon() + "\n"
                    + "Denda : " + rupiahFormat.format(tarif) + " x " 
                                 + telat + " = " 
                                 + rupiahFormat.format(totalDenda) + "\n"
                    + "Total Biaya peminjaman : " + rupiahFormat.format(listOfRent.get(i).getTotalBiaya()) + "\n"
                    + "=========================" + "\n"
                    + "Terimakasih Bapak Zain ><";
            
            }
        return print; 
    }
}
