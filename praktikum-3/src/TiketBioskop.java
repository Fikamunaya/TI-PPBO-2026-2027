import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.println("Apakah Mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int hargaTiket;

        if (mahasiswa && umur < 25 ) {
            hargaTiket = 25000;
        } else {
            hargaTiket = 40000;
        }
        System.out.println("Harga Tiket: Rp" + hargaTiket);
    }
}
