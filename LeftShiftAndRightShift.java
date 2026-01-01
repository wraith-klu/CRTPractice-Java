import java.util.Scanner;

public class LeftShiftAndRightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter number of positions to shift: ");
        int positions = scanner.nextInt();

        int leftShiftResult = leftShift(number, positions);
        System.out.println("Left Shift Result: " + leftShiftResult);

        int rightShiftResult = rightShift(number, positions);
        System.out.println("Right Shift Result: " + rightShiftResult);
        scanner.close();
    }
    public static int leftShift(int number, int positions) {
        int result = number << positions;
        return result;
    }
    public static int rightShift(int number, int positions) {
        int result = number >> positions;
        return result;
    }
}
