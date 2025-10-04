package assisent;

import java.util.Scanner;

public class Q7_StringDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Accept string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int digitCount = 0;
        int letterCount = 0;
        String digits = "";
        String letters = "";
        
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a digit
            if (Character.isDigit(ch)) {
                digitCount++;
                digits = digits + ch;
            }
            // Check if character is a letter
            else if (Character.isLetter(ch)) {
                letterCount++;
                letters = letters + ch;
            }
        }
        
        // Output results
        System.out.println("\nNumber of digits: " + digitCount);
        System.out.println("Following digits are present: " + digits);
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Following letters are present: " + letters);
        
        sc.close();
    }
}