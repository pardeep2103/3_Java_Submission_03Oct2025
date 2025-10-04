package demo;

import java.util.Scanner;

public class Q7_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		int d1 = 0;
		int l1 = 0;
		String digit = "";
		String letter = "";
		
		for ( int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				d1++;
				digit = digit + ch;
			}
			else if(Character.isLetter(ch)) {
				l1++;
				letter = letter + ch;
			}
			}
		System.out.println("\nNumber of digits:" + d1);
		System.out.println("Following digits are present: " + digit);
		System.out.println("Number of letter:" + l1);
		System.out.println("Following letter are present: " + letter);
		//count the number of the char. neither letter nor digit
		//One more condition
		
		sc.close();
		}

	}


