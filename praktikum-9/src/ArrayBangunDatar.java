public class ArrayBangunDatar {
    public static void main(String[] args) {
        BangunDatar[] hitungTotalLuas = {
                new Lingkaran("Lingkaran", 4),
                new Persegi("Persegi", 8),
                new Lingkaran("Lingkaran", 3),
        };

        double totalLuas = 0;
        for (BangunDatar bd : hitungTotalLuas) {
            double luas = bd.hitungLuas();
            System.out.println("Luas " + bd.nama + ": " + luas);
            totalLuas += luas;
        }

        System.out.println("Total Luas : " + totalLuas);
    }
}
