import java.util.Scanner;

public class PilihMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====MENU MAKANAN====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Dimsum");
        System.out.println("4. Kebab");

        System.out.println("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreang");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih Dimsum");
                break;
            case 4:
                System.out.println("Anda memilih Kebab");
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
