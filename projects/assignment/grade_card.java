package projects.assignment;
import java.util.Scanner;


public class grade_card {
    public static void main(String args[]){
          
    double marks;
    int maths, science, english, hindi, social_science;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of maths: ");
    maths = sc.nextInt();
    System.out.print("Enter marks of science: ");
    science = sc.nextInt();
    System.out.print("Enter marks of english: ");
    english = sc.nextInt();
    System.out.print("Enter marks of hindi: ");
    hindi = sc.nextInt();
    System.out.print("Enter marks of social science: ");
    social_science = sc.nextInt();

    marks = (maths+ science + english+ hindi + social_science)/5;
    System.out.println("percentage is : "+ marks);
    if(marks >= 90){
            System.out.print("Grade A");
        }
        else if(marks >= 75){
            System.out.print("Grade B");
        }
        else if(marks >= 60){
            System.out.print("Grade C");
        }
        else if(marks >= 40){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }

    }
    
}
