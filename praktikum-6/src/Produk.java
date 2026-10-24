public class Produk {
    //1. Mendeklarasikan atribut produk
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // 2. membuat constructor untuk mengisi seluruh atribut menggunakan this
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Membuat method untuk menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    //4. Membuat method untuk mengurangi stok produk
    public void kurangStok(int jumlah) {
        if (stok >= jumlah) {
            stok = stok - jumlah;
            System.out.println("Pembelian berhasil.");
            System.out.println("Sisa stok: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    // 5. Membuat method untuk menampilkan seluruh data produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok : " + stok);
        System.out.println("-----------------------------");
    }
}
