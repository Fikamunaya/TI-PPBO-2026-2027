import java.util.Scanner;

public class KlasifikasiBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        tinggi = tinggi / 100;
        double bmi = berat / (tinggi * tinggi);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori Gemuk");
        } else {
            System.out.println("Kategori Obesitas");
        }
    }
}
