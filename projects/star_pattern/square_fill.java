import java.util.Scanner;
public class square_fill{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*  ");

            }
            System.out.println();
        }
        
    }
}