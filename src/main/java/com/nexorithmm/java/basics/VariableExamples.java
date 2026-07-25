package com.nexorithmm.java.basics;

public class VariableExamples {
    public static void main(String[] args) {


        int age = 18;
        String name = "Arjun Sarkar";
        double height = 5.6;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
        System.out.println("Height : "+height);
        System.out.println("Grade : "+grade);
        System.out.println("Student : "+isStudent);

        System.out.println("===============================");
        System.out.println("            Updated Values");
        System.out.println("===============================");

        age = 20;
        name = "Sarkar";
        height = 6.0;
        grade = 'O';
        isStudent = false;

        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
        System.out.println("Height : "+height);
        System.out.println("Grade : "+grade);
        System.out.println("Student : "+isStudent);

    }
}
