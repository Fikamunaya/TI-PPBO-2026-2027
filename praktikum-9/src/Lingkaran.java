public class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(String namaBangun, double radius){
        super(namaBangun); //memanggil constructor dari class induk
        this.radius = radius; //menyimpan nilai jari2
    }

    //menghitung luas lingkaran
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    //menghitung keliling lingkaran
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
