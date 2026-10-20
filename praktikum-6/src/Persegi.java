public class Persegi {
    double sisi;

    //contructor dengan parameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    //Method menghitung luas
    public double hitungLuas() {
        return  sisi * sisi;
    }

    //Method menghitung keliling
    public double hitungKeliling() {
        return  4 * sisi;
    }

    //tampilkan data
    public void tampilkanData() {
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}
