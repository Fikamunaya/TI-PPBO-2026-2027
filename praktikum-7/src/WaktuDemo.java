public class WaktuDemo {
    public void main(String[] args) {
        Waktu w1 = new Waktu(10,20,45);

        System.out.println("Jam : " + w1.getJam());
        System.out.println("Menit : " + w1.getMenit());
        System.out.println("Detik : " + w1.getDetik());
        System.out.println();

        w1.setJam(25);
        w1.setMenit(50);
        w1.setDetik(75);

        System.out.println();

        System.out.println("Setelah Validasi");
        System.out.println("Jam : " + w1.getJam());
        System.out.println("Menit : " + w1.getMenit());
        System.out.println("Detik : " + w1.getDetik());
    }
}
