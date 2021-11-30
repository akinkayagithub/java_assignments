package assignment_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework10 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        int spaces = 0, letters = 0, digits = 0, special = 0;
        String str = "$# aBC 1230gH <)g7";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') spaces++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
            else special++;
        }
        System.out.println("the total number of spaces: " + spaces);
        System.out.println("the total number of letter: " + letters);
        System.out.println("the total number of digits: " + digits);
        System.out.println("the total number of specials: " + special);


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        String str2 = "Hi! How are you?";

        int countVowels = 0;
        int countLetter = 0;

        for (int i = 0; i <= str2.length() - 1; i++) {
            char c = str2.toLowerCase().charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') countVowels++;
                else countLetter++;
            }
        }

        System.out.println("The total number of vowels: " + countVowels);
        System.out.println("The total number of letters: " + countLetter);


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        String str4 = "baNana";

        char[] chars = str4.toLowerCase().toCharArray();
        String duplicates = "";

        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if(!duplicates.contains("" + chars[i]) && chars[i] == chars[j]){
                    System.out.println(chars[i]);
                    duplicates += chars[i];
                }
            }
        }


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        int[] numbers5 = {-5, 0, 6, 98, -7, 0, -56, 34, 10};

        int countPositives = 0;
        int countNegatives = 0;
        int countZeros = 0;

        for (int num : numbers5) {
            if (num > 0) countPositives++;
            else if (num < 0) countNegatives++;
            else countZeros++;
        }
        System.out.println("The total occurrences of negatives:" + countNegatives);
        System.out.println("The total occurrences of positives: " + countPositives);
        System.out.println("The total occurrences of zeros: " + countZeros);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int firstPos = 0;
        int firstNeg = 0;

        for (int num : numbers) {
            if (num > 0 && firstPos == 0) {
                firstPos = num;
            }
            if (num < 0 && firstNeg == 0) {
                firstNeg = num;
            }
        }
        System.out.println(firstNeg);
        System.out.println(firstPos);


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        int r1 = (int)(Math.random() * 10) + 1;
        int r2 = (int)(Math.random() * 10) + 1;
        int r3 = (int)(Math.random() * 10) + 1;
        int r4 = (int)(Math.random() * 10) + 1;
        int r5 = (int)(Math.random() * 10) + 1;

        int[] numbers7 = {r1, r2, r3, r4, r5};

        boolean has2or3 = false;
        for (int num : numbers7) {
            if (num == 2 || num == 3) {
                has2or3 = true;
                break;
            }
        }
        System.out.println(has2or3);


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        String[] fruits = {"banana", "orange", "Apple"};

        boolean hasApple = false;
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);


        //////////////////////TASK-9/////////////////////////
        System.out.println("\n----------TASK-9----------\n");
        int[] numbers9 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        List<Integer> duplicatedNumbers =  new ArrayList<>();

        for (int i = 0; i < numbers9.length-1; i++) {
            for (int j = i+1; j < numbers9.length; j++) {
                if(!duplicatedNumbers.contains(numbers9[i]) && numbers9[i] == numbers9[j]){
                    System.out.println(numbers9[i]);
                    duplicatedNumbers.add(numbers9[i]);
                }
            }
        }
        if(duplicatedNumbers.isEmpty()) System.out.println("There is no duplicates");


        //////////////////////TASK-10/////////////////////////
        System.out.println("\n----------TASK-10----------\n");
        String[] words = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};

        ArrayList<String> duplicatedWords = new ArrayList<>();

        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j])){
                    if (!duplicatedWords.contains(words[i])){
                        System.out.println(words[i]);
                        duplicatedWords.add(words[i]);
                        duplicatedWords.add(words[j]);
                    }
                    break;
                }
            }
        }
        if(duplicates.isEmpty()) System.out.println("There is no duplicates");


        //////////////////////TASK-11/////////////////////////
        System.out.println("\n----------TASK-11----------\n");
        int[] numbers11 = {0, -4, -7, 0, 5, 10, 45, 45};

        boolean firstDuplicatedFound = false;

        for (int i = 0; i < numbers11.length-1; i++) {
            for (int j = i+1; j < numbers11.length; j++) {
                if(numbers11[i] == numbers11[j]){
                    System.out.println(numbers11[i]);
                    firstDuplicatedFound = true;
                    break;
                }
            }
            if(firstDuplicatedFound) break;
        }
        if(!firstDuplicatedFound) System.out.println("There is no duplicates");


        //////////////////////TASK-12/////////////////////////
        System.out.println("\n----------TASK-12----------\n");
        String[] words13 = {"foo", "12", "bar", "a", "o", "java"};

        boolean firstDuplicatedWordFound = false;

        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words13[i].equalsIgnoreCase(words[j])){
                    firstDuplicatedWordFound = true;
                    System.out.println(words13[i]);
                    break;
                }
            }
            if(firstDuplicatedWordFound) break;
        }

        if(!firstDuplicatedWordFound) System.out.println("There is no duplicates");


        //////////////////////TASK-13/////////////////////////
        System.out.println("\n----------TASK-13----------\n");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        List<Integer> duplicates13 = new ArrayList<>();

        for (int i : numbers1) {
            for (int j : numbers2) {
                if(i == j){
                    duplicates13.add(i);
                    break;
                }
            }
        }

        if(duplicates13.isEmpty()) System.out.println("There is no duplicate");
        else{
            for (int integer : duplicates13) {
                System.out.println(integer);
            }
        }


        //////////////////////TASK-14/////////////////////////
        System.out.println("\n----------TASK-14----------\n");
        int[] number14 = {10, 20, 30, 50, 70, 80};

        int[] numbers14Reversed = new int[number14.length];

        for (int i = 0; i <= number14.length/2; i++) {
            numbers14Reversed[i] = number14[number14.length-1-i];
            numbers14Reversed[number14.length-1-i] = number14[i];
        }

        System.out.println(Arrays.toString(numbers14Reversed));


        //////////////////////TASK-15/////////////////////////
        System.out.println("\n----------TASK-15----------\n");
        String str15 = "Java is fun";

        String[] words15 = str15.split(" ");

        String reversed = "";
        for (String s : words15) {
            for (int i = s.length()-1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            reversed += " ";
        }

        System.out.println(reversed.trim());
    }
}
