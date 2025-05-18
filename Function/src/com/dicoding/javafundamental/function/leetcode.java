package com.dicoding.javafundamental.function;

import java.util.Scanner;

public class leetcode {
    static String name;
    static String team;

    static void help(){
        System.out.println("Your favorite driver : " + name);
        System.out.println("Your favorite team : " + team);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite driver");
        name = scanner.nextLine();
        System.out.println("Enter your favorite team");
        team = scanner.nextLine();
        help();

    }
}
