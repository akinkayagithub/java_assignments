package assignment_solutions;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        Scanner print = new Scanner(System.in);

        System.out.println("Please enter three numbers");

        int number1 = print.nextInt();
        int number2 = print.nextInt();
        int number3 = print.nextInt();

        int maxOfThree = Math.max(Math.max(number1, number2), number3);
        int minOFThree = Math.min(Math.min(number1, number2), number3);

        System.out.println("Max value = " + maxOfThree);
        System.out.println("Min value = " + minOFThree);


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        System.out.println("Please enter five numbers");

        int numOne = print.nextInt();
        int numTwo = print.nextInt();
        int numThree = print.nextInt();
        int numFour = print.nextInt();
        int numFive = print.nextInt();

        int maxOfFive = Math.max(numFive,Math.max(Math.max(numOne, numTwo), Math.max(numThree, numFour)));
        int minOfFive = Math.min(numFive,Math.min(Math.min(numOne, numTwo), Math.min(numThree, numFour)));

        System.out.println("Max value = " + maxOfFive + "\nMin value = " + minOfFive);


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        System.out.println("Please Enter two numbers");

        int x = print.nextInt();
        int y = print.nextInt();
        int abs = Math.abs(x - y);

        System.out.println("The difference between numbers is = " + abs);


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        int num1 = (int)(Math.random() * 51) + 50;
        int num2 = (int)(Math.random() * 51) + 50;
        int num3 = (int)(Math.random() * 51) + 50;
        int sumOfNumbers = num1 + num2 + num3;

        System.out.println("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 +
                "\nThe sum of numbers is = " + sumOfNumbers);


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        double alexBal = 125.00;
        double mikeBal = 220.00;
        double transfer = 25.50;

        double alexSummary = (alexBal - transfer);
        double mikeSummary = (mikeBal + transfer);

        System.out.println("Alex's money: $" + alexSummary + "\nMike's money: $" + mikeSummary);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        double saveVal = 390;
        double perSav = 15.60;

        System.out.println((int)(saveVal / perSav));
    }
}
