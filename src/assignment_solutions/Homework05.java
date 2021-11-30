package assignment_solutions;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        String s1 = "5", s2 = "10", s3 = "12", s4 = "3";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);

        System.out.println("Sum of " + n1 + " and " + n2 + " is = " + (n1 + n2) +
                "\nProduct of " + n1 + " and " + n2 + " is = " + (n1 * n2) +
                "\nDivision of " + n1 + " and " + n2 + " is = " + ((double)n1 / (double)n2) +
                "\nSubtraction of " + n1 + " and " + n2 + " is = " + (n1 - n2) +
                "\nRemainder of " + n1 + " and " + n2 + " is = " + (n1 % n2) + "\n" +
                "\nSum of " + n3 + " and " + n4 + " is = " + (n3 + n4) +
                "\nProduct of " + n3 + " and " + n4 + " is = " + (n3 * n4) +
                "\nDivision of " + n3 + " and " + n4 + " is = " + (n3 / n4) +
                "\nSubtraction of " + n3 + " and " + n4 + " is = " + (n3 - n4) +
                "\nRemainder of " + n3 + " and " + n4 + " is = " + (n3 % n4));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        String str1 = "200";
        String str2 = "-50";

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println("The greatest value is = " + Math.max(i1, i2) + "\nThe smallest value is = " + (Math.min(i1, i2)) +
                "\nThe average of those is = " + ((i1 + i2) / 2) + "\nThe absolute difference of them = " + Math.abs(i1 - i2));


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        double quarters = 0.25;
        double dime = 0.10;
        double nickels = 0.05;
        double penny = 0.01;
        double dailySave = (3 * quarters) + (1 * dime) + (2 * nickels) + (1 * penny);

        System.out.println((int)(24 / dailySave) + "\n" + (int)(168 / dailySave) +
                "\n" + "$" + (double)(Math.round((30 * dailySave) * 10)) / 10 + "\n" + "$" + (150 * dailySave));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        double targetValue = 1250;
        double dailySave2 = 62.5;

        System.out.println((int) (targetValue / dailySave2));


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        double carPrice = 14_500;
        double optionOne = 475.50;
        double optionTwo = 951;

        double monthOne = carPrice / optionOne;
        double monthTwo = carPrice / optionTwo;

        System.out.println("Option 1 will take " + (int)monthOne + " months " +
                "\nOption 2 will take " + (int)monthTwo + " months ");


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 2 numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.println(number1 / number2);
    }
}
