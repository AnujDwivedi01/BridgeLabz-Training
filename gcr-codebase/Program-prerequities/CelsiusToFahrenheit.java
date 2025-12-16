
import java.util.Scanner;

class CelsiusToFahrenheit {
    CelsiusToFahrenheit() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter temperature(in celcious)");
        int var2 = var1.nextInt();
        int var3 = var2 * 9 / 5 + 32;
        System.out.println(var3);
    }
}