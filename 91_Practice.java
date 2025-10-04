package Pratice;

import java.util.Scanner;

public class Q91_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Accept a number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Print multiplication table
        System.out.println("\nMultiplication Table of " + num);
        System.out.println("========================");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        sc.close();
    }
}