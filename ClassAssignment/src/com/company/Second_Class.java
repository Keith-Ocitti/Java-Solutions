package com.company;


public class Second_Class {

    //method to test number
    public void testNumber(int num){
        int sum = 0;
        for(int i = 1;i<num;i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }

        if(sum == num){
            System.out.println(num + " is perfect interger");
        }
        else if(sum > num){
            System.out.println(num + " is an abundant integer");
        }
        else{
            System.out.println(num + " is a deficient intetger");
        }
    }

    //method to test and organize characters
    public void testCharacters(char [] myArray,int max){
        String myWord = "";
        for(int i=0;i<max;i++){
            myWord = myWord + myArray[i];
        }
        StringBuilder reversedWord = new StringBuilder();
        reversedWord.append(myWord);
        reversedWord.reverse();

        System.out.println("Original word is: " + myWord);
        System.out.println("Reversed word is: " +reversedWord);

        if (myWord.equals(reversedWord.toString())){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
