package projects.assignment;
import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args){
        double si = 0;
        int p , r , t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p :");
        p = sc.nextInt();
        System.out.println("Enter the value of r :");
        r = sc.nextInt(); 
        System.out.println("Enter the value of t :");
        t = sc.nextInt();
        si = (p * r * t)/100;
        System.out.print("Simple Interest is : " + si);



    }
    
}
