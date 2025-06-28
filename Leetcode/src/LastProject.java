import java.util.Scanner;

class Pendataan {
    String nama;
    String barang;
    int jumlah;

    public Pendataan(String nama, String barang, int jumlah) {
    this.nama = nama;
    this.barang = barang;
    this.jumlah = jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("PENDATAAN");
        System.out.println("Nama customer : " + nama);
        System.out.println("Nama barang : " + barang);
        System.out.println("Total harga : ");

    }

}

public class LastProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===SISTEM PENDATAAN PENJUALAN TOKO ELEKTRONIK===");
        System.out.println("Silahkan masukkan jumlah transaksi : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // inisialisasi array
        Pendataan[] datanya = new Pendataan[n];


        for(int i = 0;i<n;i++) {
            System.out.println("Transaksi ke -" + (i+1));
            System.out.print("Nama Pembeli : ");
            String nama = scanner.nextLine();
            System.out.print("Nama Barang : ");
            String barang = scanner.nextLine();
            System.out.print("Jumlah barang : ");
            int jumlah = scanner.nextInt();

            // membuat objek
            datanya[i] = new Pendataan(nama,barang,jumlah);
        }

        for (int j = 0;j<n;j++) {
            datanya[j].tampilkanInfo();
        }

    }
}
