package com;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		System.out.print("Select the action : \n"+
						"1. Addition  \n"+
				        "2. Subtration \n" +
						"3. Division \n" +
				        "4. Multiplication \n");
		int x = sc.nextInt();
		switch(x) {
		case 1: int add = a+b;
			System.out.println(add);
			break;
		case 2: int sub = a-b;
			System.out.println(sub);
			break;
		case 3: int div = a/b;
			System.out.println(div);
			break;
		case 4: int mul = a*b;
			System.out.println(mul);
			break;
		default :
			System.out.println("Wrong choice !");
		}

	}

}
