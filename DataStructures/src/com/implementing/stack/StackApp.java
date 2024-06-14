package com.implementing.stack;

import java.util.Scanner;


public class StackApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Initial Stack Size");
		int n = scan.nextInt();
		CreateStack s = new CreateStack(n);
		while (true) 
		{
			System.out.println("1. Push \n2. Pop \n3. Display \n4.Any other number to exit");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			default:
				scan.close();
				System.exit(0);
			}
		}
	}
}
