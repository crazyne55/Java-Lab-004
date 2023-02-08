import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author crazyne55
 */
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int a) {
        return a*a;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer to square: ");
        int input = in.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int squared = square(input);
        // Put the result System.out code here.
        System.out.printf("result: %s\n",squared);
    }
}
