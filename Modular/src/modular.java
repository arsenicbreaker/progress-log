import java.util.Scanner;

public class modular {

    // Fungsi input nama
    static String[] inputNama(int jumlah) {
        Scanner scanner = new Scanner(System.in);
        String[] nama = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = scanner.nextLine();
        }

        return nama;
    }

    // Fungsi input nilai
    static Double[] inputNilai(int jumlah) {
        Scanner scanner = new Scanner(System.in);
        Double[] nilai = new Double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
        }

        return nilai;
    }

    // Fungsi hitung total
    static double hitungTotal(Double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total;
    }

    // Fungsi hitung rata-rata
    static double hitungRataRata(Double[] nilai) {
        return hitungTotal(nilai) / nilai.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silakan masukkan jumlah mahasiswa: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // buang newline

        String[] nama = inputNama(n);
        Double[] nilai = inputNilai(n);

        double total = hitungTotal(nilai);
        double rataRata = hitungRataRata(nilai);

        System.out.println("\n=== HASIL ===");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
