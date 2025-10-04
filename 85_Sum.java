package assisent;

public class Q1_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = "526703";
		String num2 = "938501";

		int digit1, digit2, sum;
		for (int i = 0; i < 6; i++) {
			 digit1 = num1.charAt(i) - '0';
			 digit2 = num2.charAt(i) - '0';
 sum = digit1 + digit2;
System.out.println("Sum of Position-" +(i+1) + " digits " +  digit1 + " and " + digit2 + " = " + sum );

		}
		
	}

}
