package assisent;

public class Q3_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "I am working in HCL, Bengaluru";
char ch = 'a';

int poa = 0, k = 0, c = 0;

while (poa != -1) {
	poa = s.indexOf(ch, k);
	if(poa != -1 ) {
		System.out.println("Position = " + poa);
		c = c + 1;
		k = poa + 1;
	}

	}
System.out.println("Number of time the character " + ch + "is appearing is " + c);
	}
	}


