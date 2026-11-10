public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }

    //c. menambah method gettunjangankinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }
}