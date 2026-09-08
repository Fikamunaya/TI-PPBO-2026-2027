import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //buat imputan suhu
        System.out.println("Masukkan suhu dalam Celcius: ");
        double celcius = sc.nextDouble();

        //menghitung fahrenheit dengan rumus
        double fahrenheit = celcius * 9/5 + 32;
        System.out.println("suhu fahrenheit: " + fahrenheit );

    }
}
