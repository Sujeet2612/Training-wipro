package com;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime");
		int x = sc.nextInt();
		int flag = 0;
		for(int i=2; i<x/2; i++) {
			if(x%i == 0) {
				System.out.println("Not a prime number");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.print(x + " is a prime number.");
	}

}
