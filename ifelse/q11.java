import java.util.Scanner;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        double a = sc.nextInt();
        System.out.println("Enter Secound Number");
        double b = sc.nextInt();
        System.out.println("Enter operator ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}