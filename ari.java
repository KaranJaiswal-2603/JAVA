
import java.util.Scanner;

public class ari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a:");
        double a = sc.nextDouble();
        System.out.println("Enter the b :");
        double b = sc.nextDouble();
        System.out.println("1. +");
        System.out.println("2.-");
        System.out.println("3./");
        System.out.println("4.*");
    int choice = sc.nextInt();
        
        switch(choice){
            case 1: 
                System.out.println("result"+ (a+b));
                break;
            case 2:
                System.out.println("result"+(a-b));
                break;
            case 3:
                System.out.println("Result"+(a/b));
                break;
            case 4:
                 System.out.println("Result"+(a*b));
                 break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
