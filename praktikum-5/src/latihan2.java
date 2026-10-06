public class latihan2 {
    static boolean isprima(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Bilangan prima dari 1 sampai 50 : ");

        for (int i = 1; i <= 50 ; i++) {
            if (isprima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
