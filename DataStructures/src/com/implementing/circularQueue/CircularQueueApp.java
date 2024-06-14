package com.implementing.circularQueue;

import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of Queue");
		int n = scan.nextInt();
		CreateCircularQueue cq = new CreateCircularQueue(n);
		while (true) 
		{
			System.out.println("1. Insert \n2. Delete \n3. Display \n4.Any other number to exit");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				cq.insert();
				break;
			case 2:
				cq.delete();
				break;
			case 3:
				cq.display();
				break;
			default:
				scan.close();
				System.exit(0);
			}
		}
	}
}
