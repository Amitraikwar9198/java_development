
import java.util.Scanner;

public class number_pattern {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
               
                System.out.print(num + " ");
                
                num++;
            }
            System.out.println();
        }
        int num1 = 1;
        for (int i = n-2; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
           
            for (int j = i; j >= 1; j--) {
               
                System.out.print(num1 + " ");
                
                num1++;
            }
            System.out.println();
        }

    }
}
