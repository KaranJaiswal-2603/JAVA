import java.util.Scanner;

public class smaller{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number num:");
        int num = sc.nextInt();
            System.out.println("Enter the number num1");
            int num1 = sc.nextInt();
                System.out.println("Enter the number num3");
                int num2 = sc.nextInt();
        
        if(num<num1 && num<num2){
                System.out.println("Num is smallest number");
        }
        else if (num1<num && num1<num2){
                System.out.println("Num1 is smallest number");
        }
        else{
                System.out.println("Num2 is smallest number");
        }
    }
}
