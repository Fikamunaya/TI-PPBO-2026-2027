public class SiswaDemo {
    public static void main(String[] args) {

        Siswa s1 = new Siswa(90);

        System.out.println("Nilai : " + s1.getNilai());
        System.out.println("Nilai Huruf : " + s1.getNilaiHuruf());
        System.out.println();

        s1 = new Siswa(75);

        System.out.println("Nilai : " + s1.getNilai());
        System.out.println("Nilai Huruf : " + s1.getNilaiHuruf());
        System.out.println();

        s1 = new Siswa(120);
    }
}
