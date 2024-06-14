package com.implementing.stack;

import java.util.Scanner;

public class CreateStack {
	private int s[];
	private int size;
	private int top = -1;
	
	private Scanner scan = new Scanner(System.in);
	
	public CreateStack(int n)
	{
		s = new int[n];
		size = s.length;
	}
	
	public void push()
	{
		if(top == size-1)
		{
			System.out.println("Push Is Not Possible");
		}
		else
		{
			System.out.println("Enter The Element");
			int elem = scan.nextInt();
			++top;
			s[top] = elem;
		}
	}
	
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Pop Is Not Possible");
		}
		else
		{
			System.out.println("Element Deleted IS: "+ s[top]);
			--top;
		}
	}
	
	public void display()
	{
		if(top == -1)
		{
			System.out.println("Nothing To Display");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.print(s[i]+ " ");
			}
			System.out.println("");
		}
	}
}
