package com.implementing.circularQueue;

import java.util.Scanner;

public class CreateCircularQueue {
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;
	
	private Scanner scan = new Scanner(System.in);
	
	public CreateCircularQueue(int n)
	{
		q = new int[n];
		size = q.length;
	}
	
	public void insert()
	{
		if(count == size)
		{
			System.out.println("Insertion Is Not Possible");
		}
		else
		{
			System.out.println("Enter The Element");
			int elem = scan.nextInt();
			r = (r+1)%size;
			q[r] = elem;
			count++;
		}
	}
	
	public void delete()
	{
		if(count == 0)
		{
			System.out.println("Deletion IS Not Possible");
		}
		else
		{
			System.out.println("Element Deleted Is: "+ q[f]);
			f = (f+1)%size;
			count--;
		}
	}
	
	public void display()
	{
		int f1 = f;
		if(count == 0)
		{
			System.out.println("Nothing To Display");
		}
		else
		{
			for(int i=1; i<=count; i++)
			{
				System.out.print(q[f1]+ " ");
				f1 = (f1+1)%size;
			}
			System.out.println("");
		}
	}
}
