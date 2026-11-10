public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }
    public void tampilkanRingkasan() {
        System.out.println("Manager : " + nama); //Error Jika private
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }

    //b.getter tunjangan jabatan
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}
