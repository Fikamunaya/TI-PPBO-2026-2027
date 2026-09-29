import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a. menginput jumlah mahasiswa dan nilai
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        //menampilkan nilai sebelum di urutkan
        System.out.print("\nNilai sebelum diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }
        //b. Menghitung rata-rata, tertinggi,terendah, lulus, dan tidak lulus
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            if (nilai[i] >= 70) {
                jumlahLulus++;
            }
        }
        double rataRata = (double) total / n;
        int jumlahTidakLulus = n - jumlahLulus;

        //c. Mengurutkan nilai menggunakan Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        //d.Menampilkan hasil pengolahan nilai
        System.out.println("\n\n=========================================");
        System.out.println("        HASIL PENGOLAHAN DATA");
        System.out.println("=========================================");

        System.out.println("Jumlah mahasiswa        : " + n);
        System.out.println("Total nilai             : " + total);
        System.out.printf("Rata-rata kelas          : %.2f%n", rataRata);
        System.out.println("Nilai Tertinggi         : " + nilaiTertinggi);
        System.out.println("Nilai Terendah          : " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa Lulus  : " + jumlahLulus);
        System.out.println("Jumlah tidak Lulus      : " + jumlahTidakLulus);

        System.out.println("\nNilai setelah diurutkan (ascending) : ");

        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n============================================");
    }
}
