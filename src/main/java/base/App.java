/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Scanner;
/*
Many programs display information to the end user in one form but use a different form inside the program.
For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color
or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.

Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges

Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int value = myApp.getValue();
        myApp.printMonth(value);
    }
    int getValue()
    {
        System.out.print("Please enter the number of the month: ");
        return in.nextInt();
    }
    void printMonth(int value)
    {
        String month = null;
        switch (value) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> {
                System.out.print("That number is not valid.");
                System.exit(-1);
            }
        }
        System.out.print("The name of the month is "+ month + ".");
    }
}
