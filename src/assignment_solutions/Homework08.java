package assignment_solutions;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));

        if (name.length() >= 3) {
            System.out.println("The first 3 characters in the name are =" + name.substring(0, 3));
            System.out.println("The last 3 characters in the name are = = " + name.substring(name.length() - 3));
        } else {
            System.out.println("Name does not have 3 letters");
        }

        if (name.toLowerCase().startsWith("a")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        System.out.println("Please enter your full address");
        String address = scanner.nextLine();

        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        System.out.println("Please enter at least 4 colors");
        String color = scanner.nextLine();

        if (color.toLowerCase().contains("green") && color.toLowerCase().contains("red")) System.out.println("Green and red are in the list");
        else if (color.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else if (color.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        String str = "  Java is FUN   ";
        str = str.trim().toLowerCase();

        String word1 = str.substring(0, str.indexOf(' '));
        String word2 = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' '));
        String word3 = str.substring(str.lastIndexOf(' ') + 1);

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);
    }
}
