import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author crazyne55
 */
public class Radians {
    private static double PI = 3.14159265359;
    public static double toRadians(double degrees) {
        // Pur your code here
        return degrees * PI / 180.0;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians / PI * 180.0 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println("--- results ---");
        System.out.printf("Our Method: %s\nMath Class: %s\n", toRadians(degrees), Math.toRadians(degrees));


        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println("--- results ---");
        System.out.printf("Our Method: %s\nMath Class: %s\n", toDegrees(degrees), Math.toDegrees(degrees));
    }
}
