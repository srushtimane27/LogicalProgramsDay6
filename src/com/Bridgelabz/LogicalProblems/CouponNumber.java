package com.Bridgelabz.LogicalProblems;

public class CouponNumber {
    public static void main(String[] args) {

        int coupon = (int) Math.floor(Math.random() * 10) % 10;

        System.out.println(coupon);

        if (coupon == 4) {
            System.out.println(coupon + " Is a coupon number");
        } else if (coupon == 6) {
            System.out.println(coupon + " Is a coupon number");
        } else if (coupon == 8) {
            System.out.println(coupon + " Is a coupon number");
        }else {
            System.out.println(coupon + " Is not coupon number");
        }
    }
}
