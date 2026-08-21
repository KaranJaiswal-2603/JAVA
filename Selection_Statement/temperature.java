import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature");
        int temp = sc.nextInt();
        if (temp <= 15){
            System.out.println("Cold");
        }
        else if(temp<=25 && temp >15){
            System.out.println("Normal");
        }
        else if(temp<=35 && temp>25){
            System.out.println("Warm");
        }
        else {
            System.out.println("Hot");
        }
    }
}
