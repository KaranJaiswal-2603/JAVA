import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int temp = sc.nextInt();
        if (temp <10){
                System.out.println("very cold");
        }
        else if(temp>= 10 && temp<25){
            System.out.println("Moderate");

        }
        else {
            System.out.println("hot");
        }
    }
}
