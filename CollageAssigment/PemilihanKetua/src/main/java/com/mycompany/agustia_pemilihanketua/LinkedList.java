/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agustia_pemilihanketua;

/**
 *
 * @author erina
 */
public class LinkedList {
    Node head;
    int size = 0;

    //linked nya kosong atau enggak
    public boolean isEmpty() {
    return head == null;
    }
    
    //method menambahkan mahasiswa (untuk point nomor 5
    public void AddNode(String nim, String nama) {
        Node newNode = new Node(nim,nama);
        
           if(isEmpty()) {
                head = newNode;
                head.next = head.prev = newNode;
            } else {
                Node tail = head.prev;
                //menyambungkan tail node terakhir ke node baru
                tail.next = newNode;
                //menyambungkan prev new node ke tail lama
                newNode.prev = tail;
                newNode.next = head;
                //uppdate previous head
                head.prev = newNode;
        }
           size++;
    }
    
    public void AddAt(Node left, Node right, String nim, String nama) {
    Node newNode = new Node(nim, nama);

    left.next = newNode;
    newNode.prev = left;

    newNode.next = right;
    right.prev = newNode;

    size++;
}
     
     //method menghapus mahasiswa yang sudah kepilih
     public void remove(Node node) {
        if (size == 1) {
            head = null;
            size = 0;
            return;
        }

        Node before = node.prev;
        Node after  = node.next;

        before.next = after;
        after.prev = before;

        if (node == head) {
            head = head.next;
        }

        size--;
    }
     
     
     //method mencetak linked list dan node yg dihapus 
     public void printState(Node current) {
        Node temp = head;
        System.out.print("State: ");
        do {
            System.out.print(temp.nim + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.print("--> " + current.nim + " will be removed");
        System.out.println();
    }

     //simulasi permainan
     public String simulate(int startIndex, 
                            int j, 
                            String newNIM, 
                            String newName, 
                            int insertIndex) {
        Node current = head;

        //geser ke posisi start
        for (int k = 1; k < startIndex; k++) {
            current = current.next;
        }

        boolean sudahDisisipkan = false;
        
        while (size > 1) {
            
     

            // Saat sisa 3 → tambahkan mahasiswa baru
            if (!sudahDisisipkan && size == 2) {
                Node left = current.prev;
                Node right = current;
                
                AddAt(left, right, newNIM, newName);
                
                 System.out.println(
                left.nim + " " +
                 newNIM + " " +
                right.nim + " -> " +
                newNIM + " added"
        );

            current = left; 
            
            sudahDisisipkan = true;
            continue;
            }
            
            //menghitung maju j kali
            for (int step = 0; step < j; step++) {
               current = current.next;
            }
            
            //menampilkan state sebelum dihapus
            printState(current);
            
            Node prevNode = current.prev;
            remove(current);
            
            //setelah satu orang keluar, kertas pindah ke teman
            current = prevNode;
        }
      

        return head.nim;
    }
}
