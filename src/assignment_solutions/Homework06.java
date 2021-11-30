package assignment_solutions;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        int n1 = (int) (Math.random() * 11);
        int n2 = (int) (Math.random() * 11);
        int n3 = (int) (Math.random() * 11);
        int n4 = (int) (Math.random() * 11);
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);
        System.out.println("Number 4 = " + n4);
        System.out.println("Absolute difference of " + n1 + " with 5 is = " + Math.abs(n1 - 5));
        System.out.println("Absolute difference of " + n2 + " with 5 is = " + Math.abs(n2 - 5));
        System.out.println("Absolute difference of " + n3 + " with 5 is = " + Math.abs(n3 - 5));
        System.out.println("Absolute difference of " + n4 + " with 5 is = " + Math.abs(n4 - 5));
        System.out.println("Greatest number is = " + Math.max(Math.max(n1, n2), Math.max(n3, n4)));
        System.out.println("Smallest number is = " + Math.min(Math.min(n1, n2), Math.min(n3, n4)));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        int num1 = (int)((Math.random() * 101) - 50);
        int num2 = (int)((Math.random() * 101) - 50);
        int num3 = (int)((Math.random() * 101) - 50);
        int num4 = (int)((Math.random() * 101) - 50);
        int num5 = (int)((Math.random() * 101) - 50);
        int num6 = (int)((Math.random() * 101) - 50);
        int num7 = (int)((Math.random() * 101) - 50);
        int num8 = (int)((Math.random() * 101) - 50);

        int maxOf8 = Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), Math.max(Math.max(num5, num6), Math.max(num7, num8)));
        int minOf8 = Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), Math.min(Math.min(num5, num6), Math.min(num7, num8)));


        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);
        System.out.println("Number 8 = " + num8);
        System.out.println("Greatest number is = " + maxOf8);
        System.out.println("Smallest number is = " + minOf8);
        System.out.println("Average of 8 numbers is = " + (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + Math.abs(maxOf8 - minOf8));
        System.out.println("3rd number is positive = " + (num3 > 0));
        System.out.println("5th number is negative = " + (num5 < 0));

        boolean anyNumberZero = num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0;
        System.out.println("There is at least one zero among those numbers is = " + anyNumberZero);


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter seven numbers between 0 and 50 both included: ");
        int in1 = myScanner.nextInt();
        int in2 = myScanner.nextInt();
        int in3 = myScanner.nextInt();
        int in4 = myScanner.nextInt();
        int in5 = myScanner.nextInt();
        int in6 = myScanner.nextInt();
        int in7 = myScanner.nextInt();

        System.out.println("Number 1 = " + in1);
        System.out.println("Number 2 = " + in2);
        System.out.println("Number 3 = " + in3);
        System.out.println("Number 4 = " + in4);
        System.out.println("Number 5 = " + in5);
        System.out.println("Number 6 = " + in6);
        System.out.println("Number 7 = " + in7);

        int maxOf7 = Math.max(Math.max(Math.max(in1, in2), Math.max(in3, in4)), Math.max(Math.max(in5, in6), in7));
        int minOf7 = Math.min(Math.min(Math.min(in1, in2), Math.min(in3, in4)), Math.min(Math.min(in5, in6), in7));
        System.out.println("Greatest number is = " + maxOf7);
        System.out.println("Smallest number is = " + minOf7);
        System.out.println("Average of 7 numbers is = " + (in1 + in2 + in3 + in4 + in5 + in6 + in7) / 7);
        System.out.println("First number is greater than or equal to 10 = " + (in1 >= 10));
        System.out.println("Last number is less than or equal to 40 = " + (in7 <= 40));
        System.out.println("Both first and last numbers are greater than 25 = " + (in1 > 25 && in7 > 25));

        boolean anyNumber0or50 = in1 == 0 || in1 == 50 || in2 == 0 || in2 == 50 || in3 == 0 || in3 == 50 || in4 == 0 || in4 == 50 ||
                in5 == 0 || in5 == 50 || in6 == 0 || in6 == 50 || in7 == 0 || in7 == 50;

        System.out.println("At least one of those numbers is 0 or 50 = " + anyNumber0or50);

        boolean noNumberBetween40and50 = in1 <= 39 && in2 <= 39 && in3 <= 39 && in4 <= 39 && in5 <= 39 && in6 <= 39 && in7 <= 39;
        System.out.println("There is no number between 40 and 50 = " + noNumberBetween40and50);


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        int i1 = (int) (Math.random() * 101);
        int i2 = (int) (Math.random() * 101);
        int i3 = (int) (Math.random() * 101);

        System.out.println("Number1 is = " + i1);
        System.out.println("Number2 is = " + i2);
        System.out.println("Number3 is = " + i3);

        System.out.println(i1 > 25 && i2 > 25 && i3 > 25);


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        System.out.println("Please enter a number between 1 to 7: ");
        int day = myScanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
            default:
                System.out.println("Invalid input!!!");
        }


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        System.out.println("Please enter a number between -10 to 10:");
        int number = myScanner.nextInt();

        if(number > 0){
            System.out.println("Number entered is POSITIVE");
        }
        else if(number < 0){
            System.out.println("Number entered is NEGATIVE");
        }
        else{
            System.out.println("Number entered is ZERO");
        }

        if(number % 2 == 0){
            System.out.println("Number entered is EVEN");
        }
        else{
            System.out.println("Number entered is ODD");
        }


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        System.out.println("Hi Jennifer! Please enter your exam results: ");
        int grade1 = myScanner.nextInt();
        int grade2 = myScanner.nextInt();
        int grade3 = myScanner.nextInt();

        if((grade1 + grade2 + grade3) / 3 >= 70){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        System.out.println("Please enter 3 numbers:");
        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        int thirdNumber = myScanner.nextInt();

        if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("TRIPLE MATCH");
        }
        else if(firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber){
            System.out.println("DOUBLE MATCH");
        }
        else{
            System.out.println("NO MATCH");
        }
    }
}
