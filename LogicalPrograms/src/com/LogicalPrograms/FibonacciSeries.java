package com.LogicalPrograms;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 5, firstTerm = 1, secondTerm = 2;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}