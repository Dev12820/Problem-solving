import java.util.*;
import java.lang.*;
public class Day8_2 {
	public static int kthdigit(int a, int b, int k)
	{

		int p = (int)Math.pow(a, b);

		int count = 0;
		while (p > 0 && count < k) {
			int rem = p % 10;
			count++;
			if (count == k)
				return rem;
			p = p / 10;
		}

		return 0;
	}
	public static void main(String argc[]) {
		int a = 5, b = 2;
		int k = 1;
		System.out.println(kthdigit(a, b, k));
	}
	
}   
}
