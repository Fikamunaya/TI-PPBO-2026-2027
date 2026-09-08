import java.util.Scanner;

public class OperatorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //minta input 2 angka bulat
        System.out.println("Masukkan bilangan pertama: ");
        int a = sc.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int b = sc.nextInt();

        //Menampilkan hasil aritmatika
        System.out.println("\n=== Hasil Aritmatika ===");
        System.out.println("Penjumlahan : " + (a + b));
        System.out.println("Pengurangan : " + (a - b));
        System.out.println("Perkalian : " + (a * b));
        System.out.println("Pembagian : " + (a / b));
        System.out.println("Modulus : " + (a % b));

        //menampilkan hasil perbandingan
        System.out.println("\n=== Hasil Perbandingan ===");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " =" + (a == b));




    }
}
