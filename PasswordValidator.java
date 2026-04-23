import java.util.Scanner;
public class PasswordValidator{
    public static boolean isValidPassword(String pass){
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        if(pass.length()<8){
            System.out.println("Password is too short.It must be at least 8 characters long.");
            return false;
        }
       for(int i = 0;i<pass.length();i++){
        char ch=pass.charAt(i);

        if(Character.isUpperCase(ch)){
            hasUpper=true;
        }

        if(Character.isLowerCase(ch)){
            hasLower=true;
        }
        if(Character.isDigit(ch)){
            hasDigit=true;
        }
       }
       if(!hasUpper)
          {
        System.out.println("Missing an uppercase letter");
          }

         if(!hasLower)
            {
            System.out.println("Missing a lowercase letter");
            }
         if(!hasDigit)
            {
            System.out.println("Missing a digit");
            }
         return hasUpper && hasLower && hasDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String pass;

       while(true) 
        {
        System.out.println("Enter Password: "); 
        pass = sc.nextLine();

        if (isValidPassword(pass))
            {
            System.out.println("Valid password.");
            break;
            
            }
            else
                {
            System.out.println("Invalid password.");
                }
            }
        sc.close();
    }
}
