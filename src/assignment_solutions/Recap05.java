package assignment_solutions;

import java.util.Arrays;

public class Recap05 {
    /////////////////TASK-1 Method////////////////////
    public static String noDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) str = str.replace(String.valueOf(c), "");
        }
        return str;
    }


    /////////////////TASK-2 Method////////////////////
    public static String noVowel(String str) {
        String vowels = "AaEeIiOoUu";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) >= 0) str = str.replace(String.valueOf(c), "");
        }
        return str;
    }


    /////////////////TASK-3 Method////////////////////
    public static int sumOfDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }


    /////////////////TASK-4 Method////////////////////
    public static boolean hasUpperCas(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }


    /////////////////TASK-5 Method////////////////////
    public static int middleInt(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }


    /////////////////TASK-6 Method////////////////////
    public static int[] no13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }


    /////////////////TASK-7 Method////////////////////
    public static int[] arrFactorial(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int fac = 1;
            for (int j = 2; j <= arr[i]; j++) {
                fac *= j;
            }
            arr[i] = fac;
        }
        return arr;
    }


    /////////////////TASK-8 Method////////////////////
    public static String[] categorizeCharacters(String str) {
        String letters = "";
        String digits = "";
        String specials = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
            else if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) specials += str.charAt(i);
        }
        return new String[]{letters, digits, specials};
    }

    /**
     * /////////////////////////////////////////////////////////////////////////////////////////////
     * //////////////////////CALLING MAIN METHOD HERE TO TEST METHODS ABOVE/////////////////////////
     * /////////////////////////////////////////////////////////////////////////////////////////////
     */

    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");
        System.out.println(noDigit("123Tech456Global149")); //TechGlobal


        System.out.println("\n------------TASK-2------------\n");
        System.out.println(noVowel("TechGlobal")); // Tchglbl


        System.out.println("\n------------TASK-3------------\n");
        System.out.println(sumOfDigits("$125.0")); // 8


        System.out.println("\n------------TASK-4------------\n");
        System.out.println(hasUpperCas("John's age is 29")); // true


        System.out.println("\n------------TASK-5------------\n");
        System.out.println(middleInt(5, 3, 5)); // 5


        System.out.println("\n------------TASK-6------------\n");
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3 }))); // [0, 2, 3]


        System.out.println("\n------------TASK-7------------\n");
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 2, 4, 1}))); // [1, 2, 24, 1]


        System.out.println("\n------------TASK-8------------\n");
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%"))); // [abc, 123, $%%]
    }
}
