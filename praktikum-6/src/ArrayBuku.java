public class ArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[4];

        daftarBuku[0] = new Buku("Matahari Bersinar", "Humaira Azzahra", 2020);
        daftarBuku[1] = new Buku("Bulan di Malam Hari", "Siti Maryam", 2022);
        daftarBuku[2] = new Buku("Menangis di Tepi Danau", "Aisyah Andini", 2018);
        daftarBuku[3] = new Buku("Cinta Yang Terlupakan", "Khaira Dina", 2012);

        System.out.println("Buku yang terbit setelah tahun 2015 : ");

        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit > 2015) {
                System.out.println(buku.judul);
            }
        }
    }
}
