package com.implementing.linearQueue;

import java.util.Scanner;


public class LinearQueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of Linear Queue");
		int n = scan.nextInt();
		CreateLinearQueue lq = new CreateLinearQueue(n);
		while (true) 
		{
			System.out.println("1. Insert \n2. Delete \n3. Display \n4.Any other number to exit");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				lq.insert();
				break;
			case 2:
				lq.delete();
				break;
			case 3:
				lq.display();
				break;
			default:
				scan.close();
				System.exit(0);
			}
		}
	}
}
