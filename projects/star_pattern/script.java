
import java.util.Scanner;

public class script {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // for(int i=n ; i>=1 ; i--){
            for (int j = 1; j <= i; j++) {
                // for(int j=i ;j>=1; j--){
                System.out.print(num + " ");
                // System.out.print(i);
                // System.out.print();
                num++;
            }
            System.out.println();
        }
        int num1 = 1;
        for (int i = n-1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // for(int i=n ; i>=1 ; i--){
            for (int j = i; j >= 1; j--) {
                // for(int j=i ;j>=1; j--){
                System.out.print(num1 + " ");
                // System.out.print(i);
                // System.out.print();
                num1++;
            }
            System.out.println();
        }

    }
}
