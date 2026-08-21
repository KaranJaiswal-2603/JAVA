public class login {
    public static void main(String[] args) {
        int username = 101;
        int password = 1234;
        int correctusername = 11;
        int correctpassword = 134;
        if ( username== correctusername){
            System.out.println("user name is correct");
            if(password == correctpassword){
                System.out.println("Login Succefull");
            }
            else {
                System.out.println("Incorrect password");
            }

        }
        else {
            System.out.println("Incorrect username");
        }

    }
}
