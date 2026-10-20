public class BukuClass {
    public static void main(String[] args) {

        //method menampilkan data
        Buku b1 = new Buku("Langit Biru", "Fika Munaya", 2024);
        Buku b2 = new Buku("Angin Hujan", "Rosy Yunila", 2007);

        b1.tampilkanData();
            System.out.println("---");

        b2.tampilkanData();
    }
}
