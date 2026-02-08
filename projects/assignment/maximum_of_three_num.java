package projects.assignment;
import java.util.Scanner;

public class maximum_of_three_num {
    
    public static void main(String[] args){
        int a , b, c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        System.out.print("Enter third number : ");
        c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.print(a + " is maximum number .");
        }else if(b>=a && b>=c){
            System.out.print(b + " is maximum number .");
        }else{
            System.out.print(c + " is maximum number .");
        }

    }
    
}
