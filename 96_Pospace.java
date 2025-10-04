package demo;

public class Q1_pospace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello how are you? I am working in HCL", s2;

int pos = 0,k=0,c=0;

while(pos != -1) {
	pos = s.indexOf(" ",k);
	System.out.println("Position = " + pos);
	k=pos + 1;
	c= c + 1;
	
}
System.out.println("The number of words = " + c + " last pos = " + pos);
	
	}

}
