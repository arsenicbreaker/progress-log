import java.util.Scanner;

class Pendataan {
    // membuat kelas untuk objek dari pendataan transaksi penjualan
    String nama;
    String barang;
    int jumlah;
    double total;

    public Pendataan(String nama, String barang, int jumlah) {
        // constructor kelas pendataan
        this.nama = nama;
        this.barang = barang;
        this.jumlah = jumlah;
        this.total = hitungTotal(); // menginisialisasi total dengan objek dari method hitungtotal
    }

    public double hitungTotal() {
        double hargaSatuan;

        // conditional untuk menentukan masing masing harga barang
        if (barang.equalsIgnoreCase("KULKAS")) {
            hargaSatuan = 3000000;
        } else if (barang.equalsIgnoreCase("TV")) {
            hargaSatuan = 2500000;
        } else if (barang.equalsIgnoreCase("LAPTOP")) {
            hargaSatuan = 7000000;
        } else {
            hargaSatuan = 0;
        }

        return hargaSatuan * jumlah;
        //return yang akan kembali ke objek total
    }

    // methood untuk menampilkan pendataan transaksi
    public void tampilkanInfo() {
        System.out.println("PENDATAAN");
        System.out.println("Nama customer\t: " + nama);
        System.out.println("Nama barang\t\t: " + barang);
        System.out.println("Jumlah\t\t\t: " + jumlah);
        System.out.println("Total harga\t\t: " + total);
        // conditional untuk menentukan apakah pelanggan mendapat cashback atau tidak
        if (total > 10000000){
            System.out.println("Catatan\t\t: Anda mendapatkan cashback sebesar Rp.500.000");
        }else{
            System.out.println("Catatan\t\t: --");
        }
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

        // looping untuk memasukkan value ke objek
        for(int i = 0;i<n;i++) {
            System.out.println("Transaksi ke -" + (i+1));
            System.out.print("Nama Pembeli : ");
            String nama = scanner.nextLine();
            System.out.print("Nama Barang (Tv/Kulkas/Laptop): ");
            String barang = scanner.nextLine();
            System.out.print("Jumlah barang : ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();

            // mengisi objek
            datanya[i] = new Pendataan(nama,barang,jumlah);
        }

        // looping untuk menampikan data penjualan
        for (int i = 0;i<n;i++) {
            datanya[i].tampilkanInfo();
        }

    }
}
