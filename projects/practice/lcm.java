import java.util.Scanner;
public class lcm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm;

        // Start from the greater number
        for (lcm = (n1 > n2) ? n1 : n2; lcm <= n1 * n2; lcm++) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
        }

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
    }
}