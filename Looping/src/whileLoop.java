import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        System.out.println("Masukkan berapa kali pengulangan");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int i = 0;
        while (i < number) {
            System.out.println("Ini adalah perulangan ke " + i++);

        }

        System.out.println("Kamu sudah melakukan perulangan sebanyak " + number + " kali");
    }
}
