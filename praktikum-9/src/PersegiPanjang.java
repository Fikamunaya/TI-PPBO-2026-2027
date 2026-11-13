public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(String namaBangun, double panjang, double lebar){
        super(namaBangun); //memanggil constructor dari class induk
        this.panjang = panjang; //menyimpan nilai panjang
        this.lebar = lebar; //menyimpan nilai lebar
    }

    //menghitung luas persegi panjang
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    //menghitung keliling persegi panjang
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
