public class TokoDemo {
    public static void main(String[] args) {

        //1. membuat array of object produk yang berisi 5 produk berbeda
        Produk[] daftarProduk = {
                new Produk("P001", "Buku Gambar", 20000, 12),
                new Produk("P002", "Pensil Warna", 15000, 20),
                new Produk("P003", "Mouse", 50000, 14),
                new Produk("P004", "Earphone", 45000, 7),
                new Produk("P005", "Jam Tangan", 70000, 18)
        };

        // 2. Menampilkan seluruh data produk menggunakan perulangan
        System.out.println("=== DAFTAR PRODUK TOKO ===");

        for (Produk p : daftarProduk) {
            p.tampilkanData();
        }

        // 3. Mensimulasikan pembelian produk pertama dengan stok mencukupi
        System.out.println("\n === PEMBELIAN PRODUK PERTAMA ===");

        int jumlahBeli1 = 2;

        System.out.println("Nama Produk: " + daftarProduk[0].namaProduk);
        System.out.println("Jumlah Beli: " + jumlahBeli1);
        System.out.println("Total Harga: Rp" + daftarProduk[0].hitungTotalHarga(jumlahBeli1));

        daftarProduk[0].kurangStok(jumlahBeli1);

        // 4. Mensimulasikan pembelian produk kedua dengan stok tidak mencukupi
        System.out.println("\n === PEMBELIAN PRODUK Kedua ===");

        int jumlahBeli2 = 25;

        System.out.println("Nama Produk: " + daftarProduk[1].namaProduk);
        System.out.println("Jumlah Beli: " + jumlahBeli2);
        System.out.println("Total Harga: Rp" + daftarProduk[1].hitungTotalHarga(jumlahBeli2));

        daftarProduk[1].kurangStok(jumlahBeli2);

        //5. Mencari produk dengan harga termahal menggunakan perulangan
        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL ===");

        Produk produkTermahal = daftarProduk[0];

        for (Produk p : daftarProduk) {
            if (p.harga > produkTermahal.harga) {
                produkTermahal = p;
            }
        }

        //6. Menampilkan data produk dengan harga termahal
        produkTermahal.tampilkanData();
    }
}
