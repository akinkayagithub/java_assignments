package assignment_solutions;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------Task-1----------\n");
        int num = (int) (Math.random() * 51);
        System.out.println(num >= 10 && num <= 25);


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------Task-2----------\n");
        int number = (int)(Math.random()*100 + 1);

        if(number <= 50){
            System.out.println(number + " is in the 1st half");
            if(number <= 25) System.out.println(number + " is in the 1st quarter");
            else System.out.println(number + " is in the 2nd quarter");
        }
        else{
            System.out.println(number + " is in the 2nd half");
            if(number <= 75) System.out.println(number + " is in the 3rd quarter");
            else System.out.println(number + " is in the 4th quarter");
        }


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------Task-3----------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 1 to 10 (1 and 10 are included)");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt(), num4 = scanner.nextInt(), num5 = scanner.nextInt();

        int totalPoints = 0;

        if(num1 > 0 && num1 < 11) totalPoints += num1 * 5;
        if(num1 > 0 && num1 < 11) totalPoints += num2 * 4;
        if(num1 > 0 && num1 < 11) totalPoints += num3 * 3;
        if(num1 > 0 && num1 < 11) totalPoints += num4 * 2;
        if(num1 > 0 && num1 < 11) totalPoints += num5;

        System.out.println(totalPoints);
    }
}
