package com.nexorithmm.java.basics;

public class LogicalOperators {
    public static void main(String[] args) {


        int age = 25;
        boolean hasLicense = true;
        boolean isStudent = false;

        System.out.println("=========================");
        System.out.println("       Logical Operators");
        System.out.println("=========================");

        System.out.println();

        System.out.println("age = "+age);
        System.out.println("hasLicense = "+hasLicense);
        System.out.println("isStudent = "+isStudent);

        System.out.println();

        System.out.println("age >= 18 && hasLicense : " + (age >= 18 && hasLicense));
        System.out.println("age < 18 || isStudent      : " + (age < 18 || isStudent));
        System.out.println("!isStudent                        : " + !isStudent);

    }
}
