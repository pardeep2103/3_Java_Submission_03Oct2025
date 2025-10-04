package Pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q67_user_interface {
	static List<String> plist;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
menu();

	}

	public static void menu() {
		// TODO Auto-generated method stub
		int choice;
		String productname;
		Scanner input = new Scanner(System.in);
	plist = new ArrayList<String>();
		
		do
		{
			System.out.println(" 1 : Add Product \n 2 : Display Product \n 3 : Exit" + "\n\nEnter Your Choice : ");
			choice = input.nextInt();
switch(choice) 
{
case 1 :
	System.out.println("Enter Product Name : ");
	productname = input.next();
	plist.add(productname);
	break;
case 2 :
	System.out.println("Following is the Product List");
	for(String pn : plist)
	{
		System.out.println(pn);
	}
	System.out.println("\n \n");
	break;
case 3 :
	System.out.println("Exiting");
	break;
	
}
		}
		while(choice != 3);
		}
		
}
