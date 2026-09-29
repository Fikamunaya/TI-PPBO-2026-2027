import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriks = new int[3][3];
        int total = 0;

        System.out.println("Masukkan elemen matriks 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks: ");

        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
                jumlahBaris += matriks[i][j];
                total += matriks[i][j];
            }
            System.out.println(" = jumlah baris: " + jumlahBaris);
        }
        System.out.println();
        System.out.println("Jumlah seluruh elemen: " + total);
    }
}
