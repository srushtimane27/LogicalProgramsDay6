package com.Bridgelabz.LogicalProblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void findPerfectNumber(int num){
        int sum = 0;
        for (int i=0; i<=num; i++){
            if (i % num == 0){
                sum = sum + i;
            }
        } if (sum == num){
            System.out.println(num+ " : is perfect number");
        }else {
            System.out.println(num+ " : is not a perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        findPerfectNumber(num);
    }

}
