package assignment_solutions;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        String str1 = "SDLC is step by step procedure to create an application";

        System.out.println(str1.length());
        System.out.println(str1.indexOf("SDLC"));
        System.out.println(str1.indexOf("application"));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        String str2 = "   I know how to code with Python   ".trim();
        System.out.println(str2.replace("Python", "Java").toUpperCase());


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        String str3 = "     SDLC has planning, design, development, testing, deployment and maintenance phases";

        System.out.println(str3.trim().charAt(0));
        System.out.println(str3.trim().charAt(str3.length()-1));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        String s1 ="    TECH  ";
        String s2 = "  glo   ";
        String s3 = "  BAL        ";

        String s4 = (s1.trim() + s2.trim() + s3.trim()).toLowerCase().replace("t","T").replace("g","G");
        System.out.println(s4);


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Hey User! Please enter your favorite color");
        String color = input.nextLine();

        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("2nd character is = " + color.charAt(color.length() - 1));
        System.out.println("First 3 characters are = " + color.substring(0, 3));
        System.out.println("Last 3 characters are = " + color.substring(color.length() - 3));


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine().toLowerCase();

        System.out.println("1st word is = " + sentence.substring(0, sentence.indexOf(' ')));
        System.out.println("2nd word is = " + sentence.substring(sentence.lastIndexOf(' ') + 1));


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        System.out.println("Hey User! Please enter a full sentence");
        String str4 = input.nextLine();

        if(str4.contains("$")) System.out.println("This sentence contains $ character" + "\n$ character's index is = " + str4.indexOf("$"));
        else System.out.println("This sentence does not contain $ character");
    }
}
