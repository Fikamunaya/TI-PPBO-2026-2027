public class BangunDatar {
    //a. menambah nama bangun, atribut protected agar dapat diakses oleh subclass
    protected String namaBangun;

    //Constructor untuk mengisi nama bangun datar
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // method untuk menghitung luas, akan di-override oleh subclass
    public double hitungLuas() {
        return 0;
    }

    //a. menambah method hitungKeliling
    public double hitungKeliling() {
        return 0;
    }

    //c. menambah method memanggil hitungLuas() dan hitungKeliling()
    public void tampilkanInfo(){
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.println("Hitung Luas : " + hitungLuas());
        System.out.println("Hitung Keliling : " + hitungKeliling());
    }
}
