package assignment_solutions;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        System.out.println("\tJava is easy to write and easy to run—this is\n" +
                " the foundational strength of Java and why many\n" +
                " developers program in it. When you write Java once,\n" +
                " you can run it almost anywhere at any time.\n" +
                "\n" +
                "\tJava can be used to create complete\n" +
                " applications that can run on a single computer or be\n" +
                " distributed across servers and clients in a network.\n" +
                "\n" +
                "\tAs a result, you can use it to easily build\n" +
                " mobile applications or run-on desktop applications\n" +
                " that use different operating systems and servers, such\n" +
                " as Linux or Windows.");


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please, enter your fist name: ");
        String firstName = myScanner.nextLine();

        System.out.println("Please, enter your last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Please, enter your age: ");
        int age = myScanner.nextInt();

        myScanner.nextLine();

        System.out.println("Please, enter your email address: ");
        String email = myScanner.next();

        myScanner.nextLine();

        System.out.println("Please, enter your phone number: ");
        String phoneNumber = myScanner.nextLine();

        System.out.println("Please, enter your address: ");
        String address = myScanner.nextLine();

        System.out.print("\tUser who joined this program is " + firstName + "\n" +
                lastName + "." + firstName + "'s" + " age is " + age + "." + "\n"
                + "\t" + firstName + "'s" + " email address is\n" +
                email + "," + " phone number " + phoneNumber + "," + " and\n" +
                "address is " + address + "." );


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        System.out.println("What is your favorite book?");
        String favBook = myScanner.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = myScanner.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber = myScanner.nextInt();

        System.out.println("\nUser's favorite book is: " + favBook + "\n" +
                "\nUser's favorite color is: " + favColor + "\n" +
                "\nUser's favorite number is: " + favNumber + "\n");


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        int sumOfNumbers = 63 + 17;
        System.out.println(sumOfNumbers);


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        double divisionOfNumbers = 45 / 3;
        System.out.println(divisionOfNumbers);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        System.out.println("1.   "+ (-10 + 7 * 5));
        System.out.println("2.   " + ((72 + 24) % 24));
        System.out.println("3.   " + (10 + -3*9 / 9));
        System.out.println("4.   " + (5 + 18 / 3 * 3 - ( 6 % 3)));


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        int num1 = 24;
        int num2 = 10;

        System.out.println("24 + 10 = " + (num1 + num2));
        System.out.println("24 - 10 = " + (num1 - num2));
        System.out.println("24 * 10 = " + (num1 * num2));
        System.out.println("24 / 10 = " + ((double)num1 / (double)num2));
        System.out.println("24 % 10 = " + (num1 % num2));


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        double widthOfRectangle = 7.5;
        double heightOfRectangle = 10.5;

        System.out.println("Area of the rectangle = " + (widthOfRectangle * heightOfRectangle));
        System.out.println("Perimeter of the rectangle = " + (2 * (widthOfRectangle + heightOfRectangle)));


        //////////////////////TASK-9/////////////////////////
        System.out.println("\n----------TASK-9----------\n");
        double salary = 90_000;
        System.out.println(salary * 3);
    }
}
