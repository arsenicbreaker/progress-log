package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        // tipe data - declare - assign
        char input = 'A'; // eksekusi dimulai dari nilai A
        int output = 0;

        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);

    }
}
