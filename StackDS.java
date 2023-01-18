package datastructure;

import java.util.Scanner;

public class StackDS {
	
	
	
	public static void main(String[] args) {
		   
		StackDS obj=new StackDS();
		
		while(true) {
			System.out.println("\nEnter your choice \n1.Push\n2.Pop\n3.Display\n4.Exit");
			Scanner nu=new Scanner(System.in);
			ch=nu.nextInt();
			
			switch(ch) {
			case 1:{
				System.out.println("Enter Element:");
				obj.element=nu.nextInt();
				obj.push(obj.element);
				break;
			}
			case 2:{
				System.out.printf("popped element is : "+obj.element,obj.pop());
				break;
			}
			
			case 3:{
				obj.display(obj.st,obj.top);
				break;
			}
			case 4:{
				System.exit(0);
			}
			default:{
				System.out.println("Wrong Option");
			}
			}
		}
	}
	
	static int ch;
	int element,maxsize,top;
	int[] st;
	
	public StackDS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size");
		maxsize = sc.nextInt();
		st = new int[maxsize];
		top =-1;
	
	}
	
	public void push(int element) {
		top++;
		st[top] = element;
	}

	public int pop() {
		if(top==-1) {
			System.out.println("overflow");
			return(-1);
		}
		return(st[top--]);
	}
	
	public void display(int[] st, int maxsize)
	{
		int i;
		System.out.println("stack Elements: ");
		for(i=0;i<=maxsize;i++) {
			System.out.println(st[i]);
			
		}
	}
	
	
}
