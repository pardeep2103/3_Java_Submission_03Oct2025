package assisent;

import java.util.Scanner;

public class do_whileQ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Input character to search
        System.out.print("Enter a character to search: ");
        char ch = scanner.next().charAt(0);

        int poa = 0, k = 0, c = 0;

        while (poa != -1) {
            poa = s.indexOf(ch, k);
            if (poa != -1) {
                System.out.println("Position = " + poa);
                c = c + 1;
                k = poa + 1;
            }
        }

        System.out.println("Number of times the character '" + ch + "' is appearing is " + c);
        scanner.close();
    }
}
