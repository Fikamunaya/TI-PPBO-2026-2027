public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok, double tunjanganSaham){
        super(nama, nip, gajiPokok, tunjanganSaham);
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham; //untuk memanggil versi manager
    }
}
