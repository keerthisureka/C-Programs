import java.util.*;

public class SumOfEvenNosDivisibleBy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			if(i%2 == 0 && i%3 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}

// Find the sum of even nos which are divisible by 3 from 0 to n(n as input).
