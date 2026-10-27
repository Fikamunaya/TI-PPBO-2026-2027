public class LatihanClass {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Siti", "111", 3.5); //berparameter

        m1.ipk = 9.9; //seharusnya tidak masuk akal, ipk maksimal 4.0
        m1.nim = ""; //nim kosong, seharusnya tidak valid

        System.out.println(m1.ipk); //program tetap menerima nilai yang salah

    }
}
