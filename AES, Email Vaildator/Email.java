import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
 
class Email
{ 
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
       		String email = s.next();
 		if (check(email)) 
			System.out.print("The given  Email address " +email + " is valid");
       		else
            		System.out.print("The given Email address " +email + " is not valid");        
	}
    //regular expression
    private static final String email_rex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern email_pattern = Pattern.compile(email_rex);
    
    public static boolean check(String email)
    {
        if (email == null) 
            return false;
        Matcher m = email_pattern.matcher(email);
        return m.matches();
    }
 
  
}

/*


// Java program to check if an email address is valid
// using Apache module.
import org.apache.commons.validator.routines.EmailValidator;
 
//function to check if email address valid or not 
class EmailIDValidator {
    public static boolean emailValidator(String email)
    {
        //Getting  an EmailValidator 
        EmailValidator validator = EmailValidator.getInstance();
 
        if (!validator.isValid(email)) 
            return false;
         
        return true;
    }
 
    // driver function 
    public static void main(String[] args)
    {
        String email = "contribute@geeksforgeeks.org";
 
        if (emailValidator(email)) 
            System.out.print("The given  Email address " + 
                                      email + " is valid");
        else
            System.out.print("The given Email address " + 
                                  email + " is not valid");        
    }
}
*/
