package com.nexorithmm.java.basics;

public class TypeCastingExample {
    public static void main(String[] args) {


        //Widening(Implicit Casting)
        int number = 100;
        double value = number;

        System.out.println("Widening (Implicit Casting)");
        System.out.println("Integer Value  : " + number);
        System.out.println("Double Value   : " + value);

        System.out.println();

        //Narrowing(Explicit Casting)
        double price = 99.99;
        int amount = (int) price;

        System.out.println("Narrowing (Explicit Casting)");
        System.out.println("Double Value  : " + price);
        System.out.println("Integer Value  : " + amount);

    }
}
