import java.util.Scanner;
public class arrays {

    static void nilaiTotal(int[] nilai) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silahkan jumlah mahasiswa");
        int n = scanner.nextInt();
        scanner.nextLine();

        //input elemen NAMA array dari pengguna
        String[] nama = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan nama mahasiswa ke " + (i+1));
            nama[i] = scanner.nextLine();
            }

        //input elemen NILAI array dari pengguna
        Double[] nilai = new Double[n];
        for(int i=0; i < n; i++) {
            System.out.println("Masukkan nilai mahasiswa ke " + (i+1));
            nilai[i] = scanner.nextDouble();
        }

        //menghitung jumlah array
        double total = 0;
        for (int i = 0; i < n ; i++) {
            total += nilai[i];
        }

        //menghitung rata rata
        double rataRata = total/n;

                System.out.println("Total nilai: " + total);
                System.out.println("Rata-rata: " + rataRata);

    }
}