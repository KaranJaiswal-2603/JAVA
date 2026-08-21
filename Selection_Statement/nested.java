import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :");
        
        int age = sc.nextInt();

      
        if(age>=18){
               System.out.println("If Register Enter 1 If not 0");
             int registered = sc.nextInt();
            if(registered ==1){
                System.out.println("Eligible and register for vote");
            }
            else {
                System.out.println(" Eligible but Not register");
            }
            }
            else {
                System.out.println("Not Eligible");
            }
        }
    }

