import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter num :");
int num = sc.nextInt();
 System.out.println(" Enter num1 :");
int num1 = sc.nextInt();

                           System.out.println("Enter num2 :");
int num2 = sc.nextInt();
                    
        if(num>num1 && num>num2){
            System.out.println("Largest number is NUM");
        }
        else if(num1>num && num1>num2){
                System.out.println("Largest number is num1");
        }
        else {
            System.out.println("Largest Number is Num2");
        }
    }
}