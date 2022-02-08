/*
30. Write a Java method to check whether a string is a valid password
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Input a password (You are agreeing to the above Terms and Conditions.):
abcd1234
Password is valid: abcd1234  //this is wrong because password only has 8 characters making it invalid.
 */
package com.infodev.function;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class Password {
    /**
     * Checks whether a password is valid or not
     * @param password password to be validated
     * @return boolean about validity
     */
    public static boolean isPasswordValid(String password) {
        /*
        regex for a password with at least ten characters, consisting of only letters and digits
        as well as containing at least two digits.

        (?=(.*\d){2}) - uses lookahead (?=) and says the password must contain at least 2 digits
        [0-9a-zA-Z] - dictates the allowed characters
        {10} - says the password must be 10 characters long
         */
        final String PASSWORD_REGEX = "^(?=(.*\\d){2})[0-9a-zA-Z]{10}";
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**
     * Takes a password as input and validates given conditions
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password rules:\n" +
                "A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits.\n" +
                "Input a password (You are agreeing to the above Terms and Conditions.):");
        String password = scanner.next();
        if (isPasswordValid(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid");
        }
        scanner.close();
    }
}
