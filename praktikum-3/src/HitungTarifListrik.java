import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //konstanta tarif listrik per kWh
        final double TARIF_450 = 500;
        final double TARIF_900 = 800;
        final double TARIF_1300 = 1500;
        final double TARIF_2200 = 1700;
        final double TARIF_DIATAS_2200 = 2000;

        //input golongan daya
        System.out.println("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        //input jumlah pemakaian listrik
        System.out.println("Masukkan pemakaian listrik (kWh): ");
        double kWh = input.nextDouble();

        double tarif = 0;

        //validasi kWh harus lebih dari 0
        if (kWh <= 0) {
            System.out.println("Error: Pemakaian listrik harus lebih dari 0 kWh.");
        } else {
            // menentukan tarif berdasarkan golongan daya
            if (daya == 450) {
                tarif = TARIF_450;
            } else if (daya == 900) {
                tarif = TARIF_900;
            } else if (daya == 1300) {
                tarif = TARIF_1300;
            } else if (daya == 2200) {
                tarif = TARIF_2200;
            } else if (daya > 2200) {
                tarif = TARIF_DIATAS_2200;
            } else {
                System.out.println("Error Golongan daya tidak valid.");
                return;
            }
            //menghitung total tagihan
            double totalTagihan = kWh * tarif;

            //menampilkan hasil
            System.out.println("\n=====RINCIAN TAGIHAN LISTRIK=====");
            System.out.println("Golongan Daya : " + daya + " VA");
            System.out.println("Pemakaian : " + kWh + " kWh");
            System.out.println("Tarif per kWh : Rp" + tarif);
            System.out.println("Total Tagihan : Rp" + totalTagihan);
            System.out.println("===================================");

        }
    }
}
