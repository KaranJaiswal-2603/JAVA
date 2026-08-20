
import java.util.Scanner;

public class zero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("+ve Number");
        }
        else if(num<0) {
            System.out.println("-ve Number");
        }            
        else {
            System.out.println("Zero");
        }
        
    }
}