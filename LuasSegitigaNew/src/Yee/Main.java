package Yee;

public class Main {

    public static void main(String[] args) {

        Segitiga tiga = new Segitiga();
        System.out.println("Selamat Berhitung!");
        tiga.Input_a();
        tiga.Input_t();
        tiga.hitung();

        System.out.println("Hasil = " + tiga.hasil());
    }
}
