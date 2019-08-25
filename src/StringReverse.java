import java.util.Scanner;

public class StringReverse {
	
public static void main(String args[]) {
	char[] c1 = "Samyak".toCharArray();
	char[] c2 = new char[c1.length];
	for(int i=0;i<c1.length;i++) {
		c2[i] = c1[c1.length-i-1];
	}
	System.out.println(new String(c2));
}
	
}
