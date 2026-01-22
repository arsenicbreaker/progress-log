/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_pemilihanketua;

/**
 *
 * @author erina
 */
public class Node {
    public Node next;
    public Node prev;
    public String nama;
    public String nim;
    
    public Node(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}
