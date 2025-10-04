package Pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q74_User_interface1 {

		static public Scanner input;
		public static List<String> plist;


		
public static void add()
{
	System.out.println("Enter Product Name : ");
	String productname = input.next();
	plist.add(productname);
}
public static void display()
{
	System.out.println("Following is the Product list : ");
	for(String pn : plist)
	{
		System.out.println(pn);
	}
	System.out.println("\n \n");

}
		
		
		public static void menu() {
			// TODO Auto-generated method stub
			int choice;
			input = new Scanner(System.in);
			plist = new ArrayList<String>();
			
			
			do
			{
				System.out.println(" 1 : Add Product \n 2 : Display Product \n 3 : Exit" + "\n\nEnter Your Choice : ");
				choice = input.nextInt();
	switch(choice) 
	{
	case 1 :
		add();
		break;
	case 2 :
		display();
		break;
	case 3 :
		System.out.println("Exiting");
		break;
		
	}
	
			}
			while(choice != 3);
			}
			
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
menu();

}
}