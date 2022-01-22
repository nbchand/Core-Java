/*
h) Write a program for the restaurant console application. At first, an application
prints the menu for the items along with their prices and allows the customer to
choose from the list by taking input from the keyboard. Based on the customer’s
inputs, print the chosen items and total price.
For example: Let's say following is the list of items
1. Mo:Mo Chicken 150
2. Mo:Mo Buff 120
3. Mo:Mo Veg 100
4. Burger Chicken 150
If the customer chosen two items as Mo:Mo Chicken and Burger Chicken
then the console output should be as follows:
Chosen items:
1. Mo:Mo Chicken 150
2. Burger Chicken 150
Total price 300
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class RestaurantApp {
    /**
     * Displays a restaurant menu where users can select one or more items
     * after which the total cost of the order will be displayed.
     */
    public static void performTask() {

        Scanner scanner = new Scanner(System.in);

        //displays menu
        System.out.println("\t\tOur Menu");
        System.out.println("1. Mo:Mo Chicken 150\n2. Mo:Mo Buff 120\n3. Mo:Mo Veg 100\n4. Burger Chicken 150");
        System.out.println("\nHow many items do you want?");

        //takes input about no. of items
        int noOfItems = scanner.nextInt();
        //initializes an array of choices
        int choice[] = new int[noOfItems];

        //executes only if no. of items chosen is greater than 0 and less than 5
        if(noOfItems>0 && noOfItems<5){

            //loop to take input from user which lets them choose one or multiple items from menu
            for(int i=0;i<noOfItems;i++){
                System.out.println("Press item number displayed on the screen:");
                choice[i]=scanner.nextInt();
            }

            //displays chosen items along with their price as well as total price of the order
            System.out.println("\nChosen items:");
            int totalPrice = 0;

            //loop to display multiple choices of user
            for(int i=0;i<noOfItems;i++){
                switch (choice[i]){
                    case 1:
                        totalPrice=totalPrice+150;
                        System.out.println((i+1)+" Mo:Mo Chicken 150");
                        break;
                    case 2:
                        totalPrice=totalPrice+120;
                        System.out.println((i+1)+" Mo:Mo Buff 120");
                        break;
                    case 3:
                        totalPrice=totalPrice+100;
                        System.out.println((i+1)+" Mo:Mo Veg 100");
                        break;
                    case 4:
                        totalPrice=totalPrice+150;
                        System.out.println((i+1)+" Burger Chicken 150");
                        break;
                    default:
                        System.out.println((i+1)+" Invalid input");

                }
            }

            System.out.println("\tTotal price "+totalPrice);
        }
        else {
            System.out.println("Please enter a number greater than 0 and less than 5");
        }
        scanner.close();
    }
}
