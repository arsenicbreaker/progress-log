/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agustia_pemilihanketua;
import java.util.*;

/**
 *
 * @author erina
 */
public class Agustia_PemilihanKetua {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Contoh input dari soal PDF
        list.AddNode("301230001", "Gatot");
        list.AddNode("301230002", "Claude");
        list.AddNode("301230003", "Franco");
        list.AddNode("301230004", "Alucard");
        //list.AddNode("301230004", "Angela");

        int i = 1; // start index
        int j = 2; // langkah estafet

        String newNIM = "301230005";
        String newName = "Kadita";

        // Mahasiswa baru bergabung di antara mahasiswa ke-n dan n+1
        //int insertIndex = 1;
        
        String leader = list.simulate(i, j, newNIM, newName, 1);

        System.out.println(leader + " is the leader");
    }
}
