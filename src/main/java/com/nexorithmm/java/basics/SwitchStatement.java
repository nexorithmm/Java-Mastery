package com.nexorithmm.java.basics;

public class SwitchStatement {
    public static void main(String[] args) {

        int day = 2;

        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println();

        //fall-through
        int number = 2;

        switch (number){

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            default:
                System.out.println("Default");
        }

        System.out.println();

        //default
        int choice = 4;

        switch (choice){

            case 1:
                System.out.println("Add");
                break;
            case 2:
                System.out.println("Delete");
                break;
            case 3:
                System.out.println("Multiply");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
