package assignment_solutions;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        String divider7 = "";
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) divider7 += i + " - ";
        }
        System.out.println(divider7.substring(0, divider7.length()-3));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        String divider2And3 = "";
        for (int i = 1; i <= 50; i++) {
            if(i % 6 == 0) divider2And3 += i + " - ";
        }
        System.out.println(divider2And3.substring(0, divider2And3.length()-3));


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        String divider5 = "";
        for (int i = 100; i >= 50; i--) {
            if(i % 5 == 0) divider5 += i + " - ";
        }
        System.out.println(divider5.substring(0, divider5.length()-3));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int num = input.nextInt();
        input.nextLine();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        System.out.println("Please enter your full name:");
        String s1 = input.nextLine().toLowerCase();
        int vowelCounter = 0;

        for (int i = 0; i <= s1.length() - 1; i++) {
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' ||
                    s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') vowelCounter++;
        }
        System.out.println("There are " + vowelCounter + " vowel letters in this full name");


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int total = 0;

        if(number >= 100) System.out.println("This number is already more than 100");
        total += number;

        while (total <= 100){
            System.out.println("Please enter another number");
            total += input.nextInt();
            if(total >= 100) System.out.println("Sum of the entered numbers is at least 100");
        }


        //////////////////////TASK-9/////////////////////////
        System.out.println("\n----------TASK-9----------\n");
        System.out.println("Please enter a number: ");
        int fibonacciSeries = input.nextInt();

        int num1 = 0;
        int num2 = 1;

        String result = "";
        for (int i = 1; i <= fibonacciSeries; i++) {
            result += num1 + " - ";
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(result.substring(0, result.length()-3));


        //////////////////////TASK-10/////////////////////////
        System.out.println("\n----------TASK-10----------\n");
        String name;
        do {
            System.out.println("Please enter a name");
            name = input.next();
        }
        while (!name.toLowerCase().startsWith("j"));
        System.out.println("End of the program!");
    }
}
