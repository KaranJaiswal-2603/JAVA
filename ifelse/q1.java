import java.util.Scanner;
public  class q1{
    public static void main(String[]args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Write your number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else if (num<0){
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is zero");
        }
        sc.close();
    }

}
