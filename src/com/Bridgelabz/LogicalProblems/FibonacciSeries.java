package com.Bridgelabz.LogicalProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void findFibonacciSeries(int num){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c ;

        for (int i=1; i<num; i++){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        findFibonacciSeries(num);
    }
}
