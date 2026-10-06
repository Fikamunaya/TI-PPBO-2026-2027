public class latihan3 {

    static double konversiSuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celcius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celcius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Celcius ke Fahrenheit : " + konversiSuhu(25));
        System.out.println("Celcius ke Kevin : " + konversiSuhu(25, "Kelvin"));
        System.out.println("Celcius ke Fahrenheit : " + konversiSuhu(25, "Fahrenheit"));
    }
}
