package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {

        // assignment
        int nilaiUjian = 80;

        // declare
        char indeksPrestasi;

        // if else than
        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else {
            indeksPrestasi = 'D';
        }

        // output
System.out.println("Nilai Predikat anda adalah " + indeksPrestasi);

    }
}
