/*
o) Show 5 options to user
i) CREATE , READ , UPDATE , DELETE
ii) Let user choose any one of the option
iii) Under every option ask user the number of times
iv) Print the option name to the number of times that user enters.
v) If a user enters the option which is not in the option list display TRY
AGAIN !!
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class Crud {
    /**
     * Displays a list of options and asks user to choose one.
     * User then needs to provide the no. of iteration for which
     * the chosen option will be displayed.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //displays all the available options
        System.out.println("Select an option");
        System.out.println("1.CREATE\n2.READ\n3.UPDATE\n4.DELETE");
        System.out.println("\nEnter your choice:");
        //takes choice of user as input
        int choice = scanner.nextInt();
        System.out.println("How many times do you want it to display");
        //takes the number of iteration as input
        int iteration = scanner.nextInt();

        //loop to display the chosen option one or times
        for(int i=1;i<=iteration;i++){

            //initializes flag for future use
            int flag = 0;

            //executes the case which user provided as a choice
            switch (choice){
                case 1:
                    System.out.println("CREATE");
                    break;
                case 2:
                    System.out.println("READ");
                    break;
                case 3:
                    System.out.println("UPDATE");
                    break;
                case 4:
                    System.out.println("DELETE");
                    break;
                default:
                    System.out.println("TRY AGAIN!!");
                    flag++;
            }

            //condition when user enters an option which is not present in the list
            //this will eventually end the program as user has entered a wrong choice
            if(flag!=0){
                break;
            }
        }

        scanner.close();
    }
}
