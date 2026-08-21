import java.util.Scanner;

public class job {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>=21){
            System.out.println("Enter 1 if u are college passed not passed enter 0:");
            int qualification= sc.nextInt();
            if (qualification == 1){
                System.out.println("Eligible for job");
            }
            else {
                System.out.println("Not eligible for job due to qualification criteria");
            }
        }
        else{
            System.out.println("Not eligible "); 
        }
    }
}
