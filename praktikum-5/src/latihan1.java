public class latihan1 {

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang : ");
        System.out.println(luasPersegiPanjang(10, 6));
        System.out.println(luasPersegiPanjang(9, 4));

        System.out.println("\nLuas Lingkaran : ");
        System.out.println(luasLingkaran(6));
        System.out.println(luasLingkaran(10));
    }
}
