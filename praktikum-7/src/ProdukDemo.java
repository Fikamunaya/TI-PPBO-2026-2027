public class ProdukDemo {
    public static void main(String[] args) {
        Produk p1 = new Produk("p001", "Perfume", 200000, 10);

        System.out.println("Kode produk : " + p1.getKodeProduk());
        System.out.println("Nama produk : " + p1.getNamaProduk());
        System.out.println("Harga : " + p1.getHarga());
        System.out.println("Stok : " + p1.getStok());
        System.out.println();

        System.out.println("===Uji Validasi===");
        p1.setHarga(50000);
        p1.setHarga(-1000);

        p1.tambahStok(5);
        p1.tambahStok(-2);

        p1.Kurangistok(3);
        p1.Kurangistok(20);

        System.out.println();
        System.out.println("===Data Akhir===");
        System.out.println("Harga : " + p1.getHarga());
        System.out.println("Stok : " + p1.getStok());
    }
}
