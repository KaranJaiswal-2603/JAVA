import java.util.Scanner;

public class elec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit:");
        double unit = sc.nextDouble();
        if(unit <=20){
            System.out.println("Total Unit Consume:"+unit);
                System.out.println("Unit * 40 :");
                     System.out.println("Total Amount :"+ (unit*40));
        }
        else if(unit<= 50 && unit > 20){
            System.out.println("Total Unit Consume"+unit);
                System.out.println("Unit * 70:");
                    System.out.println("Total Amount :"+(unit*70));
        }
        else if(unit<=80 && unit> 50){
             System.out.println("Total Unit Consume"+unit);
                System.out.println("Unit * 85.5:");
                    System.out.println("Total Amount :"+(unit*85.5));
        }
        else {
              System.out.println("Total Unit Consume"+unit);
                System.out.println("Unit * 100:");
                    System.out.println("Total Amount :"+(unit*100));
        }
    }
}
