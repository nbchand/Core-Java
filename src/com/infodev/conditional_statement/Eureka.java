/*
n) Apply the following conditions in a if statement after taking a number and a string
input from user
i) Number should be exactly divisible by 2
ii) The length of string should be between 5 to 10
iii) The string’s first letter should start from ‘a’ or ‘b’ or ‘s’ or ‘p’ regardless
of case. It may be upper or lower case
iv) The string should not contain any of given characters ‘x’ or ’y’ or’ z’
v) The number should be between 2 and 4 digits
vi) The number should always starts with odd digits
vii) Display “Eureka” if all conditions are matched !!!
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class Eureka {
    /**
     * Takes two inputs, one string and one integer. Checks various conditions
     * and prints 'Eureka' if all conditions are matched otherwise prints the
     * reason for failed conditions.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //take input
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        //extra nextLine() to consume the '\n'
        scanner.nextLine();
        System.out.println("Enter a String:");
        String name = scanner.nextLine();

        //extract the first letter of the string
        char firstLetter = name.toLowerCase().charAt(0);
        //convert the number to string
        String numString = String.valueOf(num);
        //calculate the length of the number
        int numLength = numString.length();
        //find the starting digit of the number
        int firstNum = Character.getNumericValue(numString.charAt(0));

        //checks if the number is even or not
        if(num%2!=0){
            System.out.println("Number is not exactly divisible by 2");
            return;
        }
        //checks if the length of the string is between 5 and 10
        if(name.length()<5||name.length()>10){
            System.out.println("The length of string should be between 5 and 10");
            return;
        }
        //checks if the string contains first letters as a,b,s or p
        if(firstLetter!='a' && firstLetter!='b' && firstLetter!='s' && firstLetter!='p'){
            System.out.println("First letter of the string must be a,b,s or p");
            return;
        }
        //checks if the string contains the characters 'x','y' or 'z'
        if(name.contains("x")||name.contains("y")||name.contains("z")){
            System.out.println("String can't contain the letters x,y or z");
            return;
        }
        //checks if the number contains 2-4 digits or not
        if(numLength<2||numLength>4){
            System.out.println("Number must contain at least 2 digits or at most 4 digits");
            return;
        }
        //checks if the starting digit of the number is odd or not
        if(firstNum%2 == 0){
            System.out.println("The number must start with an odd digit");
            return;
        }

        //prints Eureka after all condition are matched
        System.out.println("Eureka");
        scanner.close();
    }
}
