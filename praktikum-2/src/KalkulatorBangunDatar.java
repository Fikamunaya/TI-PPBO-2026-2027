/*
* Nama Program = KalkulatorBangunDatar
* Jenis Program = Kalkulator Bnagun Datar
* Bahasa Program = Java
* Input = Panjang, Lebar, dan jari-jari
* Deskripsi = Menghitung luas dan Keliling Persegi Panjang Serta Lingkaran
*             dan menentukan apakah luas persegi panjang > 100
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //bagian persegi panjang
        System.out.println("==== PERSEGI PANJANG ====");

        //meminta input panjang dan lebar dari pengguna
        System.out.println("Masukkan Panjang : ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan lebar   : ");
        double lebar = input.nextDouble();

        //menghitung luas persegi panjang
        double luasPersegi = panjang * lebar;

        //menghitung keliling persegi panjang
        double kelilingPersegi = 2 * (panjang + lebar);

        //menampilkan hasil persegi panjang
        System.out.println("Luas Persegi Panjang     : " + luasPersegi);
        System.out.println("Keliling Persegi Panjang : " + kelilingPersegi);

        //menyimpan cek luas > 100 ke variabel boolean
        boolean luasBesar = luasPersegi > 100;
        System.out.println("Apakah luas lebih dari 100? : " + luasBesar);
        System.out.println();

        //bagian lingkaran
        System.out.println("==== LINGKARAN ====");

        //meminta input jari-jari lingkaran
        System.out.println("Masukkan jari-jari lingkaran : ");
        double jarijari = input.nextDouble();

        //menghitung luas lingkaran: phi x r^2
        double luasLingkaran = Math.PI * jarijari * jarijari;
        //menghitung keliling lingkaran
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        //menampilkan hasil lingkaran
        System.out.println("Luas Lingkaran     : " + luasLingkaran);
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
    }
}
