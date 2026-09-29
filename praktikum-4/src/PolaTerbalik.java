import java.util.Scanner;

public class PolaTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan ukuran: ");
        int ukuran = input.nextInt();

        //segitiga terbalik
        System.out.println("\nSegitu Terbalik: ");

        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //persegi terbalik
        System.out.println("\nPersegi: ");

        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
