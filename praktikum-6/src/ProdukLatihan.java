public class ProdukLatihan {
    String namaProduk;
    double harga;

    //Contructor dengan parameter
    public ProdukLatihan (String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    //method mengecek apakah harga melebihi batas
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
