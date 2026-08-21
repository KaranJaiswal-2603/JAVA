
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Excillent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
        }
    }
}
