package com.Bridgelabz.LogicalProblems;

import java.util.Scanner;

public class PrimeNumber {
    private static void checkPrime(int n) {
        int count = 0;     //initializing count with zero

        if (n < 2)
            System.out.println("Number is not a prime number: " + n);
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count ++;
        }

        if (count > 2) {
            System.out.println(n + " : is not prime number");
        } else {
            System.out.println(n + " : is prime number");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        checkPrime(n);
    }

}
