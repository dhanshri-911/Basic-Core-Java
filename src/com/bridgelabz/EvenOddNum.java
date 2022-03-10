package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be cheak");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println(n +"Even Number");
		}else
		{
			System.out.println(n + "Odd Number17");
		}

	}

}
