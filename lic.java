
import java.util.Scanner;

public class lic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("Eligible for drive lic");
        }
        else {
            System.out.println("Not Eligible for drive Lic");
        }
    }
}