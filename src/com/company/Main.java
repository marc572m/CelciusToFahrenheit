package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        double C = in.nextDouble();
        double F = C * 1.8 + 32;

        System.out.println(C +" C is equal to: " + F + " F");

    }
}
