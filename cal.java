import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        double a = sc.nextDouble();
         System.out.println("Enter the number b");
        double b = sc.nextDouble();
        System.out.println("Enter a opertor to be perform:");
        char operator =sc.next().charAt(0);
        switch(operator){
            case '+' :
                System.out.println("result"+ (a+b));
                break;
            case '-' :
                System.out.println("result"+ (a-b));
                break;
            case '*' :
                System.out.println("result"+ (a*b));
                break;
            case '/' :
                System.out.println("result"+ (a/b));
                break;
        }

    }
}
