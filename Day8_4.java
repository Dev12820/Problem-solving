import java.util.*;
public class Day8_4 {
private static void BalancedNumber(String s)
{
	int Leftsum = 0;
	int Rightsum = 0;
	
	for(int i = 0; i < s.length() / 2; i++)
	{

		Leftsum += (int)(s.charAt(i) - '0');
		Rightsum += (int)(s.charAt(
			s.length() - 1 - i) - '0');
	}
	
	if (Leftsum == Rightsum)
		System.out.println("Balanced");
	else
		System.out.println("Not Balanced");
}

// Driver Code
public static void main (String[] args)
{
	String s = "12321";
	
	// Function call
	BalancedNumber(s);
}
}
