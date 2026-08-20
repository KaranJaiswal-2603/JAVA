import java.util.Scanner;

public class exam{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the attendance percentage");
        int attendance= sc.nextInt();
        if( attendance>= 75){
            System.out.println("Eligible for exam fullfiling the attendance criteria");
        }
    }
}