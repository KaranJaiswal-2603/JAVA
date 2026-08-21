import java.util.Scanner;

public class classified{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age<= 12){
            System.out.println("Child");
        }
        else if( age>=13 && age<19 ){
            System.out.println("Teenage");
        }
        else if (age>=20 && age<60){
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");
        }
    }
}