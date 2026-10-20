public class ProdukLatihanClass {
    public static void main(String[] args) {
        ProdukLatihan p1 = new ProdukLatihan("Cushion", 120000);
        ProdukLatihan p2 = new ProdukLatihan("Perfume", 80000);
        ProdukLatihan p3 = new ProdukLatihan("Lipstik", 200000);

        double batasHarga = 100000;

        System.out.println(p1.namaProduk + "mahal? " + p1.isMahal(batasHarga));
        System.out.println(p2.namaProduk + "mahal? " + p2.isMahal(batasHarga));
        System.out.println(p3.namaProduk + "mahal? " + p3.isMahal(batasHarga));
    }
}
