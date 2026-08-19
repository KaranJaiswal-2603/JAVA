import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int Num = sc.nextInt();
        if (Num > 0){
            System.out.println("Positive Number");
        }
        else if (Num<0){
            
            System.out.println("Negative Number");

        }
        else {
            System.out.println("Zero Number");
        }
    }
}
