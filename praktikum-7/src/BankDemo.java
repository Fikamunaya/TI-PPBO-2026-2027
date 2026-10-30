public class BankDemo {
    public static void main(String[] args) {

        //membuat dua objek rekening bank
        RekeningBank rek1 = new RekeningBank("001", "Budi", "Tabungan",100000);
        RekeningBank rek2 = new RekeningBank("002","Siti", "Giro", 200000);

        //menguji setor pada masing-masing rekening
        System.out.println("=== UJI SETOR ===");
        rek1.setor(50000);
        rek2.setor(100000);

        //menguji tarik pada masing-masing rekening
        rek1.tarik(20000);
        rek2.tarik(50000);

        //menguji transfer berhasil
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferke(rek2, 30000);

        //menguji transfer yang gagal karena saldo tidak cukup
        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferke(rek2, 500000);

        //mencetak mutasi akhir rekening pertama
        System.out.println("\n=== MUTASI REKENING PERTAMA ===");
        rek1.cetakMutasi();

        //mencetak mutasi akhir rekening kedua
        System.out.println("\n=== MUTASI REKENING KEDUA ===");
        rek2.cetakMutasi();
    }
}
