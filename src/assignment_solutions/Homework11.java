package assignment_solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {
    //////////////////////TASK-1 Method/////////////////////////
    public static int countWords(String str) {
        str = str.trim();
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) countSpace++;
        }
        return countSpace + 1;
    }


    //////////////////////TASK-2 Method/////////////////////////
    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }


    //////////////////////TASK-3 Method/////////////////////////
    public static int countPos(ArrayList<Integer> numbers) {
        int countPos = 0;
        for (int number : numbers) {
            if (number > 0) countPos++;
        }
        return countPos;
    }


    //////////////////////TASK-4 Method/////////////////////////
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<>();

        for (int number : numbers) {
            if (!newList.contains(number)) newList.add(number);
        }
        return newList;
    }


    //////////////////////TASK-5 Method/////////////////////////
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements){
        ArrayList<String> newList = new ArrayList<>();

        for (String element : elements) {
            if (!newList.contains(element)) newList.add(element);
        }
        return newList;
    }


    //////////////////////TASK-6 Method/////////////////////////
    public static String removeExtraSpaces(String str) {
        str = str.trim();

        String result = "";
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') result += str.charAt(i);
        }
        return result;
    }


    //////////////////////TASK-7 Method/////////////////////////
    public static int[] add(int[] numbers1, int[] numbers2) {
        int[] result = numbers1.length >= numbers2.length ? numbers1 : numbers2;

        for (int i = 0; i < Math.min(numbers1.length, numbers2.length); i++) {
            result[i] = numbers1[i] + numbers2[i];
        }
        return result;
    }

    //////////////////////TASK-8 Method/////////////////////////
    public static int findClosestTo10(int[] numbers) {
        Arrays.sort(numbers);
        int leftClosest = Integer.MIN_VALUE;
        int rightClosest = Integer.MAX_VALUE;

        for(int number : numbers){
            if(number < 10 && number > leftClosest) leftClosest = number;
            else if(number > 10 && number < rightClosest) rightClosest = number;
        }
        if(10 - leftClosest <= rightClosest - 10) return leftClosest;
        return rightClosest;
    }

    /**
     * /////////////////////////////////////////////////////////////////////////////////////////////
     * //////////////////////CALLING MAIN METHOD HERE TO TEST METHODS ABOVE/////////////////////////
     * /////////////////////////////////////////////////////////////////////////////////////////////
     */

    public static void main(String[] args) {
        System.out.println("\n----------TASK-1----------\n");
        String str1 = "     Java is fun       ";
        System.out.println(Homework11.countWords(str1));


        System.out.println("\n----------TASK-2----------\n");
        String str2 = "QA stands for Quality Assurance";
        System.out.println(countA(str2));


        System.out.println("\n----------TASK-3----------\n");
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers3));


        System.out.println("\n----------TASK-4----------\n");
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(numbers4));


        System.out.println("\n----------TASK-5----------\n");
        ArrayList<String> elements = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(Homework11.removeDuplicateElements(elements));


        System.out.println("\n----------TASK-6----------\n");
        String str6 = "  I   am      learning     Java     ";
        System.out.println(removeExtraSpaces(str6));


        System.out.println("\n----------TASK-7----------\n");
        int[] arr71 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] arr72 = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(arr71, arr72)));


        System.out.println("\n----------TASK-8----------\n");
        int[] numbers8 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(numbers8));
    }
}
