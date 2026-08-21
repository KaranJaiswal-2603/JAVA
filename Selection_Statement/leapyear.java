import java.util.Scanner;

public class leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if ( year % 400 == 0 || year%4 == 0 && year%100 !=0){ // year 400 se divide hoga  agar remainder 0 aaya toh leap year nahi aaya toh 4 se divide hoga 0 aaya and year 100 se divide hua 0 nahi aaya tab leap year hoga warna nahi hoga  yeh 2 method hai check karna ka pahela wlaa 000 ke liye baaki sab baaki year ke liye
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}