package BootCamp;

import java.util.Scanner;

public class test {
    /*
    -Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Create a Scanner object named scan.
Execution flow with example:
-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5
-Display prompt "Enter Item2 and its price:"
Cheese
3.5
-Display prompt "Enter Item3 and its price:"
Apples
6.3
-calculate totalPrice for all items
-build the report variable by concatenating Strings and double values:
"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"
- Print the value of report variable
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter the name");
        String s = scanner.nextLine();

        System.out.println(s);


    }
}
