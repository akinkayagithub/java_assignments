package assignment_solutions;

import java.util.Arrays;

public class Recap02 {
    public static void main(String[] args) {
        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------TASK-1----------\n");
        int[] numbers1 = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        System.out.println(numbers1[3]);
        System.out.println(numbers1[0]);
        System.out.println(numbers1[9]);
        System.out.println(Arrays.toString(numbers1));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------TASK-2----------\n");
        String[] arr2 = new String[5];
        arr2[1] = "abc";
        arr2[4] = "xyz";

        System.out.println(arr2[3]);
        System.out.println(arr2[0]);
        System.out.println(arr2[4]);
        System.out.println(Arrays.toString(arr2));


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------TASK-3----------\n");
        int[] numbers3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers3));

        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------TASK-4----------\n");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------TASK-5----------\n");
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "XPluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));

        Arrays.sort(cartoonDogs);
        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------TASK-6----------\n");
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0 && Arrays.binarySearch(cartoonCats, "Felix") >= 0);


        //////////////////////TASK-7/////////////////////////
        System.out.println("\n----------TASK-7----------\n");
        double[] numbers7 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbers7));

        for (double number : numbers7) {
            System.out.println(number);
        }


        //////////////////////TASK-8/////////////////////////
        System.out.println("\n----------TASK-8----------\n");
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(characters));

        int countLetters = 0;
        int countUpperCases = 0;
        int countLowerCases = 0;
        int countDigits = 0;
        int countSpecialCharacters = 0;

        for (char character : characters) {
            if(Character.isLetter(character)) {
                countLetters++;
                if (Character.isUpperCase(character)) countUpperCases++;
                else countLowerCases++;
            }
            else if(Character.isDigit(character)) countDigits++;
            else if(!Character.isLetterOrDigit(character)) countSpecialCharacters++;
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpperCases);
        System.out.println("Lowercase letters =  " + countLowerCases);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecialCharacters);


        //////////////////////TASK-9/////////////////////////
        System.out.println("\n----------TASK-9----------\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));
        int countUpper = 0;
        int countLower = 0;
        int countBOrP = 0;
        int countBookOrPen = 0;

        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) countUpper++;
            else  countLower++;

            if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")) countBOrP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) countBookOrPen++;
        }

        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starting with B or P =  " + countBOrP);
        System.out.println("Elements having \"book\" or \"pen\" =  " + countBookOrPen);


        //////////////////////TASK-10/////////////////////////
        System.out.println("\n----------TASK-10----------\n");
        int[] numbers10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbers10));

        int countMoreThan10 = 0;
        int countLessThan10 = 0;
        int count10 = 0;

        for (int number : numbers10) {
            if(number > 10 ) countMoreThan10++;
            else if(number < 10) countLessThan10++;
            else count10++;
        }

        System.out.println("Elements that are more than 10 = " + countMoreThan10);
        System.out.println("Elements that are less than 10 =  " + countLessThan10);
        System.out.println("Elements that are 10 =  " + count10);


        //////////////////////TASK-11/////////////////////////
        System.out.println("\n----------TASK-11----------\n");
        int[] firstArr = {5, 8, 13, 1, 2};
        int[] secondArr = {9, 3, 67, 1, 0};
        int[] thirdArr = new int[5];

        for (int i = 0; i < firstArr.length; i++) {
            thirdArr[i] = Math.max(firstArr[i], secondArr[i]);
        }

        System.out.println("1st array is = " + Arrays.toString(firstArr));
        System.out.println("2nd array is = " + Arrays.toString(secondArr));
        System.out.println("3rd array is = "  + Arrays.toString(thirdArr));
    }
}
