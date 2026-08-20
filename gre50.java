
import java.util.Scanner;

public class gre50{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num >= 50){
            System.out.println("Number is greater then 50");

        }
        else {
            System.out.print("Not Greater then 50");
        }
    }
}