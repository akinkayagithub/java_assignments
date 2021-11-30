package assignment_solutions;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        int num1 = myScanner.nextInt(), num2 = myScanner.nextInt();

        System.out.println("The average of the given 2 numbers is: " + (num1 + num2) / 2);


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        System.out.println("Please enter two numbers: ");
        int n1 = myScanner.nextInt(), n2 = myScanner.nextInt();

        System.out.println("The product of the given 2 numbers is: " + (n1 * n2));


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        System.out.println("Please enter three numbers: ");
        int i1 = myScanner.nextInt(), i2 = myScanner.nextInt(), i3 = myScanner.nextInt();

        System.out.println("The " + i1 + " multiplied by " + i1 + " is = " + (i1 * i1));
        System.out.println("The " + i2 + " multiplied by " + i2 + " is = " + (i2 * i2));
        System.out.println("The " + i3 + " multiplied by " + i3 + " is = " + (i3 * i3));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        System.out.println("Please enter two numbers: ");
        int a1 = myScanner.nextInt(), a2 = myScanner.nextInt();

        System.out.println("The remainder of " + a1 + " % " + a2 + " is = " + (a1 % a2));


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        System.out.println("Please enter five numbers: ");
        int b1 = myScanner.nextInt(), b2 = myScanner.nextInt(), b3 = myScanner.nextInt(), b4 = myScanner.nextInt(), b5 = myScanner.nextInt();

        System.out.println("The average of the given 5 numbers is: " + (b1 + b2 + b3 + b4 + b5) / 5);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        System.out.println("Please enter a number: ");
        int num = myScanner.nextInt();
        int start = 1;

        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start++));
        System.out.println(num + " * " + start + " = " + (num * start));


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        System.out.println("Enter side length of a square: ");
        int side = myScanner.nextInt();

        System.out.println("Perimeter of the square = " + (4 * side));
        System.out.println("Area of the square = " + (side * side));
    }
}
