package Yee;

import java.util.Scanner;

public class Segitiga {

    Scanner S = new Scanner(System.in);
    int alas, tinggi, hasil = 0;

    void Input_a(){
        System.out.print("Masukkan nilai Alas : ");
        alas = S.nextInt();
    }
    void Input_t(){
        System.out.print("Masukkan nilai Tinggi : ");
        tinggi = S.nextInt();
    }
    void hitung(){
        hasil = (alas * tinggi) / 2;
    }

    int hasil(){
        return hasil;
    }


}