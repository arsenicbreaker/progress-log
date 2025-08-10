import java.util.Scanner;

class Peserta {

    String nama;
    String kelas;
    String email;

    public Peserta(String nama, String kelas, String email) {
        this.nama = nama;
        this.kelas = kelas;
        this.email = email;
    }

}


class Manager {
    Scanner scanner = new Scanner(System.in);
    Peserta[] daftar = new Peserta[100];
    int jumlahPeserta = 0;

    public void tampilkanmenu() {
        System.out.println("===MANAJEMEN KURSUS CODING===");
        System.out.println("1. Tambah Peserta");
        System.out.println("2. Lihat Peserta");
        System.out.println("3. Update Peserta");
        System.out.println("4. Delete Peserta");
        System.out.print("Silahkan pilih menu yang anda inginkan : ");
    }

    // methpd yg kedua
    public void pilihanmenu(int pilihan) {
        if (pilihan == 1) {
            tambahpeserta();
        } else if (pilihan == 2) {
            tampilkanpeserta();
        } else if (pilihan == 3) {
            updateData();
        } else if (pilihan == 4) {
            deleteData();
        } else {
            System.out.println("Perintah tidak dikenali");
        }
    }


        // method ketiga
        public void tambahpeserta() {

            System.out.print("Silahkan masukkan nama peserta : ");
            String nama = scanner.nextLine();
            System.out.print("Kelas yang di ambil : ");
            String kelas = scanner.nextLine();
            System.out.print("Silahkan masukkan email : ");
            String email = scanner.nextLine();
            if (!email.contains("@")) {
                System.out.println("❌ Email tidak valid!");
                return;
            }

            System.out.println("DATA PESERTA BERHASIL DITAMBAHKAN");

            //membuat objek untuk kelas peserta
            Peserta p = new Peserta(nama, kelas, email);
            daftar[jumlahPeserta] = p;
            jumlahPeserta++;
        }

        // METHOD KEEMPAT
        public void tampilkanpeserta() {
        if (jumlahPeserta==0) {
            System.out.println("Belum ada peserta yang di tambahkan");
            return;
        }
            System.out.println("No.\tNama\t\t\tKelas\t\t Email");
        for (int i = 0; i<jumlahPeserta; i++) {
            System.out.println((i+1) + "\t" + daftar[i].nama + "\t\t\t\t" + daftar[i].kelas + "\t\t" + daftar[i].email);
        }
    }

    // method KELIMA update data
    public void updateData() {
        if(jumlahPeserta==0) {
            System.out.println("Tidak ada peserta yang bisa di perbarui");
            return;
        }

        System.out.println("Masukkan nomor peserta yang ingin di perbarui");
        int nomor = scanner.nextInt();
        scanner.nextLine();

        Peserta peserta = daftar[nomor-1];
        System.out.print("Masukkan nama baru : ");
        peserta.nama = scanner.nextLine();
        System.out.print("Masukkan kelas baru");
        peserta.kelas = scanner.nextLine();
        System.out.print("Masukkan email baru");
        peserta.email = scanner.nextLine();

        System.out.println("Data berhasil diperbarui");
    }

    //METHOD KEENAM - DELETE DATA
    public void deleteData() {
        if(jumlahPeserta==0) {
            System.out.println("Tidak ada peserta yang bisa di perbarui");
            return;
        }
        System.out.println("Masukkan nomor peserta yang ingin di hapus");
        int nomor = scanner.nextInt();
        scanner.nextLine();

        for(int i = nomor-1;i<jumlahPeserta-1;i++) {
            daftar[i] = daftar[i+1];
        }

        daftar[jumlahPeserta-1] = null;
        jumlahPeserta--;

        System.out.println("Peserta berhasil di hapus");
    }

}






public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        String lanjut;
        Manager objmanager = new Manager();


        do {
            objmanager.tampilkanmenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();
            objmanager.pilihanmenu(pilihan);

            System.out.println();
            System.out.println("Apakah kamu ingin menghakiri program (Y/N)");
            lanjut = scanner.nextLine();
        } while (!lanjut.equalsIgnoreCase("Y"));
            System.out.println("Terima kasih telah menggunakan aplikasi!");
        }
}