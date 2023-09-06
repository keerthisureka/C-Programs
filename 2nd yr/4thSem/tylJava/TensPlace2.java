import java.util.*;

public class TensPlace2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int rem, dig;
		
		for(int i=n1; i<=n2; i++) {
			if(i>99 && i<1000) {
				rem = i % 100;
				dig = rem / 10;
				if(dig == 2)
					System.out.print(i + " ");
			}
		}
	}
}

// Take the nos from the given range, print all the three digit nos who have 2 in their tens place.
