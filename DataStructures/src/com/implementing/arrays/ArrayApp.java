package com.implementing.arrays;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = scan.nextInt();
		CreateArray a = new CreateArray(n);
		while (true) 
		{
			System.out.println("1. Insert \n2. Delete \n3. Display \n4.Any other number to exit");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				a.insert();
				break;
			case 2:
				a.delete();
				break;
			case 3:
				a.display();
				break;
			default:
				scan.close();
				System.exit(0);
			}
		}
	}
}
