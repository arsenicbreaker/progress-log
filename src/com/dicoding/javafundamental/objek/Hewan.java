package com.dicoding.javafundamental.objek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan :" + nama);
        System.out.println("Berat hewan :" + berat + "kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }


}
