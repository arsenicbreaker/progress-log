public class whileLoop {
    public static void main(String[] args) {
        boolean kondisi = true;
        int a = 0;
        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);
            if (a == 10) {
                kondisi = false;
            }
            a++;
        }

        System.out.println("akhir program");
    }
}
