
import java.util.Scanner;

public class larges{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is largest");
        
        }
        else if (b>a && b>c){
            System.out.print("B is largest");

        }
        else {
            System.out.print("C is largest");
        }
    }
}