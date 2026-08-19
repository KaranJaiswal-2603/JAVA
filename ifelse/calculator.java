public class calculator {
    public static void main(String[] args) {
        double a = 15;
        double b = 10;
        char op='+';
        switch (op){
            case  '+':
                System.out.println(+(a+b));
                break;
            case '-':
                System.out.println(+(a-b));
                break;
            case '*':
                System.out.println(+(a*b));
                break;
            case '/':
                System.out.println(+(a/b));
                break;
            default:
                System.out.println("Invalid");
                break;


        }
    }
}
