package datastructure;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1.Insert at last ");
		System.out.println("2.Insert at First ");
		System.out.println("3.Insert At Position");
		System.out.println("4.Delete at Last ");
		System.out.println("5.Count ");
		System.out.println("6.Delete At First ");
		System.out.println("7.Delete At Position ");
		System.out.println("8.Display LinkedList ");
		
		//MyCircularSinglyLinkedList m1 = new MyCircularSinglyLinkedList();
				MyLinkedList m1=new MyLinkedList();
				int choice = sc.nextInt();
				
				do
				{
					switch(choice)
					{
					case 1:
						System.out.println("Enter Data");
						int data1=sc.nextInt();
						m1.insertAtLast(data1);
						break;
						
					case 2:
						System.out.println("Enter Data");
						int data2=sc.nextInt();
						m1.insertAtFirst(data2);
						break;
						
					case 3:
						System.out.println("Enter Data & position");
						int data3=sc.nextInt();
						int pos1 = sc.nextInt();
						m1.insertAtPosition(data3,pos1);
						break;
						
					case 4:
						m1.deleteAtLast();
						break;
						
					case 5:
						System.out.println(m1.getCount());
						break;
						
					case 6:
						m1.deleteAtFirst();
						break;
						
					case 7:
						System.out.println("Enter your Position");
						int pos2=sc.nextInt();
						m1.deleteAtPosition(pos2);
						break;
						
					case 8:
						m1.display();
						break;
						
					default :
						System.out.println("Invalid choice plz try again!!");
						break;
					}
					
					System.out.println("choice");
					choice=sc.nextInt();
				}
				while(choice!=0);
	}

}
