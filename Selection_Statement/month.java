
import java.util.Scanner;

public class month{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("Jan");
        }
        else if (num == 2){
            System.out.println("feb");
        }
        else if (num == 3){
            System.out.println("march");

        }
        else if (num == 4){
            System.out.println("april");
        }
        else if (num == 5){
            System.out.println("may");
        }
        else if (num == 6){
            System.out.println("june");
        }
        else if (num == 7){
            System.out.println("july");
        }
        else if (num == 8){
            System.out.println("aug");
        }
        else if(num == 9){
            System.out.println("Sep");
        }
        else if(num == 10){
            System.out.println("oct");
        }
        else if (num == 11){
            System.out.println("nov");
        }
        else if (num ==12){
            System.out.println("dec");
        }
        else {
            System.out.println("Invalid");
        }
    }
}