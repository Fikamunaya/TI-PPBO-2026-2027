public class ArrayBangunDatar {
    public static void main(String[] args) {

        //membuat array untuk menyimpan beberapa objek bangun datar
        BangunDatar[] daftarBangunDatar = {
                new Lingkaran("Lingkaran", 4),
                new Persegi("Persegi", 8),
                new Lingkaran("Lingkaran", 3),
                new PersegiPanjang("Persegi Panjang", 6, 3),
                new PersegiPanjang("Persegi Panjang", 20, 10),
        };

        //variabel untuk menghitung total luas seluruh bangun datar
        double totalLuas = 0;

        //menentukan objek pertama sebagai bangun dengan luas terbesar sementara
        BangunDatar bangunTerbesar = daftarBangunDatar[0];

        System.out.println("====== INFORMASI BANGUN DATAR ======");
        for (BangunDatar bd : daftarBangunDatar) {
            bd.tampilkanInfo();
            totalLuas += bd.hitungLuas();

            //memeriksa apakah luas bangun saat ini lebih besar drpd luas bangun sebelumnya
            if (bd.hitungLuas() > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bd;
            }

            System.out.println("====================================");
        }

        //menampilkan hasil total luas seluruh bangun datar
        System.out.println("Total Luas : " + totalLuas);
        System.out.println();
        //menampilkan informasi bangun datar dengan luas terbesar
        System.out.println("Bangun Dengan Luas Terbesar");
        bangunTerbesar.tampilkanInfo();
    }
}
