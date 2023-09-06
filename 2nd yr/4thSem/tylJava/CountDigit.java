import java.util.*;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dig = sc.nextInt();
		int temp = n, c = 0;
		
		while(temp>0) {
			int d = temp % 10;
			if(d==dig)
				c++;
			temp /= 10;
		}
		System.out.println(dig + " occurs: " + c + " times");
	}
}

// Display the count of a given digit.
