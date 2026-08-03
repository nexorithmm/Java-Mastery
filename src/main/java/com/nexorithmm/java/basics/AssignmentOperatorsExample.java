package com.nexorithmm.java.basics;

public class AssignmentOperatorsExample {
    public static void main(String[] args) {

        int number = 20;

        System.out.println("=================================");
        System.out.println("            Assignment Operators");
        System.out.println("=================================");

        System.out.println();

        System.out.println("Initial Value : "+number);

        System.out.println("After += 10  : " + (number += 10)+" (Added 10)");
        System.out.println("After -=  5    : " + (number -= 5)+" (Subtracted 5)");
        System.out.println("After *=  2    : " + (number *= 2)+" (Multiplied by 2)");
        System.out.println("After /=  5   : " + (number /= 5)+" (Divided by 5)");
        System.out.println("After %=  3   : " + (number %= 3)+" (Remainder after dividing by 3)");

    }
}
