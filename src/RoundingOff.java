import java.util.Scanner;

public class RoundingOff {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter decimal number");
	float input = s.nextFloat();
	System.out.println(RoundingOff.Round(input));
	}
	public static int Round(float numberToRound)
	{ 
		return (int)( numberToRound + 0.5);
	}  
}
