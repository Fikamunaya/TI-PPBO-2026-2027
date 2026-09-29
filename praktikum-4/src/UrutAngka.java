import java.util.Scanner;

public class UrutAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah elemen : ");
        int n = input.nextInt();
        
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("Sebelum diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSesudah diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
