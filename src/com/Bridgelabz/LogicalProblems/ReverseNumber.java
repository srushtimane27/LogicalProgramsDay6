package com.Bridgelabz.LogicalProblems;

import java.util.Scanner;

public class ReverseNumber {
        public static void findReverseNumber(int num){
            int reverse = 0;
            int remainder = 0;

            while (num != 0){
                remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            System.out.println("Reverse number: " +reverse);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            findReverseNumber(num);
        }
}
