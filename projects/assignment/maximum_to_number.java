package projects.assignment;
import java.util.Scanner;
public class maximum_to_number {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter Second number :");
        b = sc.nextInt();
        if(a>b){
            System.out.print(a + " : is maximum number");

        }else{
            System.out.print(b + " : is maximum number");
        }


    }
    
}
