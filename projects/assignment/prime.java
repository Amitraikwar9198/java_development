package projects.assignment;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;
        int counter= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (i==2 || i % 2 == 1) {
                System.out.println("prime num: " + i);
                if(i==2){
                    counter++;
                }
                else if(i%2==1){
                    counter++;
                }
            }

        }
        System.out.println("total prime num: " + counter);
    }

}
