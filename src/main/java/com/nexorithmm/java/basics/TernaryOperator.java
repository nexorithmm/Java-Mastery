package com.nexorithmm.java.basics;

public class TernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator
        int age = 19;

        String result = age >=18?  "Eligible" : "Not Eligilble";

        System.out.println(result);

        //Find the largest number
        int a = 10;
        int b = 20;

        int largest = a > b? a : b;

        System.out.println(largest);

        //Check Even or Odd
        int number = 7;

        String type = number%2 == 0? "Even" : "Odd";

        /* another way
        if(number%2 == 0){
        System.out.println("Even");
        }else{
        System.out.println("Odd");
         */

        System.out.println(type);

        //Check Positive, Negative, or Zero
        int value = -7;

        //Nested ternary operator
        String result1 = value > 0? "Positive" : value < 0? "Negative" : "Zero";

        System.out.println(result1);

        //Find the smallest number
        int x = 13;
        int y = 30;

        int smallest = x < y? x : y;

        System.out.println(smallest);


    }
}
