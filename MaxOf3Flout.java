package generics;
import java.util.Scanner;
public class MaxOf3Flout {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers: ");
            Float x = scanner.nextFloat();
            Float y = scanner.nextFloat();
            Float z = scanner.nextFloat();
            Float max = 0.0f;
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

