
import java.util.Scanner;

public  class uppercase{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character");
    char name = sc.next().charAt(0);
    if (name >= 'A' && name <= 'Z'){
        System.out.println("CHARACTER IS IN UPPERCASE AT 0 INDEX");
    }
}
}