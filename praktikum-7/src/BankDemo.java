public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek = new RekeningBank("001", "Budi", 100000);

        rek.setor(50000);
        rek.tarik(30000);
        rek.tarik(500000); //seharusnya ditolak
        rek.setor(-1000); //seharusnya ditolak

        System.out.println("Saldo Akhir : " + rek.getSaldo());
    }
}
