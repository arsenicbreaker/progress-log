import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    int umur;

    // constructor
    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    //display
    public void tampilkanMahasiswa() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Umur : " + umur);
    }
}

public class PB13_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan umur mahasiswa : ");
        int umur = scanner.nextInt();

        // buat objek
        Mahasiswa mhs = new Mahasiswa(nama, nim, umur);

        // menampilkan data
        mhs.tampilkanMahasiswa();
    }
}
