
package com.dicoding.javafundamental.objek;
 
public class Main2 {
    public static void main(String[] args) {
        Hewan2 Elang = new Hewan2("Elang");
        Hewan2 Kucing = new Hewan2("Kucing");


        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();


        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
