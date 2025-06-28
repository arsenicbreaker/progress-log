import java.util.Scanner;

public class E01 {
   static String[][] inventory = new String[3][3];

    public static void display() {
        System.out.println("Nama barang\t|" + "Stok barang\t|" +  "Harga Barang\t");
    for (int i=0;i<3;i++) {
        System.out.println(inventory[i][0] + "\t|" + inventory[i][1] + "\t|" + inventory[i][2]);
    }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            System.out.print("Masukkan nama produk : ");
            inventory[i][0] = scanner.nextLine();
            System.out.print("Masukkan stok model : ");
            inventory[i][1] = scanner.nextLine();
            System.out.print("Masukkan harga produk : ");
            inventory[i][2] = scanner.nextLine();
            System.out.println();
        }

        display();
    }
}
