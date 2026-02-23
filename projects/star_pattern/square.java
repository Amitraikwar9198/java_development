import java.util.Scanner;
public class square{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
                System.out.print(n*i);
            System.out.println();
        }



    }
}