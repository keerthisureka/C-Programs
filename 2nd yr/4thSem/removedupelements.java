package tyljava;

import java.util.*;
public class removedupelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int temp[] = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n-1];
		for(int i=0; i<j; i++) {
			a[i] = temp[i];
		}
		System.out.println(j);
	}
}
//Bheem has N friends. And he has a ladoo for each day. Given an Array A[] denoting on which day ith friend wants a ladoo.
//If Bheem is unable to give a ladoo to a friend, he loses his friendship with them. Find out the maximum number of Friends he can have at the end.
//N = 5                        A[] = {3, 3, 1, 2, 4}
//Output: 4 {As he is unable to give a ladoo to friend 5}