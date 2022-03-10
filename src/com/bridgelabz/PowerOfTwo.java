package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int i = 0; 

    int powerOfTwo = 1; 

    while (i <= n) {

    System.out.println(i + " " + powerOfTwo); // print out the power of two

    powerOfTwo = 2 * powerOfTwo; // double to get the next one

    i = i + 1;
	}

	}
	}
