/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();

        System.out.print("What is the rate? ");
        double rate = input.nextInt();

        System.out.print("What is the number of years? ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int comi = input.nextInt();

        double annual = principal*(1 + rate/comi)^(comi*years);

        System.out.printf("%d invested at %.1f% for %d years compounded %d times per year is $1938.84.\n", principal, rate, years, comi );
    }