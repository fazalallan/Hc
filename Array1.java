package datastructure;

import java.util.Scanner;

public class Array1 {
	Scanner sc = new Scanner(System.in);
	int i,j,x;
		void sort(int a[]) {
			
		
	for( i =0;i<a.length;i++) {
		for( j=i;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
			 x = a[i];
			a[i] = a[j];
			a[j] = x;
			}
			
		}
	}
	for(int b:a) {
		System.out.println(b);
	     }
	}
		 
		 void sortDes(int a[])
			{
								
				for( i =0;i<a.length;i++) {
					for( j=i;j<a.length;j++)
					{
						if(a[i]<a[j])
						{
						x=a[i];
						a[i]=a[j];
						a[j]=x;
						}
					}
				}
				for(int b:a) {
					System.out.println(b);
				}
			}

	void deleteArray(int a[]) {
		
		System.out.println("Enter an element to delete");
		int d = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(d==a[i]) {
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}break;
			}
		}
		System.out.println("An element is Deleted" +d);
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}
	
		 
		 
		 
}

	
	



