import java.util.Scanner; 

public class discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();
        if (amount>= 5000){
            System.out.println("Discount 20 %");
            System.out.println("Discount amount"+(amount * 20)/ 100);
            System.out.println("Actual amount"+(((amount * 20)/100)-amount));
        }
        else if (amount>=3000 && amount<4999){
            System.out.println("Discount 15%");
            System.out.println("Discount amount"+(amount *15)/100);
            System.out.println("Actual Amount"+(((amount * 15)/100)-amount));
        }
        else if (amount>= 1000 && amount <= 2999){
            System.out.println("Discount 10%");
            System.out.println("Discount amount"+(amount *10)/100);
            System.out.println("Actual amount"+(((amount *10)/100)-amount));
        }
        else {
            System.out.println("No Discount");
        }

    }
}