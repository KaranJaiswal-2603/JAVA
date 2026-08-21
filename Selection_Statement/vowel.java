
import java.util.Scanner;

public class vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        char name = sc.next().charAt(0);
        if (name =='a' || name == 'e' || name == 'i' || name == 'o' || name == 'u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}