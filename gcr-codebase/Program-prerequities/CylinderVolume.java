import java.util.Scanner;

public class CylinderVolume {

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Volume of the cylinder: " + volume);

        scanner.close();
    }
}
