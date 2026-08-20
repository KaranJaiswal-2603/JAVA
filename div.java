import java.util.Scanner;
public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double num = sc.nextInt();
        if (num%5 == 0){
            System.out.println("Number is divisible by 5");
        }
    }
}
