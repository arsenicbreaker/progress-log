package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;

public class hackerRank {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input n");
            int n = scanner.nextInt();

            if(n%2==0) {
                if(n<= 5 && n>=2) {
                    System.out.println(n + " Is not weird");
                } else if(n>=6 && n <= 20) {
                    System.out.println(n + " Is Weird");
                } else {
                    System.out.println(n + " Is not weird");
                }
            } else {
                System.out.println(n + " Is weird");
            }
            // BERHENTI LOOP //
        }
    }
