package generics;
import java.util.Scanner;
public class MaxOfThreeIntergers {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers: ");
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();
            Integer z = scanner.nextInt();
            Integer max = -2147483648;
            int result = x.compareTo(max);
            if (result == 1) {
                max = x;
            }
            result = y.compareTo(max);
            if (result == 1) {
                max = y;
            }
            result = z.compareTo(max);
            if (result == 1) {
                max = z;
            }
            System.out.println("The max number is : " + max);
        }
    }

