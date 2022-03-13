package com.bridgelabz;

import java.util.Scanner;

public class Distance {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate :");
        int x = sc.nextInt();
        System.out.println("Enter the y co-ordinate :");
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println("The distance of point from the origin is : "+ distance);
    }
	}
