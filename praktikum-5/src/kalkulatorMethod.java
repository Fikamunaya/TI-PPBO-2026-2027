import java.util.Scanner;

public class kalkulatorMethod {
    //Method untuk penjumlahan 2 angka
    static double tambah(double a, double b) {
        return  a + b;
    }

    //method overloading: penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    //method untuk pengurangan
    static double kurang(double a, double b) {
        return  a - b;
    }

    //method untuk perkalian
    static double kali(double a, double b) {
        return  a * b;
    }

    //method untuk pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    //method untuk perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    //method untuk akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    //method untuk mencari hasil terbesar dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array untuk menyimpan riwayat hasil perhitungan
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;

        do {
            System.out.println("\n====== KALKULATOR METHOD ======");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi : ");
            pilihan = input.nextInt();

            double hasil;

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan angka pertama : ");
                    double a = input.nextDouble();

                    System.out.print("Masukkan angka kedua : ");
                    double b = input.nextDouble();

                    hasil = tambah(a, b);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama : ");
                    double x = input.nextDouble();

                    System.out.print("Masukkan angka kedua : ");
                    double y = input.nextDouble();

                    System.out.print("Masukkan angka ketiga : ");
                    double z = input.nextDouble();

                    hasil = tambah(x, y, z);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama : ");
                    double c = input.nextDouble();

                    System.out.print("Masukkan angka kedua : ");
                    double d = input.nextDouble();

                    hasil = kurang(c, d);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama : ");
                    double e = input.nextDouble();

                    System.out.print("Masukkan angka kedua : ");
                    double f = input.nextDouble();

                    hasil = kali(e, f);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama : ");
                    double g = input.nextDouble();

                    System.out.print("Masukkan angka kedua : ");
                    double h = input.nextDouble();

                    if (h == 0) {
                        System.out.println("Error: Tidak dapat membagi dengan nol.");
                    } else {
                        hasil = bagi(g, h);

                        System.out.println("Hasil = " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;

                case 6:
                    System.out.print("Masukkan bilangan : ");
                    double i = input.nextDouble();

                    System.out.print("Masukkan pangkat : ");
                    double j = input.nextDouble();

                    hasil = pangkat(i, j);

                    System.out.println("Hasil = " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 7:
                    System.out.print("Masukkan angka : ");
                    double k = input.nextDouble();

                    if (k < 0) {
                        System.out.println("Error: Tidak dapat mencari akar dari bilangan negatif.");
                    } else {
                        hasil = akarKuadrat(k);

                        System.out.println("Hasil = " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;

                case 0:
                    System.out.println("\nProgram selesai.");

                    if (jumlahRiwayat > 0) {
                        //membuat array baru sesuai jumlah riwayat yang terisi
                        double[] dataRiwayat = new double[jumlahRiwayat];

                        for (int iRiwayat = 0; iRiwayat < jumlahRiwayat; iRiwayat++) {
                            dataRiwayat[iRiwayat] = riwayatHasil[iRiwayat];
                        }

                        double maksimum = riwayatKeMaksimum(dataRiwayat);

                        System.out.println("Hasil maksimum dari seluruh riwayat = " + maksimum);
                    } else {
                        System.out.println("Belum ada perhitungan yang dilakukan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan !=0 );
        input.close();
    }

}
