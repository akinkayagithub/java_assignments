package assignment_solutions;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Recap04 {
    //////////////////////TASK-1 Method/////////////////////////
    public static String noSpace(String str) {
        return str.replace(" ", "");
    }


    //////////////////////TASK-2 Method/////////////////////////
    public static String replaceFirstLast(String str) {
        if (str.trim().length() < 2) return "";
        str = str.trim();
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }


    //////////////////////TASK-3 Method/////////////////////////
    public static boolean hasVowel(String str) {
        boolean hasVowel = false;
        String vowels = "aeouiAEOUI";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                hasVowel = true;
                break;
            }
        }
        return hasVowel;
    }


    //////////////////////TASK-4 Method/////////////////////////
    public static void checkAge(int yearOfBirth) {
        LocalDateTime currentDate = LocalDateTime.now();
        int currentYear = currentDate.getYear();

        if (yearOfBirth >= currentYear || currentYear - yearOfBirth >= 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }


    //////////////////////TASK-5 Method/////////////////////////
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        return (max + min) / 2;
    }

    //////////////////////TASK-6 Method/////////////////////////
    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) arr[i] = arr[i] = "###";
        }
        return arr;
    }

    //////////////////////TASK-7 Method/////////////////////////
    public static int[] no3or5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) arr[i] = 101;
            else if (arr[i] % 5 == 0) arr[i] = 99;
            else if (arr[i] % 3 == 0) arr[i] = 100;
        }
        return arr;
    }


    //////////////////////TASK-8 Method/////////////////////////
    public static int countPrimes(int[] numbers) {
        int primeCounter = 0;

        for (int number : numbers) {
            boolean isPrime = true;
            for (int j = 2; j <= number - 1; j++) {
                if (number <= 1 || number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primeCounter++;
        }
        return primeCounter;
    }

    /**
     * /////////////////////////////////////////////////////////////////////////////////////////////
     * //////////////////////CALLING MAIN METHOD HERE TO TEST METHODS ABOVE/////////////////////////
     * /////////////////////////////////////////////////////////////////////////////////////////////
     */

    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        String str = " Tech Global  ";
        System.out.println(noSpace(str)); // TechGlobal


        System.out.println("\n------------TASK-2------------\n");
        String str2 = "Hello";
        System.out.println(replaceFirstLast(str2)); // oellH


        System.out.println("\n------------TASK-3------------\n");
        String str3 = "Java";
        System.out.println(hasVowel(str3)); // true


        System.out.println("\n------------TASK-4------------\n");
        checkAge(2005); //AGE IS ALLOWED


        System.out.println("\n------------TASK-5------------\n");
        System.out.println(averageOfEdges(10, 13, 20)); // 15


        System.out.println("\n------------TASK-6------------\n");
        String[] arr6 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr6))); // ["###", "123", "###", "java"]


        System.out.println("\n------------TASK-7------------\n");
        int[] arr7 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(arr7))); // [99, 11, 100, 13, 14, 101]


        System.out.println("\n------------TASK-8------------\n");
        int[] numbers = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(numbers)); // 5
    }
}
