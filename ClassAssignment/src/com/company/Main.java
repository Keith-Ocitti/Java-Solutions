package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //creating the object instance of the second class
        Second_Class secondClassObj = new Second_Class();

        System.out.println("Please enter your integer: ");
        int userInt = userInput.nextInt();


        System.out.println("=============================");
        secondClassObj.testNumber(userInt);

        System.out.println("=============================");

        //create arraylist to hold characters entered by the user
        ArrayList<Character> myList = new ArrayList<Character>();
        System.out.println("Enter 0 to quit");
        System.out.println("----------------------------");
        System.out.println("Enter first character: ");
        char firstChar = userInput.next().charAt(0);
        myList.add(firstChar);

        while (firstChar != '0'){
            System.out.println("Enter next Character: ");
            char nextChar = userInput.next().charAt(0);
            if (nextChar == '0'){
                break;
            }
            myList.add(nextChar);
        }
        char[] charList =  new char[myList.size()];
        for (int i = 0;i<myList.size();i++){
            charList[i] = myList.get(i);
        }

        //enter the max number of characters to be executed
        System.out.println("Please enter max interger: ");
        int choiceMaxInt =  userInput.nextInt();
        //calling the second method
        secondClassObj.testCharacters(charList,choiceMaxInt);
    }
}
