package datastructure;

import java.util.Scanner;

public class Array {
	
	public static void main(String [] args) {
	
	Array1 ay = new Array1();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size=sc.nextInt();
	int [] a=new int [size];
	System.out.println("Enter the Element to an array");
	for(int i=0;i<a.length;i++)
	{
		
		a[i]=sc.nextInt();
	}
	
	System.out.println("The elements in thr array are:" );
	for(int j=0;j<a.length;j++)
	{
		
		System.out.println(a[j]);
	}
	System.out.println("The length of array size is : " +a.length);
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter your choice:");
	System.out.println("1.Sort Array In Assending Order");
	System.out.println("2.Sort Array In Descending Order");
	System.out.println("3.Delete an element from Array");
	System.out.println("4.Display Array Elements");
	int choice = Sc.nextInt();
	
	do
	{
		
	switch(choice)
	{
	case 1:
	    System.out.println("Array Sorted in Assending Order");
	  	ay.sort(a);
	  	break;
	  	
	case 2:
		System.out.println("Array Sorted In Descending Order");
		ay.sortDes(a);
		break;
		
	case 3:
	
		ay.deleteArray(a);
		break;
		
	default:
		System.out.println("Invalid Option...,Plz Enter Valid Option!!!!");
	
	}
	System.out.println("choice");
	choice=sc.nextInt();
	

}while(choice!=0);
	

		
	
}
	
}
