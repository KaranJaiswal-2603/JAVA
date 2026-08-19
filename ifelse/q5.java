import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("A is greater");
        }
        else if(a==b){
            System.out.println("A&B are equal");
        }
        else {
            System.out.println("B is greater ");
        }
    }
}
