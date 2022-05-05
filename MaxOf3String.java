package generics;
import java.util.Scanner;
public class MaxOf3String {
             public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three strings: ");
            String x = scanner.next();
            String y = scanner.next();
            String z = scanner.next();
            String max = "";
            int result = x.compareTo(max);
            if (result > 1) {
                max = x;
            }
            result = y.compareTo(max);
            if (result > 1) {
                max = y;
            }
            result = z.compareTo(max);
            if (result > 1) {
                max = z;
            }
            System.out.println("The max String is : " + max);
        }
    }



