import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penjumlahan deret aritmatika");
        System.out.println("Masukkan nilai awal");
        int nilaiAwal = scanner.nextInt();
        System.out.println("Masukkan nilai akhir");
        int nilaiAkhir = scanner.nextInt();

        int jumlah = 0;
        for (int i = nilaiAwal ; i <= nilaiAkhir; nilaiAwal++) {
            System.out.println("Angka : " + i);
            jumlah += i++;
        }
        System.out.println("Jumlah : " + jumlah);
    }
}
