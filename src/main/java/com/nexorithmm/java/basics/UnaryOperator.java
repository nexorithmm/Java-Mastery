package com.nexorithmm.java.basics;

public class UnaryOperator {
    public static void main(String[] args) {

        int a = 10;

        // Unary Plus
        System.out.println(+a);

        // Unary Minus
        System.out.println(-a);

        // Post Increment : Use first, then increase
        System.out.println(a++);

        // Pre increment : Increase first, then use
        System.out.println(++a);

        //Post Decrement : Use first, then decrease
        System.out.println(a--);

        //Pre Decrement : Decrease first, then use
        System.out.println(--a);

        // Logical NOT
        boolean isJavaFun = true;
        System.out.println(!isJavaFun);
    }
}
