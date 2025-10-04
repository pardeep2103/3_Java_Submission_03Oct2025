package assisent;
public class Q2_Sum_left_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = "93850121";
		String num2 = "52670321";

		int digit1, digit2, sum;
		for (int i = 0; i < 8; i++) {
			char  c1 = num1.charAt(i);
			digit1 = Character.getNumericValue(c1);
			char  c2 = num2.charAt(7 - i);
			digit2 = Character.getNumericValue(c2);
 sum = digit1 + digit2;
System.out.println("Sum of Position-" +(i+1) + " digits " +  digit1 + " and " + digit2 + " = " + sum );

		}
		
	}

}
