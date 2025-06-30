import java.util.Scanner;

class Pendataan {
    String nama;
    String barang;
    int jumlah;
    double total;

    public Pendataan(String nama, String barang, int jumlah) {
        this.nama = nama;
        this.barang = barang;
        this.jumlah = jumlah;
        this.total = hitungTotal();
    }

    public void tampilkanInfo() {
        System.out.println("PENDATAAN");
        System.out.println("Nama customer : " + nama);
        System.out.println("Nama barang : " + barang);
        System.out.println("Total harga : " + total);
    }

    public double hitungTotal() {
        double hargaSatuan;

        if (barang.equalsIgnoreCase("KULKAS")) {
            hargaSatuan = 2000000;
        } else if (barang.equalsIgnoreCase("TV")) {
            hargaSatuan = 1500000;
        } else if (barang.equalsIgnoreCase("MESIN CUCI")) {
            hargaSatuan = 1800000;
        } else {
            hargaSatuan = 0;
        }

        return hargaSatuan * jumlah;
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
            scanner.nextLine();

            // membuat objek
            datanya[i] = new Pendataan(nama,barang,jumlah);
        }

        for (int j = 0;j<n;j++) {
            datanya[j].tampilkanInfo();
        }

    }
}
