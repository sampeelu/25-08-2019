import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TestingConceptsA {
	static long lcm;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number.");
		long n1 = sc.nextLong();
		System.out.println("Enter 2nd number.");
		long n2 = sc.nextLong();
		long lcmOutput = lcm(n1,n2);
		System.out.println("LCM of "+n1+" and "+n2+" is "+lcmOutput);
	}
	
	public static long lcm(long n1,long n2) {
		
		lcm = n1>n2 ? n1 : n2;
		while(true) {
			if(lcm%n1==0&&lcm%n2==0) 
				break;
			else
				lcm++;
			}
		return lcm;
	}
}
