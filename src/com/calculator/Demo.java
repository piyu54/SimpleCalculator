package com.calculator;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) {
		String yn;
		do
		{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Calculator");
		System.out.println(" \n 1.Addition \n 2.Substration \n 3.Multiplication \n 4.Division ");
		System.out.println("ENTER YOUR CHOICE" );
		String sys = s.next();
		System.out.println("ENTER THE FIRST NUMBER");
		int no1 = s.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int no2 = s.nextInt();
		double res;
		
		switch (sys) 
		{
		case "1" : res = no1+no2;
			System.out.println("Addition of Two Number is " +res);
			break;
		case "2" : res = no1-no2;
		System.out.println("Substration of Two Number is "+res);
		break;
		case "3" : res = no1*no2;
		System.out.println("Multiplication of Two Number is " +res);
		break;
		case "4" : res = no1/no2;
		System.out.println("Division of Two Number is " +res);
		break;
		default :
			System.out.println("Your Choice is Invaild Please Enter Right Choice");
		}
		System.out.println("\nDo you want to continue(Press y for Yes and n for No)");
		yn=s.next();
	}
	while (yn.equals("y")||yn.equals("Y"));
		
	}
}
