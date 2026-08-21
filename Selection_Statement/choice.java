import java.util.Scanner;

public class choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");

        System.out.print("Enter your Choice : 1 , 2, 3 ,4 ");
        int choice = sc.nextInt();

        System.out.print("Enter A:");
        double  a = sc.nextDouble();

        System.out.print("Enter B:");
        double b = sc.nextDouble();

        switch(choice){
            case 1: 
                    System.out.println("result:"+(a+b));
                    break;
            case 2: 
                    System.out.println("result:"+(a-b));
                    break;
            case 3: 
                    System.out.println("result:"+(a*b));
                    break;
            case 4: 
                    System.out.println("result:"+(a/b));
                    break;
        }
    }
}
