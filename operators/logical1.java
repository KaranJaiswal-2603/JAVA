public class logical1 {
 public static void main(String[] args) {
    int age= 19;
    boolean citizen = true; // as because in && both condition must be if one is false then the outcomes will be false
    boolean eligible = age >=18 && citizen;
    System.out.println(eligible);
 }   
}
