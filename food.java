
import java.util.Scanner;

public class food {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Roll");
        System.out.println("2.chow");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Roll _ price is 50 $");
                break;
            case 2:
                System.out.println("Chow_price is 500$");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
