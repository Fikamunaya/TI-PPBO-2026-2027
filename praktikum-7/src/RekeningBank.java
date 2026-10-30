public class RekeningBank {
    //atribut rekening
    private String nomorRekening;
    private String pemilik;
    private double saldo;

    //1. menambah atribut jenisRekening yang bersifat read-only
    private String jenisRekening;

    //constructor untuk mengisi data rekening
    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    //getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo : " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo : " + saldo);
        }
    }

    //2. Method untuk transfer saldo ke rekening tujuan
    public void transferke(RekeningBank tujuan, double jumlah) {
        //validasi jumlah transfer harus positif
        if (jumlah <= 0) {
            System.out.println("Transfer gagal! jumlah transfer harus lebih dari 0");
        }
        //validasi saldo pengirim harus mencukupi
        else if (jumlah > saldo) {
            System.out.println("Transfer gagal! saldo tidak mencukupi");
        }
        //validasi transfer jika semua validasi terpenuhi
        else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil!");
            System.out.println("Jumlah transfer : " + jumlah);
        }
    }

    // 3. method untuk mencetak laporan mutasi rekening
    public void cetakMutasi() {
        System.out.println("====== MUTASI REKENING =====");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat Ini : " + saldo);
        System.out.println("=============================");
    }
}
