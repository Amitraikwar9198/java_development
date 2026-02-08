package projects.assignment;
import java.util.Scanner;
public class check_even_odd {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an even Number.");

        }else{
            System.out.println(num + " is an odd Number.");
        }

    }

    
}
