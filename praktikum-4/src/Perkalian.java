import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan : ");
        int bilangan = input.nextInt();

        System.out.println("Tabel Perkalian " + bilangan);

        for (int i =1; i <= 10; i++) {
            int hasil = bilangan * i;
            System.out.println(bilangan + " x " + i + " = " + hasil);
        }
    }
}
