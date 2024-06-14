package com.implementing.linearQueue;

import java.util.Scanner;

public class CreateLinearQueue {
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	
	private Scanner scan = new Scanner(System.in);
	
	public CreateLinearQueue(int n)
	{
		q = new int[n];
		size = q.length;
	}
	
	public void insert()
	{
		if(r == size-1)
		{
			System.out.println("Insertion Is Not Possible");
		}
		else
		{
			System.out.println("Enter The Element");
			int elem = scan.nextInt();
			++r;
			q[r] = elem;
		}
	}
	
	public void delete()
	{
		if(r == -1 || f > r)
		{
			System.out.println("Deletion IS Not Possible");
		}
		else
		{
			System.out.println("Element Deleted Is: "+ q[f]);
			++f;
		}
	}
	
	public void display()
	{
		if(r == -1 || f > r)
		{
			System.out.println("Nothing To Display");
		}
		else
		{
			for(int i=f; i<=r; i++)
			{
				System.out.print(q[i]+ " ");
			}
			System.out.println("");
		}
	}
}
