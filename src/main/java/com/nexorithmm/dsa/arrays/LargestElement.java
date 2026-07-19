package com.nexorithmm.dsa.arrays;

public class LargestElement {
    public static void main(String[] args) {

/*
        📝 Problem Statement

        Given an integer array, find the largest element.

                Example
        Input:
    [5, 2, 9, 1, 7]

        Output:
        9

 */

        int []array = {5,2,9,1,7};

        int largestNumber = array[0];

        for(int i = 1; i < array.length; i++){

            if(array[i] > largestNumber){
                largestNumber = array[i];
            }

        }

        System.out.println("Largest Element : "+largestNumber);

    }
}
