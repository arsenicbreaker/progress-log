package com.dicoding.javafundamental.perulangan;

public class While {
    public static void main(String[] args) {
        // deklarasi variable value tipe data integer int dengan nilai 1
        int value = 1;
        // kondisi
        while (value <= 5) {
            // melakukan perintah apabila kondisi terpenuhi
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }
    }
}
