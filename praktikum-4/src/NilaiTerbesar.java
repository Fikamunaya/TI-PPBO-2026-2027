import java.util.Scanner;

public class NilaiTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("jumlah elemen: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int terbesar = array[0];
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (array[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = array[i];
            } else if (array[i] > terbesarKedua && array[i] != terbesar) {
                terbesarKedua = array[i];
            }
        }
        System.out.println();
        System.out.println("Nilai terbesar : " + terbesar);
        System.out.println("Nilai terbesar kedua : " + terbesarKedua);
    }
}
