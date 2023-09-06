package tyljava;
import java.util.*;

public class TwinPrime {
	static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lb = sc.nextInt();
		int ub = sc.nextInt();
		
		for(int i=lb; i<ub-1; i++) {
			if(i>1 && isPrime(i) && isPrime(i+2))
				System.out.print("(" + i + "," + (i+2) + ") ");
		}
	}
}

// Two prime numbers whose difference is two are called twin primes.