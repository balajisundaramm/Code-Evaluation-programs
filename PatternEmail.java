package com.interiewQuestions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Balaji on 7/11/17.
 */
public class PatternEmail {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._,%+-=]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                    Pattern.CASE_INSENSITIVE);
	/* ^--> shows line beginning
	   []-->you can create a word
	   [A-Z]-->capital letters only allowed in the word
	[0-9]--> digits only allowed in the word
	[.,-+_]--> these special characters only allowed 
	+@--> word should be followed by @(*mandatory)
	[]--> the same
	\\.--> followed by .(mandatory)
	[a-z]{2,6}--> word must contain letters only and must be within 2 character to 6 characters
	$--> shows line ending.. 

	*/


    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }


    public static void main(String[] args) {
        String email="B,=@ytr.codfgh";
        System.out.println(validate(email));
    }
}
