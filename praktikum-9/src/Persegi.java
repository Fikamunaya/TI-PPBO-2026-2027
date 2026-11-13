public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(String namaBangun, double sisi) {
        super(namaBangun); //memanggil constructor dari class induk
        this.sisi = sisi; //menyimpan nilai sisi
    }

    //menghitung luas persegi
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    //menghitung keliling persegi
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
