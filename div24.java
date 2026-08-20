import java.util.Scanner;

public class div24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num %2 ==0){
            System.out.println("Number is divisible by 2");
            if(num%4 ==0){
                System.out.println("Number is Divisible by 4");
            }
            else {
                System.out.println("Number is Not Divisible by 4");
            }
        }
        else{
            System.out.println("Number is Not divisible by 2");
        }
    }
}
