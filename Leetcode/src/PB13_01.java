class Mobil {
    // properti
    String merk;
    int tahun;
    // constructor
    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    //display
    public void tampilkanInfo() {
        System.out.println("Merk Mobil : " + merk);
        System.out.println("Tahun Mobil : " + tahun);
    }
}

public class PB13_01 {
    public static void main(String[] args) {
        // membuat objek
        Mobil mobilSaya = new Mobil("Toyota",2020);

        //memanggil
        mobilSaya.tampilkanInfo();
    }
}
