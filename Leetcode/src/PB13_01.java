import java.util.Arrays;
import java.util.Scanner;

class Rekrutment {
    // 1. atribut
    String nama;
    String alamat;
    int umur;
    String posisi;

    // 2. constructor
    public Rekrutment(String nama, String alamat, int umur, String posisi) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.posisi = posisi;
    }

    // 3. method display
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Umur    : " + umur);
        System.out.println("Posisi  : " + posisi);
        System.out.println("--------------------------");
    }
}



public class PB13_01 {
    // method main (program utama)
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah pelamar : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        // inisialisasi array
        Rekrutment[] pelamar = new Rekrutment[n];

      for (int i = 0; i<n;i++ ) {
          System.out.println("Masukkan nama pelamar ke - " + (i+1));
          System.out.print("Nama : ");
          String nama = scanner.nextLine();
          System.out.print("Alamat : ");
          String alamat = scanner.nextLine();
          System.out.print("Umur : ");
          int umur = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Posisi yang dilamar : ");
          String posisi = scanner.nextLine();
          System.out.println();

          // membuat objek
          pelamar[i]  = new Rekrutment(nama, alamat, umur, posisi);
      }

        System.out.println("==== DATA PELAMAR KERJA===");
        for (int j = 0 ; j<n ; j++)
            pelamar[j].tampilkanInfo();
    }
}
