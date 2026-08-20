
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  marks:");
        int mark= sc.nextInt();
        if(mark >= 90){
        System.out.println("Grade A");
            if(mark>=80){
                System.out.println("Eligible for Schlor");
            }
        }
        else if (mark >= 70 && mark<90){
            System.out.println("Grade B");
            if(mark>=80){
                System.out.println("Eligible for Schlor");
            }
            else {
                System.out.println("Not Eligible for Scholor");
            }
        }
        else {
            System.out.println("Grade C");
        }
        
    }
}
