package assignment_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recap03 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers1.get(3));
        System.out.println(numbers1.get(0));
        System.out.println(numbers1.get(2));
        System.out.println(numbers1);


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Moscow", "Madrid", "Paris"));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        ArrayList<String> marvelCharacters = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panther", "Deadpool", "Captain America"));

        System.out.println(marvelCharacters);
        Collections.sort(marvelCharacters);
        System.out.println(marvelCharacters.contains("Wolwerine"));


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        ArrayList<String> avengers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));

        System.out.println(avengers);
        Collections.sort(avengers);
        System.out.println(Collections.binarySearch(avengers, "Hulk") >= 0 && Collections.binarySearch(avengers, "Iron Man") >= 0);


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G', 'Q'));

        System.out.println(characters);
        for (Character character : characters) {
            System.out.println(character);
        }


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        ArrayList<String> hardwareList = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        System.out.println(hardwareList);
        Collections.sort(hardwareList);
        System.out.println(hardwareList);

        int countM = 0;
        int countNoAorE = 0;
        for (String s : hardwareList) {
            if (!(s.toLowerCase().contains("a")) && (!(s.toLowerCase().contains("e")))) countM++;
            if(s.toLowerCase().startsWith("m")) countNoAorE++;
        }

        System.out.println(countNoAorE);
        System.out.println(countM);


        //////////////////////TASK-9/////////////////////////
        System.out.println("\n----------TASK-9----------\n");
        ArrayList<String> kitchenTools = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchenTools);

        int countUpper = 0;
        int countLower = 0;
        int countHasP = 0;
        int countStartsOrEndsWithP = 0;

        for (String kitchenTool : kitchenTools) {
            if (Character.isUpperCase(kitchenTool.charAt(0))) countUpper++;
            else countLower++;

            if (kitchenTool.toLowerCase().startsWith("p") || kitchenTool.toLowerCase().endsWith("p")) countStartsOrEndsWithP++;
            if (kitchenTool.toLowerCase().contains("p")) countHasP++;
        }

        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p= " + countHasP);
        System.out.println("Elements starting or ending with P or p = " + countStartsOrEndsWithP);


        //////////////////////TASK-10/////////////////////////
        System.out.println("\n----------TASK-10----------\n");
        ArrayList<Integer> numbers10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(numbers10);

        int countNumbersDividedBy10 = 0;
        int countEvensGreaterThan15 = 0;
        int countOddsLessThan20 = 0;
        int countNumbersLessThan15OrGreaterThan50 = 0;

        for (Integer number : numbers10) {
            if (number % 10 == 0) countNumbersDividedBy10++;
            if (number % 2 == 0 && number > 15) countEvensGreaterThan15++;
            else if (number % 2 != 0 && number < 20) countOddsLessThan20++;
            if (number < 15 || number > 50) countNumbersLessThan15OrGreaterThan50++;
        }

        System.out.println("Elements that can be divided by 10 = " + countNumbersDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvensGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + countOddsLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countNumbersLessThan15OrGreaterThan50);
    }
}
