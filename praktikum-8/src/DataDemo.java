public class DataDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Fika", "M001", 8000000, 2000000);
        Staff s = new Staff("Anin", "S001", 5000000, 1000000);
        Direktur d = new Direktur("Andi", "D001", 9500000, 5000000, 3000000);

        System.out.println("=== DATA MANAGER ===");
        m.tampilkanData();

        System.out.println("\n=== DATA STAFF ===");
        s.tampilkanData();

        System.out.println("\n=== DATA DIREKTUR ===");
        d.tampilkanData();
    }
}
