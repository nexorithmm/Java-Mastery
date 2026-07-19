package com.nexorithmm.java.basics;

public class ElseIfLadder {
    public static void main(String[] args) {

/*
     Student Marks Grade
        Marks >= 90  → Grade A
        Marks >= 75  → Grade B
        Marks >= 60  → Grade C
        Below 60     → Fail
 */

        int marks = 76;

        if(marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }

    }
}
