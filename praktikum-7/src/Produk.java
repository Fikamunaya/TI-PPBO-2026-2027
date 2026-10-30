public class Produk {
    private String KodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.KodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    //getter

    public String getKodeProduk() {
        return KodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    //setter dengan validasi
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }

    //menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambah");
        } else {
            System.out.println("Jumlah penambahan harus positif");
        }
    }

    //mengurangi stok
    public void Kurangistok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan harus positif");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi");
        }
    }
}
