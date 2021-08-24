package com.amigoscode;

//import java.util.Scanner;

//public class Main {

    //public static void main(String[] args) {
        //Write a method that takes an input from the user. Either yes or no. If yes it displays a random joke. If no exits the program.
        //Scanner userInput = new Scanner(System.in);
        //System.out.println("Do you want to hear a joke? Type Yes or No");

        //String input = userInput.nextLine();


        //if (input.equals("Yes")) {
            //System.out.println("Where do you find a cow with no legs? Right where you left it! LOL!");
        //} else {
            //System.out.println("You suck");
        //}
    //}
//}

//Write a method that reverses an array of Strings

import java.util.*;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Given input array
        String[] inputArray = {"India","USA","Germany","Australia"};
        // Print array before reverse
        System.out.println("Array without reverse : " +
                Arrays.toString(inputArray));
        // Calling method to swap elements
        reverseArray(inputArray);
    }
    public static void reverseArray(String[] arr) {
        // Converting Array to List
        List<String> list = Arrays.asList(arr);
        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);
        // Converting list back to Array
        String[] reversedArray = list.toArray(arr);
        // Printing the reverse Array
        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
    }
}
