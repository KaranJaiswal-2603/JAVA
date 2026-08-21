import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = sc.nextInt();
        if (marks>=33){
            System.out.println("Passed");
            if(marks >=75){
                System.out.println("Scored Distinction Marks");
            }
        }
        else {
            System.out.println("Failed");
        }
    }
}
