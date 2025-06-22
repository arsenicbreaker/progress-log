import java.util.Scanner;

public class PB11_UTS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa");
        String nama = scanner.nextLine();
        System.out.println("Masukkan NIM mahasiswa");
        String nim = scanner.nextLine();
        System.out.println("Masukkan jumlah pelajaran yang akan diinput");
        int n = scanner.nextInt();

        double nilaitugas, jumlahtugas = 0,rataratatugas = 0, nilaiUTS, jumlahUTS = 0, nilaiUAS, jumlahUAS = 0, nilaiAkhir = 0;

        // looping for assignment tugas
        for (int i=1;i<=n;i++) {
            System.out.println("Masukkan nilai tugas ke " + i);
            nilaitugas = scanner.nextDouble();
            jumlahtugas =+ nilaitugas;
            rataratatugas = jumlahtugas*0.3;
        }

        // nilai UTS
        System.out.println("Masukkan nilai UTS");
        nilaiUTS = scanner.nextDouble();
        jumlahUTS = nilaiUTS*0.30;

        // input nilai UAS
        System.out.println("Masukkan nilai UAS");
        nilaiUAS = scanner.nextDouble();
        jumlahUAS = nilaiUAS*0.40;

        // nilai akhir
        nilaiAkhir = rataratatugas+jumlahUTS+jumlahUAS;

        // final output
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jumlah tugas: " + n);
        System.out.println("Jumlah nilai tugas: " + jumlahtugas);
        System.out.println("Nilai rata-rata tugas: " + rataratatugas);
        System.out.println("Nilai akhir UTS: " + jumlahUTS);
        System.out.println("Nilai akhir UAS: " + jumlahUAS);

    }
}
